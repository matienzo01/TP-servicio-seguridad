package modelo;

public abstract class Pago
{  
    private Factura factura;
    private Deco_Medio_Pago medio_de_pago;
    
    public Pago(Factura factura, Deco_Medio_Pago medio_de_pago)
    {
        this.factura = factura;
        this.medio_de_pago = medio_de_pago;
    }

    public void setMedio_de_pago(Deco_Medio_Pago medio_de_pago)
    {
        this.medio_de_pago = medio_de_pago;
    }

    public Deco_Medio_Pago getMedio_de_pago()
    {
        return medio_de_pago;
    }

    public void setFactura(Factura factura)
    {
        this.factura = factura;
    }

    public Factura getFactura()
    {
        return factura;
    }

    public abstract double getMontoPago();

}
