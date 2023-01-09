package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CasoTest {

    FuncionarioAgenteFederal agente_federal;
    FuncionarioDelegado delegado;
    FuncionarioInvestigador investigador;
    FuncionarioPolicial policial;

    @BeforeEach
    void setUp() {
        agente_federal = new FuncionarioAgenteFederal(null);
        delegado = new FuncionarioDelegado(agente_federal);
        investigador = new FuncionarioInvestigador(delegado);
        policial = new FuncionarioPolicial(investigador);
    }

    @Test
    void deveRetornarPolicialParaAceiteFurto() {
        assertEquals("Policial", policial.aceitarCaso(new Caso(TipoCasoFurto.getTipoCasoFurto())));
    }

    @Test
    void deveRetornarInvestigadorParaAceiteTrafico() {
        assertEquals("Investigador", policial.aceitarCaso(new Caso(TipoCasoTrafico.getTipoCasoTrafico())));
    }

    @Test
    void deveRetornarDelegadoParaAceiteHomicidio() {
        assertEquals("Delegado", policial.aceitarCaso(new Caso(TipoCasoHomicidio.getTipoCasoHomicidio())));
    }

    @Test
    void deveRetornarAgenteFederalParaAceiteOperacoesEspeciais() {
        assertEquals("Agente federal", policial.aceitarCaso(new Caso(TipoCasoOperacoesEspeciais.getTipoCasoOperacoesEspeciais())));
    }

    @Test
    void deveRetornarSemAceiteParaAceiteCasoCibernetico() {
        assertEquals("Não aceito", policial.aceitarCaso(new Caso(TipoCasoCibernetico.getTipoCasoCibernetico())));
    }

}