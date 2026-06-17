import java.time.LocalDateTime;
import java.util.ArrayList;

// =========================================
// CLASSE PRINCIPAL
// =========================================
public class ExameAtendimento {

    private AtendimentoEntity atendimento;
    private String nomeMedico;
    private ExameEntity exame;
    private LocalDateTime dataHora;
    private String resultado;
    private String observacoes;
    private MedicoAtendimento medicoAtendimento;

    // Construtor vazio
    public ExameAtendimento() {

        this.atendimento = new AtendimentoEntity();
        this.medicoAtendimento = new MedicoAtendimento();
        this.nomeMedico = "Rodrigo";
        this.exame = new ExameEntity();
        this.dataHora = LocalDateTime.now();
        this.resultado = "Positivo";
        this.observacoes = "Paciente apresentou sintomas leves.";
    }

    // Construtor completo
    public ExameAtendimento(
            AtendimentoEntity atendimento,
            String nomeMedico,
            ExameEntity exame,
            LocalDateTime dataHora,
            String resultado,
            String observacoes,
            MedicoAtendimento medicoAtendimento) {

        this.atendimento = atendimento;
        this.nomeMedico = nomeMedico;
        this.exame = exame;
        this.dataHora = dataHora;
        this.resultado = resultado;
        this.observacoes = observacoes;
        this.medicoAtendimento = medicoAtendimento;
    }

    // Método mostrar dados
    public void mostrarDados() {

        System.out.println("===== EXAME ATENDIMENTO =====");
        System.out.println("Nome Médico: " + nomeMedico);
        System.out.println("Tipo Exame: " + exame.getTipo());
        System.out.println("Resultado: " + resultado);
        System.out.println("Observações: " + observacoes);
        System.out.println("Data/Hora: " + dataHora);
    }

    // MAIN
    public static void main(String[] args) {

        // Médico
        MedicoAtendimento medico =
                new MedicoAtendimento();

        medico.setId(1);
        medico.setNome("Carla Mendes");
        medico.setEspecialidade("Dermatologia");

        // Paciente
        PacienteEntity paciente =
                new PacienteEntity();

        paciente.setId(1);
        paciente.setNome("Carlos Silva");
        paciente.setIdade(28);

        // Atendimento
        AtendimentoEntity atendimento =
                new AtendimentoEntity();

        atendimento.setId(1);
        atendimento.setNomeMedico("Carla Mendes");
        atendimento.setPaciente(paciente);

        // Exame
        ExameEntity exame =
                new ExameEntity();

        exame.setId(1);
        exame.setTipo("Exame de Sangue");
        exame.setDescricao("Exame completo");

        // Exame Atendimento
        ExameAtendimento exameAtendimento =
                new ExameAtendimento(
                        atendimento,
                        "Carla Mendes",
                        exame,
                        LocalDateTime.now(),
                        "Negativo",
                        "Paciente saudável",
                        medico
                );

        exameAtendimento.mostrarDados();
    }
}

// =========================================
// CLASSE ATENDIMENTO
// =========================================
class AtendimentoEntity {

    private int id;
    private String nomeMedico;
    private PacienteEntity paciente;
    private LocalDateTime dataHora;

    private ArrayList<ProcedimentoAtendimento>
            listaProcedimentos;

    public AtendimentoEntity() {

        this.listaProcedimentos =
                new ArrayList<>();

        this.dataHora =
                LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}

// =========================================
// CLASSE MEDICO
// =========================================
class MedicoAtendimento {

    private int id;
    private String nome;
    private String especialidade;
    private LocalDateTime dataRegistro;

    // CONSTRUTOR CORRETO
    public MedicoAtendimento() {

        this.id = 0;
        this.nome = "Sem nome";
        this.especialidade = "Geral";
        this.dataRegistro =
                LocalDateTime.now();
    }

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

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(
            String especialidade) {

        this.especialidade = especialidade;
    }

    public LocalDateTime getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(
            LocalDateTime dataRegistro) {

        this.dataRegistro = dataRegistro;
    }
}

// =========================================
// CLASSE EXAME
// =========================================
class ExameEntity {

    private int id;
    private String tipo;
    private String descricao;

    public ExameEntity() {

        this.id = 0;
        this.tipo = "Exame Geral";
        this.descricao = "Sem descrição";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

// =========================================
// CLASSE PACIENTE
// =========================================
class PacienteEntity {

    private int id;
    private String nome;
    private int idade;

    public PacienteEntity() {

        this.id = 0;
        this.nome = "Paciente";
        this.idade = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeCompleto() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

// =========================================
// CLASSE PROCEDIMENTO
// =========================================
class ProcedimentoAtendimento {

    private int id;
    private String nomeProcedimento;
    private String descricao;
    private double valor;
    private String observacoes;
    private LocalDateTime dataHora;

    public ProcedimentoAtendimento() {

        this.id = 0;
        this.nomeProcedimento =
                "Procedimento padrão";

        this.descricao = "";
        this.valor = 0;
        this.observacoes = "";
        this.dataHora = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProcedimento() {
        return nomeProcedimento;
    }

    public void setNomeProcedimento(
            String nomeProcedimento) {

        this.nomeProcedimento =
                nomeProcedimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(
            String descricao) {

        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(
            String observacoes) {

        this.observacoes = observacoes;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(
            LocalDateTime dataHora) {

        this.dataHora = dataHora;
    }
}