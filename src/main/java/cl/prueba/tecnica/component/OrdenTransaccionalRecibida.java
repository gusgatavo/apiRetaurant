package cl.prueba.tecnica.component;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import cl.prueba.tecnica.constant.ConstantS;
import cl.prueba.tecnica.dto.Venta;

@Component
public class OrdenTransaccionalRecibida {

	private static final Log LOG = LogFactory.getLog(OrdenTransaccionalRecibida.class);

	/**
	 * Con la atonación la aplicación se conecta a la cola que se indique.
	 * Al no tener una configurada la aplicación no se despliega,
	 * por ende se procede a comentar línea con la anotación 
	 * @param ventas
	 */
//	@JmsListener(destination = ConstantS.QUEUE, containerFactory = "myFactory")
	public void rescatarMensaje(List<Venta> ventas) {
		LOG.info("Se esta ejecutando, el rescate de los mensajes desde la Cola MQ");
		// Se tiene que colocar la acción a realizar con la información rescatada desde
		// la cola MQ
	}

}
