package sm.med.api.domain.paciente;

import jakarta.validation.constraints.NotNull;
import sm.med.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
