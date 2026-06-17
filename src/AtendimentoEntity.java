import java.time.LocalDateTime;
import java.util.ArrayList;

// Classe principal de Atendimento, sem genérica desnecessária
public class AtendimentoEntity {

    private int id;
    private MedicoAtendimento medicoAtendimento;
    private String nomeMedico;
    private PacienteEntity paciente;
    private String consultas;
    private String observacoes;
    private LocalDateTime dataHora;

    // Listas
    private ArrayList<MedicoAtendimento> listaMedicos;
    private ArrayList<ProcedimentoAtendimento> listaProcedimentos;

    // Construtor vazio
    public AtendimentoEntity() {
        this.id = 0;
        this.medicoAtendimento = new MedicoAtendimento();
        this.nomeMedico = "Marcelo";
        this.paciente = new PacienteEntity(); // Atribuição corrigida
        this.consultas = "Paciente";
        this.observacoes = "Medicas";
        this.dataHora = LocalDateTime.now();

        this.listaMedicos = new ArrayList<>();
        this.listaProcedimentos = new ArrayList<>();
    }

    // Construtor completo
    public AtendimentoEntity(int id,
                             MedicoAtendimento medicoAtendimento,
                             String nomeMedico,
                             PacienteEntity paciente,
                             String consultas,
                             String observacoes,
                             LocalDateTime dataHora) {

        this.id = id;
        this.medicoAtendimento = medicoAtendimento;
        this.nomeMedico = nomeMedico;
        this.paciente = paciente;
        this.consultas = consultas;
        this.observacoes = observacoes;
        this.dataHora = dataHora;
        this.listaMedicos = new ArrayList<>();
        this.listaProcedimentos = new ArrayList<>();
    }

    // GETTERS E SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MedicoAtendimento getMedicoAtendimento() {
        return medicoAtendimento;
    }

    public void setMedicoAtendimento(MedicoAtendimento medicoAtendimento) {
        this.medicoAtendimento = medicoAtendimento;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public PacienteEntity getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteEntity paciente) {
        this.paciente = paciente;
    }

    public String getConsultas() {
        return consultas;
    }

    public void setConsultas(String consultas) {
        this.consultas = consultas;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public ArrayList<MedicoAtendimento> getListaMedicos() {
        return listaMedicos;
    }

    public void setListaMedicos(ArrayList<MedicoAtendimento> listaMedicos) {
        this.listaMedicos = listaMedicos;
    }

    public ArrayList<ProcedimentoAtendimento> getListaProcedimentos() {
        return listaProcedimentos;
    }

    public void setListaProcedimentos(ArrayList<ProcedimentoAtendimento> listaProcedimentos) {
        this.listaProcedimentos = listaProcedimentos;
    }

    // Método mostrar dados
    public void mostrarDados() {
        System.out.println("===== ATENDIMENTO =====");
        System.out.println("ID: " + id);
        System.out.println("Nome Médico: " + nomeMedico);
        System.out.println("Paciente: " + paciente);
        System.out.println("Consultas: " + consultas);
        System.out.println("Observações: " + observacoes);
        System.out.println("Data/Hora: " + dataHora);
    }

    @Override
    public String toString() {
        return "AtendimentoEntity{" +
                "id=" + id +
                ", medicoAtendimento=" + medicoAtendimento +
                ", nomeMedico='" + nomeMedico + '\'' +
                ", paciente=" + paciente +
                ", consultas='" + consultas + '\'' +
                ", observacoes='" + observacoes + '\'' +
                ", dataHora=" + dataHora +
                '}';
    }

    // Método principal para rodar o código
    public static void main(String[] args) {
        // Cria um atendimento usando o construtor vazio
        AtendimentoEntity atendimento1 = new AtendimentoEntity();
        atendimento1.mostrarDados();

        System.out.println("\n" + atendimento1.toString());

        // Cria objetos auxiliares para usar no construtor completo
        MedicoAtendimento medico = new MedicoAtendimento();
        medico.setNome("Carlos Silva");
        PacienteEntity paciente = new PacienteEntity();
        paciente.setNome("Ana Carolina");

        // Cria um atendimento usando o construtor completo
        AtendimentoEntity atendimento2 = new AtendimentoEntity(
                2,
                medico,
                "Carlos Silva",
                paciente,
                "Retorno de consulta",
                "Paciente apresentou melhora",
                LocalDateTime.of(2026, 5, 22, 21, 6, 38)
        );

        System.out.println("\n--- Atendimento 2 ---");
        atendimento2.mostrarDados();
    }
}

// Classe auxiliar MedicoAtendimento
class MedicoAtendimento {
    private String nome;

    public MedicoAtendimento() {
        this.nome = "Sem nome";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "MedicoAtendimento{nome='" + nome + "'}";
    }
}

// Classe auxiliar ProcedimentoAtendimento
class ProcedimentoAtendimento {
    private String descricao;

    public ProcedimentoAtendimento() {
        this.descricao = "Procedimento padrão";
    }

    @Override
    public String toString() {
        return "ProcedimentoAtendimento{descricao='" + descricao + "'}";
    }

    public void setId(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setId'");
    }

    public void setProcedimentoId(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setProcedimentoId'");
    }

    public void setAtendimentoId(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAtendimentoId'");
    }

    public void setDescricao(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDescricao'");
    }

    public void setValor(double d) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setValor'");
    }

    public void setNomeProcedimento(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNomeProcedimento'");
    }

    public void setNomePaciente(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNomePaciente'");
    }

    public void setNomeFuncionario(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNomeFuncionario'");
    }

    public void setNomeMedico(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNomeMedico'");
    }

    public void setObservacoes(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setObservacoes'");
    }

    public void setDataHora(LocalDateTime now) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDataHora'");
    }

    public String getNomeProcedimento() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNomeProcedimento'");
    }

    public String getDescricao() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDescricao'");
    }

    public String getValor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getValor'");
    }

    public String getObservacoes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getObservacoes'");
    }
}

// Classe auxiliar PacienteEntity
class PacienteEntity {
    private String nome;

    public PacienteEntity() {
        this.nome = "Paciente padrão";
    }

    public PacienteEntity(int i, String string, String string2, String string3, String string4, String string5) {
        //TODO Auto-generated constructor stub
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "PacienteEntity{nome='" + nome + "'}";
    }

    public String getNomeCompleto() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNomeCompleto'");
    }
}