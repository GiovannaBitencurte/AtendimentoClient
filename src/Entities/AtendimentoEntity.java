package Entities;

import java.time.LocalDateTime;

public class AtendimentoEntity {

    // Atributos
    private int id;
    private PacienteEntity paciente;
    private MedicoEntity medico;
    private StudioEntity studio;
    private LocalDateTime dataHoraAtendimento;
    private String status;
    private String observacoes;
    private double valorTotal;

    // Construtor vazio
    public AtendimentoEntity() {
    }

    // Construtor completo
    public AtendimentoEntity(int id,
                             PacienteEntity paciente,
                             MedicoEntity medico,
                             StudioEntity studio,
                             LocalDateTime dataHoraAtendimento,
                             String status,
                             String observacoes,
                             double valorTotal) {

        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
        this.studio = studio;
        this.dataHoraAtendimento = dataHoraAtendimento;
        this.status = status;
        this.observacoes = observacoes;
        this.valorTotal = valorTotal;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PacienteEntity getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteEntity paciente) {
        this.paciente = paciente;
    }

    public MedicoEntity getMedico() {
        return medico;
    }

    public void setMedico(MedicoEntity medico) {
        this.medico = medico;
    }

    public StudioEntity getStudio() {
        return studio;
    }

    public void setStudio(StudioEntity studio) {
        this.studio = studio;
    }

    public LocalDateTime getDataHoraAtendimento() {
        return dataHoraAtendimento;
    }

    public void setDataHoraAtendimento(LocalDateTime dataHoraAtendimento) {
        this.dataHoraAtendimento = dataHoraAtendimento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    // Método mostrar dados
    public void mostrarDados() {

        System.out.println("ID Atendimento: " + id);

        if (paciente != null) {
            System.out.println("Paciente: "
                    + paciente.getNomeCompleto());
        }

        if (medico != null) {
            System.out.println("Médico: "
                    + medico.getNomeCompleto());
        }

        if (studio != null) {
            System.out.println("Studio: "
                    + studio.getNomeStudio());
        }

        System.out.println("Data/Hora Atendimento: "
                + dataHoraAtendimento);

        System.out.println("Status: " + status);
        System.out.println("Observações: " + observacoes);
        System.out.println("Valor Total: R$ " + valorTotal);
    }
}
