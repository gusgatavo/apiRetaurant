package cl.prueba.tecnica.dao;

import java.util.Date;
import java.util.List;

import cl.prueba.tecnica.dto.RespuestaRest;
import cl.prueba.tecnica.dto.Venta;

public interface VentasDao {

	public RespuestaRest doVenta(Venta venta);
	
	public RespuestaRest endVenta(Integer idVenta);

	public Venta getVenta(Integer idVenta);

	public List<Venta> getVentasActivas();

	public List<Venta> getVentasDia(Date dia);

}
