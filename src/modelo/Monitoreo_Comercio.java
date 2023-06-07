package modelo;

public class Monitoreo_Comercio extends Servicio
{

    public Monitoreo_Comercio(Adicional adicional, Promo promo)
    {
        super(adicional, promo);
        super.costoBase = 10000;
    }

    @Override
    public double getPromo()
    {
        // TODO Implement this method
        return super.promo.getPromoComercio();
    }

}
