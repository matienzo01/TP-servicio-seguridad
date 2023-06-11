package modelo;

public class SinContratacionState implements IState {
	private Persona_Fisica persona;

	public SinContratacionState(Persona_Fisica persona) {
		this.persona = persona;
	}

	public void pagarFactura(Factura f) {
		// TODO Auto-generated method stub
		
	}

	public void contratarServicio() {
		// TODO Auto-generated method stub
		this.persona.setState(new ConContratacionState(this.persona));
	}

	public void darBajaServicio() {
		// TODO Auto-generated method stub
		
	}

}
