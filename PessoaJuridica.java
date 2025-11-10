public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, String email, String endereco, int telefone,
                        String cnpj) {
        super(nome, email, endereco, telefone); 
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    @Override
    public String toString() {
        return getNome()+"\nCNPJ: "+getCnpj()+"\n";
    }
}
