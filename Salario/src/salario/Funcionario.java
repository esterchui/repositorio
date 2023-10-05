
package salario;



public abstract class Funcionario {
    
    String nome;
    String CPF;
    String endereco;
    String fone;
    String setor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Funcionario() {
    }
    
    public Funcionario(String nome, String CPF, String endereco, String fone, String setor) {
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.fone = fone;
        this.setor = setor;
    }
    
     
}
