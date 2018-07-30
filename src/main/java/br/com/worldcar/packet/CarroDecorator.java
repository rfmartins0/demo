package br.com.worldcar.packet;

public class CarroDecorator implements ComponenteCarro {

	public ComponenteCarro componenteCarro;

	public CarroDecorator(ComponenteCarro componenteCarro) {
		this.setComponenteCarro(componenteCarro);
	}

	@Override
	public String getIdComponente() {
		return "XYSYSYSSS";
	}

	private void setComponenteCarro(ComponenteCarro componenteCarro) {
		this.componenteCarro = componenteCarro;
	}

}