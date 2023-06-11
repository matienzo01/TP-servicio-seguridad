package modelo;

public interface IState {
	public void pagarFactura(Factura f);
	public void contratarServicio();
	public void darBajaServicio();
}
