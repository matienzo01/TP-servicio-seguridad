package modelo;

public class Efectivo extends Deco_Medio_Pago
{

    protected Pago pago;


    public Efectivo(Factura factura, Deco_Medio_Pago medio_de_pago, Pago pago)
    {
        // TODO Implement this method
        super(factura, medio_de_pago);
        this.pago = pago;
    }

    @Override
    public double getMontoPago()
    {
        double bonificacion = pago.getFactura().getContrato().getAbonado().getBonificacion();
        //TODO: Guille, si la bonificación hubiera sido un monto 
        //independiente de la cantidad de contrataciones 
        //hubiera sido más simple el cálculo
        double monto = pago.getFactura().getCostoContrato();
        // TODO Implement this method
        // monto se recalcula en base a la bonificación.
        return monto * 0.8 * (1-bonificacion);//por ser efectivo
    }
}
