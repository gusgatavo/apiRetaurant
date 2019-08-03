package cl.prueba.tecnica.dto;

import java.io.Serializable;

public class DetalleVenta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5206937274846947022L;

	private Integer idDetalleVenta;
	private Integer idProducto;
	private Integer cantidad;
	private Integer valorUnitario;
	private Integer total;

	public Integer getIdDetalleVenta() {
		return idDetalleVenta;
	}

	public void setIdDetalleVenta(Integer idDetalleVenta) {
		this.idDetalleVenta = idDetalleVenta;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Integer valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

}
