public class PessoaFisica extends Pessoa {
    protected String cpf;
    protected int idade;

    public PessoaFisica(String nome, String email, String endereco, int telefone,
                        String cpf, int idade) {
        super(nome, email, endereco, telefone); 
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
