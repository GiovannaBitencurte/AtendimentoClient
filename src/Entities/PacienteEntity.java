package Entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PacienteEntity {

    // Atributos
    private int id;
    private String nomeCompleto;
    private String cpf;
    private String rg;
    private LocalDate dataNascimento;
    private String telefone;
    private String email;
    private String endereco;
    private String convenio;
    private LocalDateTime dataCadastro;

    // Construtor vazio
    public PacienteEntity() {
    }

    // Construtor completo
    public PacienteEntity(int id,
                          String nomeCompleto,
                          String cpf,
                          String rg,
                          LocalDate dataNascimento,
                          String telefone,
                          String email,
                          String endereco,
                          String convenio,
                          LocalDateTime dataCadastro) {

        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.convenio = convenio;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
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

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
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
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Data Nascimento: " + dataNascimento);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("Endereço: " + endereco);
        System.out.println("Convênio: " + convenio);
        System.out.println("Data Cadastro: " + dataCadastro);
    }

	public void listarPacientes() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'listarPacientes'");
	}
}
