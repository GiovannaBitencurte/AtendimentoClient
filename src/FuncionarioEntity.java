import java.time.LocalDateTime;

public class FuncionarioEntity {

    private int id;
    private String nome;
    private String cargo;
    private LocalDateTime dataContratacao;
    private String cpf;
    private String email;
    private String telefone;
    private String endereco;
    private String pessoas;

    // Construtor vazio
    public FuncionarioEntity() {

        this.id = 0;
        this.nome = "";
        this.cargo = "";
        this.dataContratacao = LocalDateTime.now();
        this.cpf = "";
        this.email = "";
        this.telefone = "";
        this.endereco = "";
        this.pessoas = "";
    }

    // Construtor completo
    public FuncionarioEntity(int id,
                             String nome,
                             String cargo,
                             LocalDateTime dataContratacao,
                             String cpf,
                             String email,
                             String telefone,
                             String endereco,
                             String pessoas) {

        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.dataContratacao = dataContratacao;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.pessoas = pessoas;
    }

    // GETTERS E SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public LocalDateTime getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDateTime dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getPessoas() {
        return pessoas;
    }

    public void setPessoas(String pessoas) {
        this.pessoas = pessoas;
    }

    // Método mostrar dados
    public void mostrarDados() {

        System.out.println("===== FUNCIONÁRIO =====");

        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco);
        System.out.println("Data Contratação: " + dataContratacao);
    }

    @Override
    public String toString() {

        return "FuncionarioEntity{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", dataContratacao=" + dataContratacao +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                ", pessoas='" + pessoas + '\'' +
                '}';
    }
}