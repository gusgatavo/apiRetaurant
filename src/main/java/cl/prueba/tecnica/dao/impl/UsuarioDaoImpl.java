package cl.prueba.tecnica.dao.impl;

import static java.util.Collections.emptyList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import cl.prueba.tecnica.dao.UsuarioDao;
import cl.prueba.tecnica.dto.Usuario;

@Service("UsuarioDao")
public class UsuarioDaoImpl implements UsuarioDao {

	private static final Log LOG = LogFactory.getLog(UsuarioDaoImpl.class);

	@Override
	public UserDetails login(Usuario usuario) {
		LOG.info("Se esta ejecutando login");
		if (usuario.getNameUsuario() == "user" && usuario.getPwsUsuario() == "1234") {
			return new User(usuario.getNameUsuario(), usuario.getPwsUsuario(), emptyList());
		} else {
			throw new UsernameNotFoundException(usuario.getNameUsuario());
		}
	}
}
