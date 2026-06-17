import java.io.InputStream;
import java.time.LocalDateTime;

public class StudioEntity {

    private int id;
    private LocalDateTime dataHora;
    private String nomeStudio;
    private String cpf;
    private String cnpj;
    private String nome;
    private String email;
    private String telefone;

    // Construtor vazio
    public StudioEntity(int i, String string) {

        this.id = 0;
        this.dataHora = LocalDateTime.now();
        this.nomeStudio = "";
        this.cpf = "";
        this.cnpj = "";
        this.nome = "";
        this.email = "";
        this.telefone = "";
    }

    // Construtor completo
    public StudioEntity(int id,
                        LocalDateTime dataHora,
                        String nomeStudio,
                        String cpf,
                        String cnpj,
                        String nome,
                        String email,
                        String telefone) {

        this.id = id;
        this.dataHora = dataHora;
        this.nomeStudio = nomeStudio;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    // GETTERS E SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getNomeStudio() {
        return nomeStudio;
    }

    public void setNomeStudio(String nomeStudio) {
        this.nomeStudio = nomeStudio;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    // Método mostrar dados
    public void mostrarDados() {

        System.out.println("===== STUDIO =====");
        System.out.println("ID: " + id);
        System.out.println("Nome Studio: " + nomeStudio);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Data/Hora: " + dataHora);
    }

    @Override
    public String toString() {
        return "StudioEntity{" +
                "id=" + id +
                ", dataHora=" + dataHora +
                ", nomeStudio='" + nomeStudio + '\'' +
                ", cpf='" + cpf + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}