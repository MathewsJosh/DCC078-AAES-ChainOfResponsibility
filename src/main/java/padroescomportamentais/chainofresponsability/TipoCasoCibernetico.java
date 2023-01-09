package padroescomportamentais.chainofresponsability;

public class TipoCasoCibernetico implements TipoCaso {

    private static TipoCasoCibernetico tipoCasoCibernetico = new TipoCasoCibernetico();

    private TipoCasoCibernetico() {};

    public static TipoCasoCibernetico getTipoCasoCibernetico() {
        return tipoCasoCibernetico;
    }
}
