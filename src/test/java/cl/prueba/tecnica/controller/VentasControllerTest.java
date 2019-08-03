package cl.prueba.tecnica.controller;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import cl.prueba.tecnica.dao.VentasDao;
import cl.prueba.tecnica.dto.DetalleVenta;
import cl.prueba.tecnica.dto.RespuestaRest;
import cl.prueba.tecnica.dto.Venta;

@RunWith(MockitoJUnitRunner.class)
public class VentasControllerTest {

	
	@Mock
	private VentasDao dao;
	
	@InjectMocks
	private VentasController controller;
	
	@Test
	public void doVentaTest() {
		Venta venta = getVenta();
		
		RespuestaRest respuestaRest = getRespuestaRest();
		
		Mockito.when(dao.doVenta(Mockito.any())).thenReturn(respuestaRest);
		
		Assert.assertEquals(controller.doVenta(venta), respuestaRest);
	}
	
	@Test
	public void getVentaTest() {
		Mockito.when(dao.getVenta(Mockito.anyInt())).thenReturn(getVenta());
		Assert.assertNotNull(controller.getVenta(1));
	}
	
	@Test
	public void getVentasActivasTest() {
		List<Venta> lstVentas = new ArrayList<>();
		lstVentas.add(getVenta());
		Mockito.when(dao.getVentasActivas()).thenReturn(lstVentas);
		Assert.assertNotNull(controller.getVentasActivas());
	}
	
	@Test
	public void getVentasDiaTest() {
		List<Venta> lstVentas = new ArrayList<>();
		lstVentas.add(getVenta());
		Mockito.when(dao.getVentasDia(Mockito.any())).thenReturn(lstVentas);
		Assert.assertNotNull(controller.getVentasDia(getVenta()));
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

	private RespuestaRest getRespuestaRest() {
		RespuestaRest respuestaRest = new RespuestaRest();
		respuestaRest.setCodido(200);
		respuestaRest.setDescricion("OK");
		return respuestaRest;
	}

}
