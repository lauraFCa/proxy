import java.util.HashMap;
import java.util.Map;

public class DataBase {
    private static Map<String, Paciente> pacientes = new HashMap<String, Paciente>();

    public static Paciente getPaciente(String cpf) {
        return pacientes.get(cpf);
    }

    public static void addPaciente(Paciente paciente) {
        pacientes.put(paciente.getCpf(), paciente);
    }
}
