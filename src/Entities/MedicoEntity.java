package Entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MedicoEntity {

    // Atributos
    private int id;
    private String nomeCompleto;
    private String crm;
    private String especialidade;
    private String telefone;
    private String email;
    private String endereco;
    private LocalDate dataNascimento;
    private LocalDateTime dataCadastro;

    // Construtor vazio
    public MedicoEntity() {
    }

    // Construtor completo
    public MedicoEntity(int id,
                        String nomeCompleto,
                        String crm,
                        String especialidade,
                        String telefone,
                        String email,
                        String endereco,
                        LocalDate dataNascimento,
                        LocalDateTime dataCadastro) {

        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.crm = crm;
        this.especialidade = especialidade;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.dataCadastro = dataCadastro;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    // Método mostrar dados
    public void mostrarDados() {

        System.out.println("ID: " + id);
        System.out.println("Nome: " + nomeCompleto);
        System.out.println("CRM: " + crm);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("Endereço: " + endereco);
        System.out.println("Data Nascimento: " + dataNascimento);
        System.out.println("Data Cadastro: " + dataCadastro);
    }
}
