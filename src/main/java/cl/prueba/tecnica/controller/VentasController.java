package cl.prueba.tecnica.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cl.prueba.tecnica.dao.VentasDao;
import cl.prueba.tecnica.dto.RespuestaRest;
import cl.prueba.tecnica.dto.Venta;

@CrossOrigin("*")
@RestController
public class VentasController {

	
	private static final Log LOG = LogFactory.getLog(VentasController.class);
	
	@Autowired
	@Qualifier("ventasDao")
	private VentasDao ventaDao;
	
	@PostMapping("/doVenta")
	public RespuestaRest doVenta(@RequestBody Venta venta) {
		LOG.info("Se esta ejecutando doVenta");
		return ventaDao.doVenta(venta);
	}
	
	@GetMapping("/getVenta/{idVenta}")
	public Venta getVenta(@PathVariable Integer idVenta) {
		return ventaDao.getVenta(idVenta);
	}

	@GetMapping("/getVentasActivas")
	public List<Venta> getVentasActivas(){
		return ventaDao.getVentasActivas();
	}

	@PostMapping("/getVentasDia")
	public List<Venta> getVentasDia(@RequestBody Venta venta){
		return ventaDao.getVentasDia(venta.getFechaVenta());
	}
}

