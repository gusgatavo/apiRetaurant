package cl.prueba.tecnica.controller.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import cl.prueba.tecnica.dao.impl.VentasDaoImpl;
import cl.prueba.tecnica.dto.DetalleVenta;
import cl.prueba.tecnica.dto.Venta;

@RunWith(MockitoJUnitRunner.class)
public class VentasDaoImplTest {

	@InjectMocks
	private VentasDaoImpl daoImpl;

	@Test
	public void doVentaTest() {
		Assert.assertEquals("Venta registrada Correctamente", daoImpl.doVenta(getVenta()).getDescricion());
	}

	@Test
	public void endVentaTest() {
		Assert.assertEquals("Se realizo la asignación del id Boleta a la venta", daoImpl.endVenta(1).getDescricion());
	}

	@Test
	public void getVentaTest() {
		Assert.assertNotNull(daoImpl.getVenta(1));
	}

	@Test
	public void getVentasActivasTest() {
		Assert.assertNotNull(daoImpl.getVentasActivas());
	}

	private Venta getVenta() {
		Venta venta = new Venta();
		venta.setBoleta(0);

		DetalleVenta detalleVenta = new DetalleVenta();
		detalleVenta.setCantidad(1);
		detalleVenta.setIdDetalleVenta(1);
		detalleVenta.setIdProducto(1);
		detalleVenta.setTotal(1);
		detalleVenta.setValorUnitario(100);

		List<DetalleVenta> lstDetalleVenta = new ArrayList<>();
		lstDetalleVenta.add(detalleVenta);

		venta.setDetalleVenta(lstDetalleVenta);
		venta.setFechaVenta(new Date());
		venta.setIdMesa(1);
		venta.setIdVenta(0);
		venta.setPropina(0);
		venta.setTotalDescuento(0);
		venta.setTotalVenta(0);
		return venta;
	}
}
