package modelo;

import java.util.Collection;
import java.util.Iterator;

public abstract class Servicio
{
    protected Promo promo;
    protected double costoBase;

    /**
     * @associates <{modelo.Adicional}>
     */
    private Collection adicionales;


    public Servicio(Collection adicionales, Promo promo)
    {
        this.adicionales = adicionales;
        this.promo = promo;
    }

    public double getCostoBase()
    {
        return costoBase;
    }
    
    public double getCostoAdicionales()
    {
        Iterator iter_adicionales = adicionales.iterator();
        Adicional unAdicional;
        double costoAdicional = 0.0;
        while(iter_adicionales.hasNext())
        {
            unAdicional = (Adicional)iter_adicionales.next();
            costoAdicional = costoAdicional + unAdicional.getCostoAdicional();
        }
        return costoAdicional;
    }
    
    public double getCosto()
    {
        return getCostoBase()+getCostoAdicionales()-getPromo();
    }

    public abstract double getPromo();
    

}
