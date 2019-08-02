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

@Service("usuarioDao")
public class UsuarioDaoImpl implements UsuarioDao {

	private static final Log LOG = LogFactory.getLog(UsuarioDaoImpl.class);
	
	@Override
	public Usuario login(Usuario usuario) {
		LOG.info("Se esta ejecutando login");
		if("user".equals(usuario.getNameUsuario()) && "1234".equals(usuario.getPwsUsuario())) {
			String token = getJWTToken(usuario.getNameUsuario());
			usuario.setToken(token);
			usuario.setPwsUsuario("");
		}else {
			usuario.setNameUsuario("");
		}
		return usuario;
	}
	
	
	private String getJWTToken(String username) {
		String secretKey = "mySecretKey";
		List<GrantedAuthority> grantedAuthorities = AuthorityUtils
				.commaSeparatedStringToAuthorityList("ROLE_USER");
		
		String token = Jwts
				.builder()
				.setId("softtekJWT")
				.setSubject(username)
				.claim("authorities",
						grantedAuthorities.stream()
								.map(GrantedAuthority::getAuthority)
								.collect(Collectors.toList()))
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 600000))
				.signWith(SignatureAlgorithm.HS512,
						secretKey.getBytes()).compact();

		return "Bearer " + token;
	}
}
