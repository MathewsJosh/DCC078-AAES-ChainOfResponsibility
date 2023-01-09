package padroescomportamentais.chainofresponsability;

public class FuncionarioPolicial extends Funcionario {
    
    public FuncionarioPolicial(Funcionario superior) {
        listaDocumentos.add(TipoCasoFurto.getTipoCasoFurto());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Policial";
    }

}
