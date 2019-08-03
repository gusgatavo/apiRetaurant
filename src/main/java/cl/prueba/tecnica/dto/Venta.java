package cl.prueba.tecnica.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Venta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6924872788454401256L;

	private Integer idVenta;
	private Integer boleta;
	private Date fechaVenta;
	private Integer idMesa;
	private List<DetalleVenta> detalleVenta;
	private Integer totalDescuento;
	private Integer propina;
	private Integer totalVenta;
	public Integer getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(Integer idVenta) {
		this.idVenta = idVenta;
	}
	public Integer getBoleta() {
		return boleta;
	}
	public void setBoleta(Integer boleta) {
		this.boleta = boleta;
	}
	public Date getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	public Integer getIdMesa() {
		return idMesa;
	}
	public void setIdMesa(Integer idMesa) {
		this.idMesa = idMesa;
	}
	public List<DetalleVenta> getDetalleVenta() {
		return detalleVenta;
	}
	public void setDetalleVenta(List<DetalleVenta> detalleVenta) {
		this.detalleVenta = detalleVenta;
	}
	public Integer getTotalDescuento() {
		return totalDescuento;
	}
	public void setTotalDescuento(Integer totalDescuento) {
		this.totalDescuento = totalDescuento;
	}
	public Integer getPropina() {
		return propina;
	}
	public void setPropina(Integer propina) {
		this.propina = propina;
	}
	public Integer getTotalVenta() {
		return totalVenta;
	}
	public void setTotalVenta(Integer totalVenta) {
		this.totalVenta = totalVenta;
	}


}
