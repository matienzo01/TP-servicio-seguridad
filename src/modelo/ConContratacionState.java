package modelo;

public class ConContratacionState implements IState {
	
	private Persona_Fisica persona;

	public ConContratacionState(Persona_Fisica persona) {
		this.persona = persona;
	}

	public void contratarServicio() {
		// TODO Auto-generated method stub

	}

	public void darBajaServicio() {
		// TODO Auto-generated method stub
		//algun chequeo
		this.persona.setState(new SinContratacionState(this.persona));
	}

	public void pagarFactura(Factura f) {
		// TODO Auto-generated method stub
		
	}

}
