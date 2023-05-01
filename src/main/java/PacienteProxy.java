import java.util.List;

public class PacienteProxy implements IPaciente{
    private Paciente paciente;
    private String cpf;

    public PacienteProxy(String cpf){
        this.cpf = cpf;
    }

    public List<String> dadosPessoais() {
        if (this.paciente == null) {
            this.paciente = new Paciente(this.cpf);
        }
        return this.paciente.dadosPessoais();
    }

    public List<String> detalhesPessoais(ProfissionalSaude profSaude) {
        if (!profSaude.isAdm()) {
            throw new IllegalArgumentException("Funcionário não autorizado");
        }
        if (this.paciente == null) {
            this.paciente = new Paciente(this.cpf);
        }
        return this.paciente.detalhesPessoais(profSaude);
    }
}
