import java.util.List;

public abstract class Pessoa{
    protected String nome;
    protected String email;
    protected String endereco;
    protected int telefone;
    protected List<Processo> processos;

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected String getEndereco() {
        return endereco;
    }

    protected void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    protected int getTelefone() {
        return telefone;
    }

    protected void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public List<Processo> getProcessos() {
        return processos;
    }

    public void setProcessos(List<Processo> processos) {
        this.processos = processos;
    }

    

}    

