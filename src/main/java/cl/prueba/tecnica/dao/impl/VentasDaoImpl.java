package cl.prueba.tecnica.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import cl.prueba.tecnica.dao.VentasDao;
import cl.prueba.tecnica.dto.DetalleVenta;
import cl.prueba.tecnica.dto.RespuestaRest;
import cl.prueba.tecnica.dto.Venta;

@Service("ventasDao")
public class VentasDaoImpl implements VentasDao {

	@Override
	public RespuestaRest doVenta(Venta venta) {
		RespuestaRest respuestaRest = new RespuestaRest();
		respuestaRest.setCodido(200);
		respuestaRest.setDescricion("Venta registrada Correctamente");
		return respuestaRest;
	}

	public RespuestaRest endVenta(Integer idVenta) {
		//Se rescatara el número de la boleta
		RespuestaRest respuestaRest = new RespuestaRest();
		respuestaRest.setCodido(200);
		respuestaRest.setDescricion("Se realizo la asignación del id Boleta a la venta");
		return respuestaRest;
	}

	@Override
	public Venta getVenta(Integer idVenta) {
		return venta(idVenta);
	}

	@Override
	public List<Venta> getVentasActivas() {
		return getVentass();
	}

	@Override
	public List<Venta> getVentasDia(Date dia) {
		return getVentasDias(dia);
	}

	/**
	 * 
	 * @param idVenta
	 * @return
	 * @return
	 * @return
	 * @return una lista de ventas en Dammy
	 */
	private Venta venta(Integer idVenta) {
		List<Venta> list = getVentass();

		for (Venta venta : list) {
			if (venta.getIdVenta().equals(idVenta)) {
				return venta;
			}
		}

		return new Venta();
	}

	private List<Venta> getVentass() {
		List<Venta> list = new ArrayList<>();

		Venta v1 = new Venta();
		v1.setIdVenta(1);
		v1.setBoleta(0);
		DetalleVenta dt1V1 = new DetalleVenta();
		dt1V1.setCantidad(1);
		dt1V1.setIdDetalleVenta(1);
		dt1V1.setIdProducto(1);
		dt1V1.setTotal(9000);
		dt1V1.setValorUnitario(9000);

		DetalleVenta dt2V1 = new DetalleVenta();
		dt2V1.setCantidad(1);
		dt2V1.setIdDetalleVenta(2);
		dt2V1.setIdProducto(2);
		dt2V1.setTotal(1000);
		dt2V1.setValorUnitario(1000);

		List<DetalleVenta> detalleVentas = new ArrayList<>();
		detalleVentas.add(dt1V1);
		detalleVentas.add(dt2V1);

		v1.setDetalleVenta(detalleVentas);
		v1.setFechaVenta(new Date());
		v1.setIdMesa(1);
		v1.setPropina(0);
		v1.setTotalDescuento(0);
		v1.setTotalVenta(10000);

		Venta v2 = new Venta();
		v2.setIdVenta(2);
		v2.setBoleta(0);
		DetalleVenta dt1V2 = new DetalleVenta();
		dt1V2.setCantidad(1);
		dt1V2.setIdDetalleVenta(1);
		dt1V2.setIdProducto(1);
		dt1V2.setTotal(9000);
		dt1V2.setValorUnitario(9000);

		DetalleVenta dt2V2 = new DetalleVenta();
		dt2V2.setCantidad(1);
		dt2V2.setIdDetalleVenta(2);
		dt2V2.setIdProducto(2);
		dt2V2.setTotal(1000);
		dt2V2.setValorUnitario(1000);

		List<DetalleVenta> detalleVentas2 = new ArrayList<>();
		detalleVentas2.add(dt1V2);
		detalleVentas2.add(dt2V2);

		v2.setDetalleVenta(detalleVentas2);
		v2.setFechaVenta(new Date());
		v2.setIdMesa(1);
		v2.setPropina(0);
		v2.setTotalDescuento(0);
		v2.setTotalVenta(10000);

		list.add(v1);
		list.add(v2);

		return list;
	}

	private List<Venta> getVentasDias(Date dia) {
		List<Venta> list = getVentass();
		int boleta = 1;
		for (Venta venta : list) {
			if (venta.getFechaVenta().equals(dia)) {
				venta.setBoleta(boleta);
				list.add(venta);
			}
			boleta++;
		}
		return list;
	}

}
