import java.time .LocalDateTime;
public class PessoasEntity {
        private String cpf;
        private String nome;
        private String email;
        private String telefone;
        private String endereco;
        private String Pessoas;
        public PessoasEntity(String cpf, String nome, String email, String telefone, String endereco) {
            this.cpf = cpf;
            this.nome = nome;
            this.email = email;
            this.telefone = telefone;
            this.endereco = endereco;
        }
        public PessoasEntity(String cpf2, String nome2, Object email2, String telefone2, String endereco2) {
            //TODO Auto-generated constructor stub
        }
        public String getCpf() {
            return cpf;
        }
        public void setCpf(String cpf) {
            this.cpf = cpf;
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
        public String getEndereco() {
            return endereco;
        }
        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }
        public String getPessoas() {
            return Pessoas;
        }
        public void setPessoas(String pessoas) {
            Pessoas = pessoas;
        }
       
}
