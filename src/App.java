import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        // =========================================
        // STATUS
        // =========================================

        StudioEntity statusAtivo =
                new StudioEntity(1, "ATIVO");

        // =========================================
        // PACIENTES
        // =========================================

        PacienteEntity paciente1 =
                new PacienteEntity(
                        1,
                        "Carlos Silva",
                        "carlos@gmail.com",
                        "123",
                        "11111111111",
                        "10/05/1990"
                );

        PacienteEntity paciente2 =
                new PacienteEntity(
                        2,
                        "Mariana Souza",
                        "mariana@gmail.com",
                        "456",
                        "22222222222",
                        "15/08/1995"
                );

        // =========================================
        // FUNCIONÁRIO
        // =========================================

        FuncionarioEntity funcionario1 =
                new FuncionarioEntity();

        funcionario1.setId(1);
        funcionario1.setNome("José Roberto");
        funcionario1.setCargo("Recepcionista");
        funcionario1.setCpf("33333333333");
        funcionario1.setEmail("jose@gmail.com");
        funcionario1.setTelefone("17999999999");
        funcionario1.setEndereco("Rua Central");
        funcionario1.setDataContratacao(LocalDateTime.now());

        // =========================================
        // MÉDICO
        // =========================================

        MedicoAtendimento medico1 =
                new MedicoAtendimento(
                        1,
                        100,
                        200,
                        LocalDateTime.now()
                );

        // =========================================
        // ATENDIMENTO 1
        // =========================================

        AtendimentoEntity atendimento1 =
                new AtendimentoEntity();

        atendimento1.setId(1);
        atendimento1.setNomeMedico("Dr. Lucas");
        atendimento1.setPaciente(paciente1);
        atendimento1.setConsultas("Consulta Ortopédica");
        atendimento1.setObservacoes(
                "Paciente com dores no joelho"
        );
        atendimento1.setDataHora(LocalDateTime.now());
        atendimento1.setMedicoAtendimento(medico1);

        // =========================================
        // ATENDIMENTO 2
        // =========================================

        AtendimentoEntity atendimento2 =
                new AtendimentoEntity();

        atendimento2.setId(2);
        atendimento2.setNomeMedico("Dra. Fernanda");
        atendimento2.setPaciente(paciente2);
        atendimento2.setConsultas("Consulta Clínica");
        atendimento2.setObservacoes(
                "Paciente com febre"
        );
        atendimento2.setDataHora(LocalDateTime.now());

        // =========================================
        // PROCEDIMENTO 1
        // =========================================

        ProcedimentoAtendimento procedimento1 =
                new ProcedimentoAtendimento();

        procedimento1.setId(1);
        procedimento1.setProcedimentoId(10);
        procedimento1.setProcedimentoId(1);
        procedimento1.setDescricao("Raio X");
        procedimento1.setValor(250.00);
        procedimento1.setNomeProcedimento(
                "Raio X do Joelho"
        );
        procedimento1.setNomePaciente("Carlos Silva");
        procedimento1.setNomeFuncionario(
                "José Roberto"
        );
        procedimento1.setNomeMedico("Dr. Lucas");
        procedimento1.setObservacoes("Sem fratura");
        procedimento1.setDataHora(LocalDateTime.now());

        // =========================================
        // PROCEDIMENTO 2
        // =========================================

        ProcedimentoAtendimento procedimento2 =
                new ProcedimentoAtendimento();

        procedimento2.setId(2);
        procedimento2.setProcedimentoId(20);
        procedimento2.setProcedimentoId(2);
        procedimento2.setDescricao(
                "Exame de Sangue"
        );
        procedimento2.setValor(120.00);
        procedimento2.setNomeProcedimento(
                "Hemograma"
        );
        procedimento2.setNomePaciente(
                "Mariana Souza"
        );
        procedimento2.setNomeFuncionario(
                "José Roberto"
        );
        procedimento2.setNomeMedico(
                "Dra. Fernanda"
        );
        procedimento2.setObservacoes(
                "Exame normal"
        );
        procedimento2.setDataHora(
                LocalDateTime.now()
        );

        // =========================================
        // ADICIONANDO PROCEDIMENTOS
        // =========================================

        atendimento1.getListaProcedimentos()
                .add(procedimento1);

        atendimento2.getListaProcedimentos()
                .add(procedimento2);

        // =========================================
        // LISTA DE ATENDIMENTOS
        // =========================================

        List<AtendimentoEntity> listaAtendimentos =
                new ArrayList<>();

        listaAtendimentos.add(atendimento1);
        listaAtendimentos.add(atendimento2);

        // =========================================
        // EXIBIÇÃO
        // =========================================

        System.out.println(
                "\n=================================="
        );

        System.out.println(
                " SISTEMA DE ATENDIMENTO MÉDICO "
        );

        System.out.println(
                "=================================="
        );

        for (AtendimentoEntity atendimento
                : listaAtendimentos) {

            System.out.println("\n--------------------------------");

            System.out.println(
                    "ID Atendimento: "
                            + atendimento.getId()
            );

            System.out.println(
                    "Paciente: "
                            + atendimento
                            .getPaciente()
                            .getNomeCompleto()
            );

            System.out.println(
                    "Médico: "
                            + atendimento.getNomeMedico()
            );

            System.out.println(
                    "Consulta: "
                            + atendimento.getConsultas()
            );

            System.out.println(
                    "Observações: "
                            + atendimento.getObservacoes()
            );

            System.out.println(
                    "Data/Hora: "
                            + atendimento.getDataHora()
            );

            System.out.println(
                    "\nPROCEDIMENTOS:"
            );

            for (ProcedimentoAtendimento proc
                    : atendimento.getListaProcedimentos()) {

                System.out.println(
                        "\n------------------------------"
                );

                System.out.println(
                        "Procedimento: "
                                + proc.getNomeProcedimento()
                );

                System.out.println(
                        "Descrição: "
                                + proc.getDescricao()
                );

                System.out.println(
                        "Valor: R$ "
                                + proc.getValor()
                );

                System.out.println(
                        "Resultado: "
                                + proc.getObservacoes()
                );
            }
        }

        System.out.println(
                "\n=================================="
        );

        System.out.println(
                " SISTEMA FINALIZADO "
        );

        System.out.println(
                "=================================="
        );
    }
}
        