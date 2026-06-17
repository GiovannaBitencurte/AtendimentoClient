import java.time .LocalDateTime;
public class ExameEntity {
   private String Exame;
   private String tipoExame;
   private String resultado;
   private LocalDateTime dataExame;
   private String medicoResponsavel;
   private String paciente;
   //Construtor de exame atendimento
    public ExameEntity() {
     Exame = "Exame de Sangue";
     tipoExame = "Sangue";
     resultado = "Positivo";
     dataExame = LocalDateTime.now();
     medicoResponsavel = "Dr. Silva";
     paciente = "João";
    }
    //Getters e setters
    public String getExame() {
        return Exame;
    }
    public void setExame(String exame) {
        Exame = exame;
    }
    public String getTipoExame() {
        return tipoExame;
    }
    public void setTipoExame(String tipoExame) {
        this.tipoExame = tipoExame;
    }
    public String getResultado() {
        return resultado;
    }
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    public LocalDateTime getDataExame() {
        return dataExame;
    }
    public void setDataExame(LocalDateTime dataExame) {
        this.dataExame = dataExame;
    }
    public String getMedicoResponsavel() {
        return medicoResponsavel;
    }
    public void setMedicoResponsavel(String medicoResponsavel) {
        this.medicoResponsavel = medicoResponsavel;
    }
    public String getPaciente() {
        return paciente;
    }
    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }
    

}
