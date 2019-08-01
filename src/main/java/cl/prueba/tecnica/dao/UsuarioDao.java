package cl.prueba.tecnica.dao;

import org.springframework.security.core.userdetails.UserDetails;

import cl.prueba.tecnica.dto.Usuario;

public interface UsuarioDao {

	public UserDetails login(Usuario usuario);
}
