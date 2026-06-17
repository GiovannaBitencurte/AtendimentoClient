package Entities;

public class App {

    public static void main(String[] args) {

        final PacienteDAO dao =
                new PacienteDAO();

        dao.listarPacientes();
    }
}
