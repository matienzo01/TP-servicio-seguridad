package modelo;

public class Persona_Fisica extends Abonado
{
	private IState state = new SinContratacionState(this);
	
    @Override
    public double getBonificacion()
    {
        // TODO Implement this method
        return 0.0;
    }

	public void setState(IState state) {
		this.state = state;
	}
	
	private void actualizaEstado() {
		//chequeo de meses y eso
		this.state = new MorosoState(this);
	}

	@Override
	public void avanzaMes() {
		this.actualizaEstado();
	}
	
	@Override
	public void pagarFactura() {
		//buscas la factura
		Factura f = null;
		this.state.pagarFactura(f);
	}
}
