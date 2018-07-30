package br.com.worldcar;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import br.com.worldcar.controller.CarPacketController;

@Component
public class JerseyConfig extends ResourceConfig {
	
	public JerseyConfig() {
		//packages("br.com.worldcar.controller");
		register(CarPacketController.class);
	}


}
