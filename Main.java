
/**
 * Classe principal que inicia a aplicação.
 * O objetivo é instanciar o Controller e iniciar o loop principal do sistema.
 */
public class Main{
    public static void main(String[] args) {
        //switch
        //mflores@senacrs.com.br
        //Desenvolva um projeto completamente novo. Cria as classes Pessoa,
        //Pessoa Fisica e Pessoa juridica, processos, juiz, advogado.
        //Na classe Main crie o menu para interagir com o sistema
        
        
        // Cria uma instância do Controller, que gerencia toda a lógica da aplicação.
        Controller controller = new Controller();
        // Chama o método que inicia o menu e o loop de interação com o usuário.
        controller.iniciaSwitch();
        
        }
    }
