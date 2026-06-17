package Entities;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class PacienteDAO {

    public void listarPacientes() {

        try {

            Connection conn =
                    ConnectionFactory.getConnection();

            Statement stmt =
                    conn.createStatement();

            ResultSet rs =
                    stmt.executeQuery(
                            "SELECT * FROM paciente"
                    );

            while (rs.next()) {

                System.out.println(
                        "ID: " + rs.getInt("id")
                );

                System.out.println(
                        "Nome: " +
                        rs.getString("nome_completo")
                );

                System.out.println(
                        "CPF: " +
                        rs.getString("cpf")
                );

                System.out.println("----------------");
            }

        } catch (Exception e) {

            System.out.println(
                    "Erro: " + e.getMessage()
            );
        }
    }
}