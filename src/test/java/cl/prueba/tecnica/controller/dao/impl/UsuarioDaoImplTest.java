package cl.prueba.tecnica.controller.dao.impl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import cl.prueba.tecnica.dao.impl.UsuarioDaoImpl;
import cl.prueba.tecnica.dto.Usuario;

@RunWith(MockitoJUnitRunner.class)
public class UsuarioDaoImplTest {

	@InjectMocks
	private UsuarioDaoImpl daoImpl;
	
	@Test
	public void loginTest() {
		Assert.assertNotNull(daoImpl.login(getUsuario()));
	}

	private Usuario getUsuario() {
		Usuario usuario = new Usuario();
		usuario.setIdUsuairo(1);
		usuario.setNameUsuario("user");
		usuario.setPerfilUsuario(1);
		usuario.setPwsUsuario("1234");
		usuario.setToken(
				"Bearer eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiJzb2Z0dGVrSldUIiwic3ViIjoidXNlciIsImF1dGhvcml0aWVzIjpbIlJPTEVfVVNFUiJdLCJpYXQiOjE1NjQ3MTkyODIsImV4cCI6MTU2NDcxOTg4Mn0.lvDfLx59WIA54ecgkmN1OcVi5GakZS-QdYTK56Y1OsVf8oDjdrvM_thXegDT9hwcAXKLUH2LGLLYt8-7XwOO6A");
		usuario.setUserUsuario("user");
		
		return usuario;
	}
}
