package br.com.worldcar.packet;

import javax.xml.bind.annotation.XmlElement;

public class ArCondicionado extends CarroDecorator {
	
	@XmlElement(name="dualZone")
    private boolean dualZone;
	
	@XmlElement(name="digital")
    private boolean digital;
	
	private ArCondicionado(ComponenteCarro arma, Boolean dualZone, Boolean digital){
		super(arma);
		this.setDualZone(dualZone);
		this.setDigital(digital);
	}


	public static ArCondicionado plus(ComponenteCarro arma, boolean dualZone, boolean digital) {
		return new ArCondicionado(arma, dualZone, digital);
	}

	@Override
	public String getIdComponente() {
		return "PWPWPEPWPWPW";
	}

	public boolean isDualZone() {
		return dualZone;
	}


	public boolean isDigital() {
		return digital;
	}


	private void setDualZone(boolean dualZone) {
		this.dualZone = dualZone;
	}


	private void setDigital(boolean digital) {
		this.digital = digital;
	}
	
	public String toString(){
		return "Arcondicionado Dualzone: " + this.isDualZone() + ", digital " + this.isDigital();	
	}


}