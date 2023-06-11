package modelo;

public class MorosoState implements IState {
	
	private Persona_Fisica persona;

	public MorosoState(Persona_Fisica persona) {
		this.persona = persona;
	}

	public void pagarFactura(Factura f) {
		// TODO Auto-generated method stub
		System.out.println("A los gastos de " + f + " le incremetaremos un 30%");
		this.persona.setState(new ConContratacionState(persona));
	}

	public void contratarServicio() {
		// TODO Auto-generated method stub

	}

	public void darBajaServicio() {
		// TODO Auto-generated method stub

	}

}
