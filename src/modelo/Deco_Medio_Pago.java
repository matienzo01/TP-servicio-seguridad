package modelo;

public abstract class Deco_Medio_Pago extends Pago
{

    public Deco_Medio_Pago(Factura factura, Deco_Medio_Pago medio_de_pago)
    {
        // TODO Implement this method
        super(factura, medio_de_pago);
    }

    public abstract double getMontoPago();
    
}
