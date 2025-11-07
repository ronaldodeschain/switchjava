import java.util.ArrayList;
import java.util.List;
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
        //criando listas para acessar no switch
        List<PessoaFisica> listaDePessoasFisicas = new ArrayList<>();
        List<PessoaJuridica> listaDePessoasJuridicas = new ArrayList<>();
        List<Advogado> listaDeAdvogados = new ArrayList<>();
        List<Juiz> listaDejuizes = new ArrayList<>();
        List<Processo> listaDeProcessos = new ArrayList<>();

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
            
                System.out.println("""
                    
                ------ Sistema de Cadastro de usuários e processos. -----
                ------             Digite qual sua opção:           -----

                *   1 - Cadastrar Pessoa Fisica
                *   2 - Cadastrar Pessoa Juridica
                *   3 - Cadastrar Advogado
                *   4 - Cadastrar Juiz
                *   5 - Cadastrar Processo
                *   6 - Adicionar pessoa a um processo.
                *   7 - Adicionar empresa a um processo.
                *   8 - Adicionar advogado responsável a um processo.
                *   9 - Adicionar processo a um juiz.
                *  10 - Listar Pessoas Fisicas.
                *  11 - Listar Pessoas Juridicas.
                *  12 - Listar Advogados.
                *  13 - Listar Juizes.
                *  14 - Listar Processos.
                *  15 - Sair da aplicação.
                """);
                if(scanner.hasNextInt()){
                    opcao = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.println("opcao selecionada: "+opcao);
                }else{
                    System.out.println(
                        "Escolha uma das opções: (deve ser inserido um numero)");
                    scanner.next(); 
                    opcao = 20;
                }
                
                
        }
        
        }
    }
