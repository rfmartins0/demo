package br.com.worldcar.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.web.bind.annotation.RestController;

import br.com.worldcar.packet.ArCondicionado;
import br.com.worldcar.packet.ComponenteCarro;
import br.com.worldcar.packet.CarroBase;
import br.com.worldcar.packet.SensorRe;

@RestController
@Path("/carro")
public class CarPacketController {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ComponenteCarro getCarroBasico() {
		ComponenteCarro carroBasico = CarroBase.constroi();
		return carroBasico;
	}
	
	@GET
	@Path("/sensor/display/{display}")
	@Produces(MediaType.APPLICATION_JSON)
	public ComponenteCarro getCarroComSensor(@PathParam("display") boolean display) {
		ComponenteCarro armaCompleta = SensorRe.plus(CarroBase.constroi(),display );
		return armaCompleta;
	}
	
	@GET
	@Path("/ar/dualzone/{dualZone}/digital/{digital}")
	@Produces(MediaType.APPLICATION_JSON)
	public ComponenteCarro getCarroComAr(@PathParam("dualZone") boolean dualZone, @PathParam("digital") boolean digital) {
		ComponenteCarro armaCompleta = ArCondicionado.plus(CarroBase.constroi(), dualZone, digital );
		return armaCompleta;
	}
	
	@GET
	@Path("/sensor/{display}/ar/dualzone/{dualZone}/digital/{digital}")
	@Produces(MediaType.APPLICATION_JSON)
	public ComponenteCarro getCarroCompleto(@PathParam("display") boolean display, @PathParam("dualZone") boolean dualZone, @PathParam("digital") boolean digital) {
		ComponenteCarro armaCompleta = SensorRe.plus(ArCondicionado.plus(CarroBase.constroi(), dualZone, digital), display);
		return armaCompleta;
	}
	

}
