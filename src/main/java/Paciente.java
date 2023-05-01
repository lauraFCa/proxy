import java.util.Arrays;
import java.util.List;

public class Paciente implements IPaciente{
    private String nome;
    private String planoMedico;
    private Integer idade;
    private String cpf;
    private String condicaoMedica;
    private Integer quarto;

    public Paciente(Integer quarto){
        if(quarto == null)
            throw new NullPointerException("O quarto não pode ser nulo!");

        this.quarto = quarto;
        Paciente objeto = DataBase.getPaciente(quarto);
        this.cpf = objeto.cpf;
        this.nome = objeto.nome;
        this.planoMedico = objeto.planoMedico;
        this.condicaoMedica = objeto.condicaoMedica;
        this.idade = objeto.idade;
    }

    public Paciente(Integer quarto, String nome, String planoMedico, Integer idade, String cpf, String condicaoMedica) {
        this.quarto = quarto;
        this.nome = nome;
        this.planoMedico = planoMedico;
        this.idade = idade;
        this.cpf = cpf;
        this.condicaoMedica = condicaoMedica;
    }

    public Integer getQuarto(){
        return quarto;
    }

    public List<String> dadosPessoais(){
        return Arrays.asList(this.nome, String.valueOf(this.idade));
    }

    public List<String> detalhesPessoais(ProfissionalSaude profissionalSaude){
        return Arrays.asList(this.cpf, this.planoMedico, this.condicaoMedica);
    }

}
