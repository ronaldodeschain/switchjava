public class Juiz extends Pessoa{
    private String carteiraMagistrado;
    
    public Juiz(String nome, String email, String endereco, int telefone, 
                String carteiraMagistrado) {
        super(nome, email, endereco, telefone); 
        this.carteiraMagistrado = carteiraMagistrado;
    }


    public String getCarteiraMagistrado() {
        return carteiraMagistrado;
    }

    public void setCarteiraMagistrado(String carteiraMagistrado) {
        this.carteiraMagistrado = carteiraMagistrado;
    }
    @Override
    public String toString() {
        return getNome()+"\nCarteira de Magistrado: "+getCarteiraMagistrado()+"\n";
    }
}
