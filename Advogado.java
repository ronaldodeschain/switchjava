public class Advogado extends Pessoa{
    private String oab;
    
    public Advogado(String nome, String email, String endereco, int telefone, 
                    String oab) {
        super(nome, email, endereco, telefone); 
        this.oab = oab;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    @Override
    public String toString() {
        return getNome()+"\nCPF: "+getOab()+"\n";
    }

    
}
