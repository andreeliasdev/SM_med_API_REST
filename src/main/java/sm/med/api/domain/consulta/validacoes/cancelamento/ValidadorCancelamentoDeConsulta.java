package sm.med.api.domain.consulta.validacoes.cancelamento;

import sm.med.api.domain.consulta.DadosCancelamentoConsulta;

public interface ValidadorCancelamentoDeConsulta {

    void validar(DadosCancelamentoConsulta dados);

}
