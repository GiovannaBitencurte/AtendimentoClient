import java.time.LocalDateTime;

public class MedicoAtendimento {

    private int id;
    private int medicoId;
    private int atendimentoId;
    private LocalDateTime dataHora;

    // Construtor vazio
    public MedicoAtendimento() {

        this.id = 0;
        this.medicoId = 0;
        this.atendimentoId = 0;
        this.dataHora = LocalDateTime.now();
    }

    // Construtor completo
    public MedicoAtendimento(int id,
                              int medicoId,
                              int atendimentoId,
                              LocalDateTime dataHora) {

        this.id = id;
        this.medicoId = medicoId;
        this.atendimentoId = atendimentoId;
        this.dataHora = dataHora;
    }

    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMedicoId() {
        return medicoId;
    }

    public void setMedicoId(int medicoId) {
        this.medicoId = medicoId;
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

    // Método mostrar dados
    public void mostrarDados() {

        System.out.println("===== MÉDICO ATENDIMENTO =====");
        System.out.println("ID: " + id);
        System.out.println("Médico ID: " + medicoId);
        System.out.println("Atendimento ID: " + atendimentoId);
        System.out.println("Data/Hora: " + dataHora);
    }

    @Override
    public String toString() {
        return "MedicoAtendimento{" +
                "id=" + id +
                ", medicoId=" + medicoId +
                ", atendimentoId=" + atendimentoId +
                ", dataHora=" + dataHora +
                '}';
    }
}