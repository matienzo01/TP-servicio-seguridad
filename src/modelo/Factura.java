package modelo;

import java.util.Date;

public class Factura
{
    private Date fecha;
    private Contrato contrato;

    public double getCostoContrato()
    {
        return this.contrato.getCostoContrato();
        
    }

    public void setFecha(Date fecha)
    {
        this.fecha = fecha;
    }

    public Date getFecha()
    {
        return fecha;
    }

    public void setContrato(Contrato contrato)
    {
        this.contrato = contrato;
    }

    public Contrato getContrato()
    {
        return contrato;
    }
}
