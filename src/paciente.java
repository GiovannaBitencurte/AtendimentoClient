import java.time.LocalDateTime;
public class paciente {

    private int id;

    private String nomeCompleto;

    private String email;

    private String senha;

    private String cpf;

    private String dataNascimento;

    // Construtor vazio
    public paciente() {

        this.id = 0;
        this.nomeCompleto = "";
        this.email = "";
        this.senha = "";
        this.cpf = "";
        this.dataNascimento = "";
    }

    // Construtor completo
    public paciente(int id,
                     String nomeCompleto,
                     String email,
                     String senha,
                     String cpf,
                     String dataNascimento) {

        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    // GETTERS E SETTERS

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // Método mostrar dados
    public void mostrarDados() {

        System.out.println("===== PACIENTE =====");

        System.out.println("ID: " + id);

        System.out.println("Nome Completo: " + nomeCompleto);

        System.out.println("Email: " + email);

        System.out.println("Senha: " + senha);

        System.out.println("CPF: " + cpf);

        System.out.println("Data Nascimento: " + dataNascimento);
    }

    @Override
    public String toString() {

        return "Paciente{" +
                "id=" + id +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                '}';
    }
}