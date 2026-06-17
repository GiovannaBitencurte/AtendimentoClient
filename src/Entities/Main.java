package Entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.text.html.parser.Entity;

public class Main {

    // =========================================
    // CONFIGURAÇÃO MYSQL
    // =========================================

    private static final String URL =
            "jdbc:mysql://localhost:3306/sistema_atendimento";

    private static final String USUARIO =
            "root";

    private static final String SENHA =
            "123456";

    // =========================================
    // CONEXÃO
    // =========================================

    public static Connection conexao;

    // =========================================
    // MAIN
    // =========================================

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            
            System.out.println("\n========== MENU ==========");
            System.out.println("1 - Atendimento");
            System.out.println("2 - Exame Atendimento");
            System.out.println("3 - Exame");
            System.out.println("4 - Médico Atendimento");
            System.out.println("5 - Médico");
            System.out.println("6 - Paciente");
            System.out.println("7 - Procedimento Atendimento");
            System.out.println("8 - Procedimento");
            System.out.println("9 - Studio");
            System.out.println("0 - Sair");

            System.out.print("Escolha: ");

            while (!scanner.hasNextInt()) {

                System.out.print(
                        "Digite número válido: "
                );

                scanner.next();
            }

            opcao = scanner.nextInt();

            // limpar buffer
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    testarAtendimentoEntity();
                    break;

                case 2:
                    testarExameAtendimento();
                    break;

                case 3:
                    testarExameEntity();
                    break;

                case 4:
                    testarMedicoAtendimento();
                    break;

                case 5:
                    testarMedicoEntity();
                    break;

                case 6:
                    testarPacienteEntity();
                    break;

                case 7:
                    testarProcedimentoAtendimento();
                    break;

                case 8:
                    testarProcedimentoEntity();
                    break;

                case 9:
                    testarStudioEntity();
                    break;

                case 0:

                    System.out.println(
                            "🔌 Encerrando sistema..."
                    );

                    break;

                default:

                    System.out.println(
                            "⚠️ Opção inválida!"
                    );
            }

        } while (opcao != 0);

        // =====================================
        // FECHAR
        // =====================================

        scanner.close();

        desconectarBanco();
    }

    // =========================================
    // Conectar no mysql
    // =========================================

    private static void desconectarBanco() {

        if (conexao != null) {

            try {

                conexao.close();

                System.out.println(
                        "✅ Banco desconectado."
                );

            } catch (SQLException e) {

                System.out.println(
                        "❌ Erro ao fechar conexão."
                );
            }
        }
    }

    // =========================================
    // TESTES
    // =========================================

    private static void testarAtendimentoEntity() {

        System.out.println(
                "\n>>> TESTE ATENDIMENTO"
        );

        AtendimentoEntity atendimento =
                new AtendimentoEntity();

        atendimento.mostrarDados();
    }

    private static void testarExameAtendimento() {

        System.out.println(
                "\n>>> TESTE EXAME ATENDIMENTO"
        );

        ExameAtendimento exame =
                new ExameAtendimento();

        exame.mostrarDados();
    }

    private static void testarExameEntity() {

        System.out.println(
                "\n>>> TESTE EXAME"
        );

        Entity exame =
                new Entity(null, 0, null);

        exame.mostrarDados();
    }

    private static void testarMedicoAtendimento() {

        System.out.println(
                "\n>>> TESTE MÉDICO ATENDIMENTO"
        );

        MedicoAtendimento medico =
                new MedicoAtendimento();

        medico.mostrarDados();
    }

    private static void testarMedicoEntity() {

        System.out.println(
                "\n>>> TESTE MÉDICO"
        );

        MedicoEntity medico =
                new MedicoEntity();

        medico.mostrarDados();
    }

    private static void testarPacienteEntity() {

        System.out.println(
                "\n>>> TESTE PACIENTE"
        );

        PacienteEntity paciente =
                new PacienteEntity();

        paciente.mostrarDados();
    }

    private static void testarProcedimentoAtendimento() {

        System.out.println(
                "\n>>> TESTE PROCEDIMENTO ATENDIMENTO"
        );

        ProcedimentoAtendimento procedimento =
                new ProcedimentoAtendimento();

        procedimento.mostrarDados();
    }

    private static void testarProcedimentoEntity() {

        System.out.println(
                "\n>>> TESTE PROCEDIMENTO"
        );

        ProcedimentoEntity procedimento =
                new ProcedimentoEntity();

        procedimento.mostrarDados();
    }

    private static void testarStudioEntity() {

        System.out.println(
                "\n>>> TESTE STUDIO"
        );

        StudioEntity studio =
                new StudioEntity();

        studio.mostrarDados();
    }
}