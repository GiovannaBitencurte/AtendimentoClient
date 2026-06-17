package Entities;

import java.time.LocalDateTime;

public class StudioEntity {

    // Atributos
    private int id;
    private String nomeStudio;
    private String endereco;
    private String telefone;
    private String email;
    private LocalDateTime dataCadastro;

    // Construtor vazio
    public StudioEntity() {
    }

    // Construtor completo
    public StudioEntity(int id, String nomeStudio, String endereco,
                        String telefone, String email,
                        LocalDateTime dataCadastro) {

        this.id = id;
        this.nomeStudio = nomeStudio;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.dataCadastro = dataCadastro;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeStudio() {
        return nomeStudio;
    }

    public void setNomeStudio(String nomeStudio) {
        this.nomeStudio = nomeStudio;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
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

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    // Método para mostrar dados
    public void mostrarDados() {
        System.out.println("ID: " + id);
        System.out.println("Nome do Studio: " + nomeStudio);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("Data Cadastro: " + dataCadastro);
    }
}