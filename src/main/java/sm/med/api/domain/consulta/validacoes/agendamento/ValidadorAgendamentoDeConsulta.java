package sm.med.api.domain.consulta.validacoes.agendamento;

import sm.med.api.domain.consulta.DadosAgendamentoConsulta;

public interface ValidadorAgendamentoDeConsulta {

    void validar(DadosAgendamentoConsulta dados);

}
