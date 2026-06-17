package Entities;

import java.time.LocalDateTime;

public class ProcedimentoEntity {

    // Atributos
    private int id;
    private String nomeProcedimento;
    private String descricao;
    private double valor;
    private int duracaoMinutos;
    private LocalDateTime dataCadastro;

    // Construtor vazio
    public ProcedimentoEntity() {
    }

    // Construtor completo
    public ProcedimentoEntity(int id, String nomeProcedimento,
                              String descricao, double valor,
                              int duracaoMinutos,
                              LocalDateTime dataCadastro) {

        this.id = id;
        this.nomeProcedimento = nomeProcedimento;
        this.descricao = descricao;
        this.valor = valor;
        this.duracaoMinutos = duracaoMinutos;
        this.dataCadastro = dataCadastro;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProcedimento() {
        return nomeProcedimento;
    }

    public void setNomeProcedimento(String nomeProcedimento) {
        this.nomeProcedimento = nomeProcedimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    // Método para mostrar dados
    public void mostrarDados() {
        System.out.println("ID: " + id);
        System.out.println("Procedimento: " + nomeProcedimento);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: R$ " + valor);
        System.out.println("Duração: " + duracaoMinutos + " minutos");
        System.out.println("Data Cadastro: " + dataCadastro);
    }
}