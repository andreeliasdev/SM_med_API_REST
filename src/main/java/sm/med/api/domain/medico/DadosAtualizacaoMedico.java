package sm.med.api.domain.medico;

import jakarta.validation.constraints.NotNull;
import sm.med.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
