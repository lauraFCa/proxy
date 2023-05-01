import java.util.HashMap;
import java.util.Map;

public class DataBase {
    private static Map<Integer, Paciente> pacientes = new HashMap<Integer, Paciente>();

    public static Paciente getPaciente(Integer quarto) {
        return pacientes.get(quarto);
    }

    public static void addPaciente(Paciente paciente) {
        pacientes.put(paciente.getQuarto(), paciente);
    }

    public static void removePaciente(Integer quarto){
        pacientes.remove(quarto);
    }
}
