package padroescomportamentais.chainofresponsability;

public class FuncionarioDelegado extends Funcionario {

    public FuncionarioDelegado(Funcionario superior) {
        listaDocumentos.add(TipoCasoHomicidio.getTipoCasoHomicidio());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Delegado";
    }

}
