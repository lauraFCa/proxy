import java.io.Serializable;
import java.util.List;

public interface IPaciente {
    List<String> dadosPessoais();
    List<String> detalhesPessoais(ProfissionalSaude profissionalSaude);
}
