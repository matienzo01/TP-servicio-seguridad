package modelo;

public abstract class Abonado
{
    public abstract double  getBonificacion();
    public abstract void avanzaMes();
    public void pagarFactura() {
    	//busca en el arreglo de facturas y la marca como paga
    }
}
