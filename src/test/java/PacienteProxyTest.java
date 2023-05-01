import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class PacienteProxyTest {

    @BeforeEach
    void setUp(){
        DataBase.addPaciente(new Paciente(105,"Nome Completo 1", "Unimed", 19, "123456789", "Pedra nos rins"));
        DataBase.addPaciente(new Paciente(302,"Nome 2", "Plasc", 36, "987541236", "Remoção do apêndice"));
    }

    @Test
    void deveRertornarDadosBasicosDoPaciente(){
        PacienteProxy pacienteProxy = new PacienteProxy(302);
        assertEquals(Arrays.asList("Nome 2", "36"), pacienteProxy.dadosPessoais());
    }

    @Test
    void deveRertornarDetalhesDoPaciente(){
        PacienteProxy pacienteProxy = new PacienteProxy(105);
        ProfissionalSaude profissionalSaude = new ProfissionalSaude("Enfermeiro 01", true);
        assertEquals(Arrays.asList("123456789", "Unimed", "Pedra nos rins"), pacienteProxy.detalhesPessoais(profissionalSaude));
    }

    @Test
    void naoDeveRertornarDetalhesDoPaciente(){
        PacienteProxy pacienteProxy = new PacienteProxy(1);
        ProfissionalSaude profissionalSaude = new ProfissionalSaude("Enfermeiro 03", false);
        try{
            pacienteProxy.detalhesPessoais(profissionalSaude);
            fail();
        }catch (IllegalArgumentException ex){
            assertEquals("Funcionário não autorizado!", ex.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoCorreta(){
        try{
            PacienteProxy pacienteProxy = new PacienteProxy(null);
            pacienteProxy.dadosPessoais();
            fail();
        }catch (NullPointerException ex){
            assertEquals("O quarto não pode ser nulo!", ex.getMessage());
        }
    }


}
