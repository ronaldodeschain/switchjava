public class PessoaJuridica extends Pessoa {
    private int cnpj;

    public PessoaJuridica(String nome, String email, String endereco, int telefone,
                        int cnpj) {
        super(nome, email, endereco, telefone); 
        this.cnpj = cnpj;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
    
    @Override
    public String toString() {
        return getNome()+"\nCNPJ: "+getCnpj();
    }
}
