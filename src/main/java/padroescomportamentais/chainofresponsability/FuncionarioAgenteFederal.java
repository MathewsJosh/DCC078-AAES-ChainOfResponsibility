package padroescomportamentais.chainofresponsability;

public class FuncionarioAgenteFederal extends Funcionario {

    public FuncionarioAgenteFederal(Funcionario superior) {
        listaDocumentos.add(TipoCasoOperacoesEspeciais.getTipoCasoOperacoesEspeciais());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Agente federal";
    }

}
