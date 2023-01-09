package padroescomportamentais.chainofresponsability;

public class TipoCasoFurto implements TipoCaso {

    private static TipoCasoFurto tipoCasoFurto = new TipoCasoFurto();

    private TipoCasoFurto() {};
    
    public static TipoCasoFurto getTipoCasoFurto() {
        return tipoCasoFurto;
    }

}
