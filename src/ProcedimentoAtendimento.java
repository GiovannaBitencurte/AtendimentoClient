import java.time.LocalDateTime;

public class ProcedimentoAtendimento {

    private int id;
    private int procedimentoId;
    private int atendimentoId;

    private LocalDateTime dataHora;

    private String descricao;
    private double valor;

    private FuncionarioEntity funcionario;
    private AtendimentoEntity atendimento;

    private String nomeProcedimento;
    private String nomeFuncionario;
    private String nomePaciente;
    private String nomeMedico;

    private String observacoes;

    private MedicoAtendimento medicoAtendimento;

    // Construtor vazio
    public ProcedimentoAtendimento() {

        this.id = 0;
        this.procedimentoId = 0;
        this.atendimentoId = 0;

        this.dataHora = LocalDateTime.now();

        this.descricao = "";
        this.valor = 0.0;

        this.funcionario = new FuncionarioEntity();
        this.atendimento = new AtendimentoEntity();

        this.nomeProcedimento = "";
        this.nomeFuncionario = "";
        this.nomePaciente = "";
        this.nomeMedico = "";

        this.observacoes = "";

        this.medicoAtendimento = new MedicoAtendimento();
    }

    // Construtor completo
    public ProcedimentoAtendimento(int id,
                                   int procedimentoId,
                                   int atendimentoId,
                                   LocalDateTime dataHora,
                                   String descricao,
                                   double valor,
                                   FuncionarioEntity funcionario,
                                   AtendimentoEntity atendimento,
                                   String nomeProcedimento,
                                   String nomeFuncionario,
                                   String nomePaciente,
                                   String nomeMedico,
                                   String observacoes,
                                   MedicoAtendimento medicoAtendimento) {

        this.id = id;
        this.procedimentoId = procedimentoId;
        this.atendimentoId = atendimentoId;
        this.dataHora = dataHora;
        this.descricao = descricao;
        this.valor = valor;
        this.funcionario = funcionario;
        this.atendimento = atendimento;
        this.nomeProcedimento = nomeProcedimento;
        this.nomeFuncionario = nomeFuncionario;
        this.nomePaciente = nomePaciente;
        this.nomeMedico = nomeMedico;
        this.observacoes = observacoes;
        this.medicoAtendimento = medicoAtendimento;
    }

    // GETTERS E SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProcedimentoId() {
        return procedimentoId;
    }

    public void setProcedimentoId(int procedimentoId) {
        this.procedimentoId = procedimentoId;
    }

    public int getAtendimentoId() {
        return atendimentoId;
    }

    public void setAtendimentoId(int atendimentoId) {
        this.atendimentoId = atendimentoId;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public FuncionarioEntity getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(FuncionarioEntity funcionario) {
        this.funcionario = funcionario;
    }

    public AtendimentoEntity getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(AtendimentoEntity atendimento) {
        this.atendimento = atendimento;
    }

    public String getNomeProcedimento() {
        return nomeProcedimento;
    }

    public void setNomeProcedimento(String nomeProcedimento) {
        this.nomeProcedimento = nomeProcedimento;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public MedicoAtendimento getMedicoAtendimento() {
        return medicoAtendimento;
    }

    public void setMedicoAtendimento(MedicoAtendimento medicoAtendimento) {
        this.medicoAtendimento = medicoAtendimento;
    }

    // Método mostrar dados
    public void mostrarDados() {

        System.out.println("===== PROCEDIMENTO ATENDIMENTO =====");

        System.out.println("ID: " + id);
        System.out.println("ID Procedimento: " + procedimentoId);
        System.out.println("ID Atendimento: " + atendimentoId);

        System.out.println("Data/Hora: " + dataHora);

        System.out.println("Descrição: " + descricao);

        System.out.println("Valor: " + valor);

        System.out.println("Nome Procedimento: " + nomeProcedimento);

        System.out.println("Nome Funcionário: " + nomeFuncionario);

        System.out.println("Nome Paciente: " + nomePaciente);

        System.out.println("Nome Médico: " + nomeMedico);

        System.out.println("Observações: " + observacoes);
    }

    @Override
    public String toString() {

        return "ProcedimentoAtendimento{" +
                "id=" + id +
                ", procedimentoId=" + procedimentoId +
                ", atendimentoId=" + atendimentoId +
                ", dataHora=" + dataHora +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", funcionario=" + funcionario +
                ", atendimento=" + atendimento +
                ", nomeProcedimento='" + nomeProcedimento + '\'' +
                ", nomeFuncionario='" + nomeFuncionario + '\'' +
                ", nomePaciente='" + nomePaciente + '\'' +
                ", nomeMedico='" + nomeMedico + '\'' +
                ", observacoes='" + observacoes + '\'' +
                ", medicoAtendimento=" + medicoAtendimento +
                '}';
    }
}
    