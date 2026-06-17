package Entities;

import java.time.LocalDateTime;

public class ProcedimentoAtendimento {

    // Atributos
    private int id;
    private ProcedimentoEntity procedimento;
    private AtendimentoEntity atendimento;
    private LocalDateTime dataHora;
    private String observacoes;

    // Construtor vazio
    public ProcedimentoAtendimento() {
    }

    // Construtor completo
    public ProcedimentoAtendimento(int id,
                                   ProcedimentoEntity procedimento,
                                   AtendimentoEntity atendimento,
                                   LocalDateTime dataHora,
                                   String observacoes) {

        this.id = id;
        this.procedimento = procedimento;
        this.atendimento = atendimento;
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

    public ProcedimentoEntity getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(ProcedimentoEntity procedimento) {
        this.procedimento = procedimento;
    }

    public AtendimentoEntity getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(AtendimentoEntity atendimento) {
        this.atendimento = atendimento;
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

    // Método para mostrar dados
    public void mostrarDados() {

        System.out.println("ID: " + id);

        if (procedimento != null) {
            System.out.println("Procedimento: "
                    + procedimento.getNomeProcedimento());
        }

        System.out.println("Data/Hora: " + dataHora);
        System.out.println("Observações: " + observacoes);
    }
}