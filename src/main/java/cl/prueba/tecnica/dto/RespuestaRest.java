package cl.prueba.tecnica.dto;

import java.io.Serializable;

public class RespuestaRest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4832585985353631987L;

	private Integer codido;
	private String descricion;

	public Integer getCodido() {
		return codido;
	}

	public void setCodido(Integer codido) {
		this.codido = codido;
	}

	public String getDescricion() {
		return descricion;
	}

	public void setDescricion(String descricion) {
		this.descricion = descricion;
	}

}
