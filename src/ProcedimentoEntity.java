import java.time .LocalDateTime;
public class ProcedimentoEntity {
    private int id;
    private AtendimentoEntity atendimento;
    private LocalDateTime dataHora;
    private String descricao;
    private String resultado;
    private String observacoes;
    private MedicoAtendimento medicoAtendimento;
    private String nomeMedico;
    private String nomePaciente;
    private String nomeProcedimento;
    //Construtor de Procedimento
    public ProcedimentoEntity(int id, AtendimentoEntity atendimento, LocalDateTime dataHora, String descricao,
            String resultado, String observacoes, MedicoAtendimento medicoAtendimento, String nomeMedico,
            String nomePaciente, String nomeProcedimento) {
        this.id = id;
        this.atendimento = atendimento;
        this.dataHora = dataHora;
        this.descricao = descricao;
        this.resultado = resultado;
        this.observacoes = observacoes;
        this.medicoAtendimento = medicoAtendimento;
        this.nomeMedico = nomeMedico;
        this.nomePaciente = nomePaciente;
        this.nomeProcedimento = nomeProcedimento;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public AtendimentoEntity getAtendimento() {
        return atendimento;
    }
    public void setAtendimento(AtendimentoEntity atendimento) {
        this.atendimento = atendimento;
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
    public String getResultado() {
        return resultado;
    }
    public void setResultado(String resultado) {
        this.resultado = resultado;
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
    public String getNomeMedico() {
        return nomeMedico;
    }
    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }
    public String getNomePaciente() {
        return nomePaciente;
    }
    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }
    public String getNomeProcedimento() {
        return nomeProcedimento;
    }
    public void setNomeProcedimento(String nomeProcedimento) {
        this.nomeProcedimento = nomeProcedimento;
    }
    public void mostrarDados() {
        System.out.println("===== PROCEDIMENTO =====");
        System.out.println("ID: " + id);
        System.out.println("Atendimento ID: " + atendimento.getId());
        System.out.println("Data/Hora: " + dataHora);
        System.out.println("Descrição: " + descricao);
        System.out.println("Resultado: " + resultado);
        System.out.println("Observações: " + observacoes);
        System.out.println("Médico: " + nomeMedico);
        System.out.println("Paciente: " + nomePaciente);
        System.out.println("Procedimento: " + nomeProcedimento);
    } 
    @Override
    public String toString() {
        return "ProcedimentoEntity{" +
                "id=" + id +
                ", atendimento=" + atendimento +
                ", dataHora=" + dataHora +
                ", descricao='" + descricao + '\'' +
                ", resultado='" + resultado + '\'' +
                ", observacoes='" + observacoes + '\'' +
                ", medicoAtendimento=" + medicoAtendimento +
                ", nomeMedico='" + nomeMedico + '\'' +
                ", nomePaciente='" + nomePaciente + '\'' +
                ", nomeProcedimento='" + nomeProcedimento + '\'' +
                '}';
    }  
}
