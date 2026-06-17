package Entities;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    private static final String URL =
            "jdbc:mysql://localhost:3306/sistema_atendimento";

    private static final String USER = "root";

    private static final String PASSWORD = "123456";

    public static Connection getConnection() {

        try {

            return DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD
            );

        } catch (Exception e) {

            System.out.println("conectar conexão: " + e.getMessage());

            return null;
        }
    }
}