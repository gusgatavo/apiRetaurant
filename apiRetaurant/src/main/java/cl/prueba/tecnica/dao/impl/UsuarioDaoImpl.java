package cl.prueba.tecnica.dao.impl;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Service;

import cl.prueba.tecnica.dao.UsuarioDao;
import cl.prueba.tecnica.dto.Usuario;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service("UsuarioDao")
public class UsuarioDaoImpl implements UsuarioDao {

	private static final Log LOG = LogFactory.getLog(UsuarioDaoImpl.class);
	
	@Override
	public Usuario login(Usuario usuario) {
		LOG.info("Se esta ejecutando login");
		if(usuario.getNameUsuario()=="user" && usuario.getPwsUsuario()=="1234") {
			usuario.setToken(getJWTToken(usuario));
			usuario.setPwsUsuario("");
		}
		return usuario;
	}

	private String getJWTToken(Usuario user) {
		String key = "pruebaTecnica1321";
		List<GrantedAuthority> authorities = AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER");

		String tk = Jwts.builder().setId("softtekJWT").setSubject(user.getNameUsuario())
				.claim("authorities",
						authorities.stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 600000))
				.signWith(SignatureAlgorithm.HS512, key.getBytes()).compact();

		return "Bearer " + tk;
	}
}
