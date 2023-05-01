import java.util.Arrays;
import java.util.List;

public class Paciente implements IPaciente{
    private String nome;
    private String planoMedico;
    private int idade;
    private String cpf;
    private String condicaoMedica;

    public Paciente(String cpf){
        this.cpf = cpf;
        Paciente objeto = DataBase.getPaciente(cpf);
        this.nome = objeto.nome;
        this.planoMedico = objeto.planoMedico;
        this.condicaoMedica = objeto.condicaoMedica;
        this.idade = objeto.idade;
    }

    public Paciente(String nome, String planoMedico, int idade, String cpf, String condicaoMedica) {
        this.nome = nome;
        this.planoMedico = planoMedico;
        this.idade = idade;
        this.cpf = cpf;
        this.condicaoMedica = condicaoMedica;
    }

    public String getCpf(){
        return cpf;
    }

    public List<String> dadosPessoais(){
        return Arrays.asList(this.nome, String.valueOf(this.idade));
    }

    public List<String> detalhesPessoais(ProfissionalSaude profissionalSaude){
        return Arrays.asList(this.cpf, this.planoMedico, this.condicaoMedica);
    }

}
