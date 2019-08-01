package cl.prueba.tecnica.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cl.prueba.tecnica.dao.UsuarioDao;
import cl.prueba.tecnica.dto.Usuario;

@RestController
public class UsuarioController {

	private static final Log LOG = LogFactory.getLog(UsuarioController.class);
	
	@Autowired
	@Qualifier("UsuarioDao")
	private UsuarioDao usuarioDao;
	
	@PostMapping("/login")
	public UserDetails login(@RequestBody Usuario usuario) {
		LOG.info("Se esta ejecutnaod Login");
		UserDetails user = usuarioDao.login(usuario);		
		return user;
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hola mundo!!!";
	}
}
