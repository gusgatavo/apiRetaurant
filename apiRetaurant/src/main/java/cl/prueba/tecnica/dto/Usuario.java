package cl.prueba.tecnica.dto;

import java.io.Serializable;

public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9100167770473687986L;

	private Integer idUsuairo;
	private String nameUsuario;
	private String pwsUsuario;
	private Integer perfilUsuario;
	private String token;

	public Integer getIdUsuairo() {
		return idUsuairo;
	}

	public void setIdUsuairo(Integer idUsuairo) {
		this.idUsuairo = idUsuairo;
	}

	public String getNameUsuario() {
		return nameUsuario;
	}

	public void setNameUsuario(String nameUsuario) {
		this.nameUsuario = nameUsuario;
	}

	public String getPwsUsuario() {
		return pwsUsuario;
	}

	public void setPwsUsuario(String pwsUsuario) {
		this.pwsUsuario = pwsUsuario;
	}

	public Integer getPerfilUsuario() {
		return perfilUsuario;
	}

	public void setPerfilUsuario(Integer perfilUsuario) {
		this.perfilUsuario = perfilUsuario;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
