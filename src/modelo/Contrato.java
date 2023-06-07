package modelo;

import java.util.Collection;
import java.util.Iterator;

public class Contrato
{
    private Abonado abonado;

    /**
     * @associates <{modelo.Servicio}>
     */
    private Collection servicios_contratados;

    public double getCostoContrato()
    {
        double costo = 0.0;
        Iterator iter_servicios_contratados = servicios_contratados.iterator();
        while (iter_servicios_contratados.hasNext())
        {
            Servicio unServicio = (Servicio)iter_servicios_contratados.next();
            costo = costo + unServicio.getCosto();
        }
        return costo;

    }

    public void setAbonado(Abonado abonado)
    {
        this.abonado = abonado;
    }

    public Abonado getAbonado()
    {
        return abonado;
    }

    public void setServicios_contratados(Collection servicios_contratados)
    {
        this.servicios_contratados = servicios_contratados;
    }

    public Collection getServicios_contratados()
    {
        return servicios_contratados;
    }
}
