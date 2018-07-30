package br.com.worldcar.packet;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "sensorre")
public class SensorRe extends CarroDecorator {
	
	private SensorRe(ComponenteCarro arma, boolean displayLed) {
		super(arma);
		this.setDisplayLed(displayLed);
	}
	
	public static SensorRe plus(ComponenteCarro arma, boolean displayLed){
		return new SensorRe(arma, displayLed);
	}
	
    @XmlElement(name="displayLed")
    private boolean displayLed;


	public boolean isDisplayLed() {
		return displayLed;
	}
	
	private void setDisplayLed(boolean displayLed){
		this.displayLed = displayLed;
	}


	@Override
	public String getIdComponente() {
		return "OPOPOPOPOPOA";
	}
	
	public String toString(){
		return "Sensor de Ré, display: " + this.isDisplayLed();	
	}

}