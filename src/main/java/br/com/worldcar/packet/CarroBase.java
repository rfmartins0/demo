package br.com.worldcar.packet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "carrobase")
public class CarroBase implements ComponenteCarro {
	
	private CarroBase(){
		
	}
	
	public static CarroBase constroi(){
		return new CarroBase();
	}

	@Override
	public String getIdComponente() {
		return "FGFGFDRDRDR";
	}
	
	public String toString(){
		return "Carro Base";	
	}

}