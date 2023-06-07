package modelo;

public class Monitoreo_Vivienda extends Servicio
{
    public Monitoreo_Vivienda(Adicional adicional, Promo promo)
    {
        super(adicional, promo);
        super.costoBase = 8500;
    }
    
    @Override
    public double getPromo()
    {
        // TODO Implement this method
        return super.promo.getPromoVivienda();
    }


}
