package padroescomportamentais.chainofresponsability;

public class TipoCasoOperacoesEspeciais implements TipoCaso {

    private static TipoCasoOperacoesEspeciais tipoCasoOperacoesEspeciais = new TipoCasoOperacoesEspeciais();

    private TipoCasoOperacoesEspeciais() {};
    
    public static TipoCasoOperacoesEspeciais getTipoCasoOperacoesEspeciais() {
        return tipoCasoOperacoesEspeciais;
    }
}
