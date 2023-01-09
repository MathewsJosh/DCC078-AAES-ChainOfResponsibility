package padroescomportamentais.chainofresponsability;

public class TipoCasoTrafico implements TipoCaso {

    private static TipoCasoTrafico tipoCasoTrafico = new TipoCasoTrafico();

    private TipoCasoTrafico() {};

    public static TipoCasoTrafico getTipoCasoTrafico() {
        return tipoCasoTrafico;
    }
}
