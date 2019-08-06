package cl.prueba.tecnica.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import cl.prueba.tecnica.constant.ConstantS;
import cl.prueba.tecnica.dto.Venta;

@CrossOrigin("*")
@RestController
public class SendMenssageController {
	
	@Autowired
	public JmsTemplate jmsTemplate;

	private static final Log LOG = LogFactory.getLog(SendMenssageController.class);

	@PostMapping("/sendSolicitudVentDia")
	public ResponseEntity<String> sendSolicitudVentDia(@RequestBody Venta venta){
		LOG.info("Se esta ejecutando sendSolicitudVentDia");
		String jsonMsg = "{'fecha':'"+venta.getFechaVenta()+"'}";
		Gson json = new Gson();
		jmsTemplate.convertAndSend(ConstantS.QUEUE, json.toJson(jsonMsg));
		return ResponseEntity.status(HttpStatus.OK).body("Se ha enviado la solicitud");
	}
}
