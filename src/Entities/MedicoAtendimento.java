package Entities;

import java.time.LocalDateTime;

public class MedicoAtendimento {

    // Atributos
    private int id;
    private MedicoEntity medico;
    private AtendimentoEntity atendimento;
    private String especialidadeAtendimento;
    private LocalDateTime dataHora;
    private String observacoes;

    // Construtor vazio
    public MedicoAtendimento() {
    }

    // Construtor completo
    public MedicoAtendimento(int id,
                             MedicoEntity medico,
                             AtendimentoEntity atendimento,
                             String especialidadeAtendimento,
                             LocalDateTime dataHora,
                             String observacoes) {

        this.id = id;
        this.medico = medico;
        this.atendimento = atendimento;
        this.especialidadeAtendimento = especialidadeAtendimento;
        this.dataHora = dataHora;
        this.observacoes = observacoes;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MedicoEntity getMedico() {
        return medico;
    }

    public void setMedico(MedicoEntity medico) {
        this.medico = medico;
    }

    public AtendimentoEntity getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(AtendimentoEntity atendimento) {
        this.atendimento = atendimento;
    }

    public String getEspecialidadeAtendimento() {
        return especialidadeAtendimento;
    }

    public void setEspecialidadeAtendimento(String especialidadeAtendimento) {
        this.especialidadeAtendimento = especialidadeAtendimento;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    // Método mostrar dados
    public void mostrarDados() {

        System.out.println("ID: " + id);

        if (medico != null) {
            System.out.println("Médico: "
                    + medico.getNomeCompleto());
        }

        if (atendimento != null &&
            atendimento.getPaciente() != null) {

            System.out.println("Paciente: "
                    + atendimento.getPaciente().getNomeCompleto());
        }

        System.out.println("Especialidade Atendimento: "
                + especialidadeAtendimento);

        System.out.println("Data/Hora: " + dataHora);
        System.out.println("Observações: " + observacoes);
    }
}