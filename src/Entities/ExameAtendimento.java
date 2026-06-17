package Entities;

import java.time.LocalDateTime;

public class ExameAtendimento {

    // Atributos
    private int id;
    private AtendimentoEntity atendimento;
    private String nomeExame;
    private String resultado;
    private LocalDateTime dataExame;
    private String observacoes;

    // Construtor vazio
    public ExameAtendimento() {
    }

    // Construtor completo
    public ExameAtendimento(int id,
                            AtendimentoEntity atendimento,
                            String nomeExame,
                            String resultado,
                            LocalDateTime dataExame,
                            String observacoes) {

        this.id = id;
        this.atendimento = atendimento;
        this.nomeExame = nomeExame;
        this.resultado = resultado;
        this.dataExame = dataExame;
        this.observacoes = observacoes;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AtendimentoEntity getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(AtendimentoEntity atendimento) {
        this.atendimento = atendimento;
    }

    public String getNomeExame() {
        return nomeExame;
    }

    public void setNomeExame(String nomeExame) {
        this.nomeExame = nomeExame;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public LocalDateTime getDataExame() {
        return dataExame;
    }

    public void setDataExame(LocalDateTime dataExame) {
        this.dataExame = dataExame;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    // Método mostrar dados
    public void mostrarDados() {

        System.out.println("ID Exame: " + id);

        if (atendimento != null) {
            System.out.println("Paciente: "
                    + atendimento.getPaciente().getNomeCompleto());
        }

        System.out.println("Nome Exame: " + nomeExame);
        System.out.println("Resultado: " + resultado);
        System.out.println("Data Exame: " + dataExame);
        System.out.println("Observações: " + observacoes);
    }
}
