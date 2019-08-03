package cl.prueba.tecnica.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import cl.prueba.tecnica.dao.UsuarioDao;
import cl.prueba.tecnica.dto.Usuario;

@RunWith(MockitoJUnitRunner.class)
public class UsuarioControllerTest {

	@Mock
	private UsuarioDao dao;

	@InjectMocks
	private UsuarioController controller;

	@Test
	public void loginTest() {
		Usuario usuario = new Usuario();
		usuario.setIdUsuairo(1);
		usuario.setNameUsuario("user");
		usuario.setPerfilUsuario(1);
		usuario.setPwsUsuario("1234");
		usuario.setToken(
				"Bearer eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiJzb2Z0dGVrSldUIiwic3ViIjoidXNlciIsImF1dGhvcml0aWVzIjpbIlJPTEVfVVNFUiJdLCJpYXQiOjE1NjQ3MTkyODIsImV4cCI6MTU2NDcxOTg4Mn0.lvDfLx59WIA54ecgkmN1OcVi5GakZS-QdYTK56Y1OsVf8oDjdrvM_thXegDT9hwcAXKLUH2LGLLYt8-7XwOO6A");
		usuario.setUserUsuario("user");
		
		Mockito.when(dao.login(usuario)).thenReturn(usuario);
		
		Assert.assertEquals(controller.login(usuario).getUserUsuario(), "user");
		
	}

}
