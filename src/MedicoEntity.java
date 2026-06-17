import java.time .LocalDateTime;
public class MedicoEntity{
    private String nome;
    private String especialidade;
    private String medico;
    private String cpf;
    private String cnpj;
    public MedicoEntity(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public String getMedico() {
        return medico;
    }
    public void setMedico(String medico) {
        this.medico = medico;
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
    //Mostrar dados do médico
    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("CPF: " + cpf);
        System.out.println("CNPJ: " + cnpj);
    }
    @Override
    public String toString() {
        return "MedicoEntity{" +
                "nome='" + nome + '\'' +
                ", especialidade='" + especialidade + '\'' +
                ", cpf='" + cpf + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
}
