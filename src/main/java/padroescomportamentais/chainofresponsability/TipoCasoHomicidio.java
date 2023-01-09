package padroescomportamentais.chainofresponsability;

public class TipoCasoHomicidio implements TipoCaso {

    private static TipoCasoHomicidio tipoCasoHomicidio = new TipoCasoHomicidio();

    private TipoCasoHomicidio() {};
    
    public static TipoCasoHomicidio getTipoCasoHomicidio() {
        return tipoCasoHomicidio;
    }

}
