package padroescomportamentais.chainofresponsability;

public class FuncionarioInvestigador extends Funcionario {
    
    public FuncionarioInvestigador(Funcionario superior) {
        listaDocumentos.add(TipoCasoTrafico.getTipoCasoTrafico());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Investigador";
    }
}
