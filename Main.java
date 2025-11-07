import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //switch
        //mflores@senacrs.com.br
        //Desenvolva um projeto completamente novo. Cria as classes Pessoa,
        //Pessoa Fisica e Pessoa juridica, processos, juiz, advogado.
        //Na classe Main crie o menu para interagir com o sistema
        //scanner para receber input
        int opcao = 20;
        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();
        controller.exibeMenu();

        

        PessoaFisica fulano = new PessoaFisica("fulano da silva",
        "email", "endereco", 15784, "57.84", 
        12); 
        Advogado adv1 = new Advogado("seu advogado aqui",
        "email do advogado", "Onde ele se esconde",
        154780, "Rob171"); 
        
        Processo processo1 = new Processo("p1","iniciado", adv1); 
        Processo processo2 = new Processo("p2","em andamento");
        
        fulano.adicionaProcesso(processo1);
        fulano.adicionaProcesso(processo2);
        adv1.adicionaProcesso(processo1); 

        System.out.println("Processo do "+fulano.getNome());
        System.out.println("Processos: "+fulano.getProcessos());
        System.out.println("processos do Advogado "+adv1.getNome());
        System.out.println("Processos: "+adv1.getProcessos());
        processo1.adicionaPessoaFisica(fulano);
        processo1.adicionaPessoaFisica(fulano);
        System.out.println("String do processo 1: "+processo1);
        while(opcao != 0){
            
               controller.exibeMenu();
                if(scanner.hasNextInt()){
                    opcao = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.println("opcao selecionada: "+opcao);
                }else{
                    System.out.println("Deve ser inserido um número inteiro");
                    System.out.println(
                        "Escolha uma das opções: ");
                    scanner.next();                     
                }
                switch (opcao) {
                    case 1:
                        controller.adicionaPessoaFisica();
                        break;
                    case 2:
                        controller.adicionarPessoaJuridica();
                        break;
                    case 3:
                        controller.adicionarAdvogado();
                        break;
                    case 4:
                        controller.adicionarJuiz();
                        break;
                    case 5:
                       controller.adicionarProcesso();
                        break;
                    case 6:
                        controller.adicionarPessoaNoProcesso();
                        break;
                    case 7:
                        //adicionar empresa a um processo
                        break;
                    case 8:
                        //adicionar advogado responsável a um processo
                        break;
                    case 9:
                        //adicionar processo a um juiz
                        break;
                    case 10:
                        //listar pessoas fisicas
                        break;
                    case 11:
                        //listar pessoas juridicas
                        break;
                    case 12:
                        //listar advogados
                        break;
                    case 13:
                        //listar juizes
                        break;
                    case 14:
                        //listar processos
                        break;
                    case 15:
                        //sair da aplicação
                        break;
                    default:
                        throw new AssertionError();
                }
                
        }
        
        }
    }
