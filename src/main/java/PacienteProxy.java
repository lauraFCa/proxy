import java.util.List;

public class PacienteProxy implements IPaciente{
    private Paciente paciente;
    private Integer quarto;

    public PacienteProxy(Integer quarto){
        this.quarto = quarto;
    }

    public List<String> dadosPessoais() {
        if (this.paciente == null) {
            this.paciente = new Paciente(this.quarto);
        }
        return this.paciente.dadosPessoais();
    }

    public List<String> detalhesPessoais(ProfissionalSaude profSaude) {
        if (!profSaude.isAdm()) {
            throw new IllegalArgumentException("Funcionário não autorizado!");
        }
        if (this.paciente == null) {
            this.paciente = new Paciente(this.quarto);
        }
        return this.paciente.detalhesPessoais(profSaude);
    }
}
