import java.time.LocalDateTime;
public class AdminEntity {
    private int id;
    private String AdminEntity;
    private String login;
    private String senha;
    private String informação;
    private LocalDateTime dataHora;
    private String observações;
    private String nomeCompleto;
    private String email;
    private String telefone;
    private String endereco;
    private String cargo;
    //Construtores  de Admintrador
    public AdminEntity(int id, String adminEntity, String login, String senha, String informação,
            LocalDateTime dataHora, String observações, String nomeCompleto, String email, String telefone,
            String endereco, String cargo) {
        this.id = id;
        AdminEntity = adminEntity;
        this.login = login;
        this.senha = senha;
        this.informação = informação;
        this.dataHora = dataHora;
        this.observações = observações;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cargo = cargo;
    }
    //Getters e Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAdminEntity() {
        return AdminEntity;
    }
    public void setAdminEntity(String adminEntity) {
        AdminEntity = adminEntity;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getInformação() {
        return informação;
    }
    public void setInformação(String informação) {
        this.informação = informação;
    }
    public LocalDateTime getDataHora() {
        return dataHora;
    }
    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
    public String getObservações() {
        return observações;
    }
    public void setObservações(String observações) {
        this.observações = observações;
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
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public static void mostrarDados(AdminEntity admin) {
        System.out.println("===== DADOS DO ADMINISTRADOR =====");
        System.out.println("ID: " + admin.getId());
        System.out.println("AdminEntity: " + admin.getAdminEntity());
        System.out.println("Login: " + admin.getLogin());
        System.out.println("Senha: " + admin.getSenha());
        System.out.println("Informação: " + admin.getInformação());
        System.out.println("Data/Hora: " + admin.getDataHora());
        System.out.println("Observações: " + admin.getObservações());
        System.out.println("Nome Completo: " + admin.getNomeCompleto());
        System.out.println("Email: " + admin.getEmail());
        System.out.println("Telefone: " + admin.getTelefone());
        System.out.println("Endereço: " + admin.getEndereco());
        System.out.println("Cargo: " + admin.getCargo());
    }
        @Override
    public String toString() {
        return "AdminEntity{" +
                "id=" + id +
                ", AdminEntity='" + AdminEntity + '\'' +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                ", informação='" + informação + '\'' +
                ", dataHora=" + dataHora +
                ", observações='" + observações + '\'' +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
