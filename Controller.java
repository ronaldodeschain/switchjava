
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Classe Controller que gerencia toda a interação com o usuário e a 
 * lógica de negócio.
 * Centraliza as operações de cadastro, listagem e associação de entidades.
 */
public class Controller {
    
    // Listas para armazenar os dados cadastrados durante a execução do programa.
        List<PessoaFisica> listaDePessoasFisicas = new ArrayList<>();
        List<PessoaJuridica> listaDePessoasJuridicas = new ArrayList<>();
        List<Advogado> listaDeAdvogados = new ArrayList<>();
        List<Juiz> listaDejuizes = new ArrayList<>();
        List<Processo> listaDeProcessos = new ArrayList<>();

    // Objeto Scanner para capturar as entradas do usuário no console.
        Scanner scanner = new Scanner(System.in);

    // Variável para controlar a opção selecionada pelo usuário no menu. 
    // Inicia com -1.
        int opcao = -1;

    //nucleo da aplicação
    /**
     * Método principal que inicia e controla o loop da aplicação.
     * Exibe o menu, captura a opção do usuário e direciona para o método 
     * correspondente.
     * O loop continua até que o usuário escolha a opção de sair (0).
     */
    public void iniciaSwitch(){
        while(opcao != 0){
            
            exibeMenu();
                if(scanner.hasNextInt()){
                    opcao = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.println("Opção selecionada: "+opcao);
                }else{
                    System.out.println("Deve ser inserido um número inteiro");                   
                    // Limpa o buffer do scanner caso a entrada não seja um inteiro.
                    scanner.next();
                    continue; 
                }
                switch (opcao) {
                    case 1:
                        adicionaPessoaFisica();
                        break;
                    case 2:
                        adicionarPessoaJuridica();
                        break;
                    case 3:
                        adicionarAdvogado();
                        break;
                    case 4:
                        adicionarJuiz();
                        break;
                    case 5:
                        adicionarProcesso();
                        break;
                    case 6:
                        adicionarPessoaNoProcesso();
                        break;
                    case 7:
                        adicionarEmpresaNoProcesso();
                        break;
                    case 8:
                        adicionarAdvogadoNoProcesso();
                        break;
                    case 9:
                        adicionarJuizNoProcesso();
                        break;
                    case 10:
                        listarPessoasFisicas();
                        break;
                    case 11:
                        listarPessoasJuridicas();
                        break;
                    case 12:
                        listarAdvogados();
                        break;
                    case 13:
                        listarJuizes();
                        break;
                    case 14:
                        listarProcessos();
                        break;
                    case 15:
                        opcao = 0;
                        break;
                    default:
                        System.out.println("Escolha um dos numeros do menu");
                        break;
                }
                
        }
    }
    /**
     * Exibe o menu principal da aplicação no console, listando
     * todas as operações disponíveis para o usuário.
     */
    public void exibeMenu(){
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
        
    }
    /**
     * (Caso 1) Solicita os dados de uma nova Pessoa Física e a adiciona na lista.
     */
    void adicionaPessoaFisica() {
        System.out.println("Digite o nome da Pessoa: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o email do "+nome+": ");
        String email = scanner.nextLine();
        System.out.println("Digite o endereço do "+nome+": ");
        String endereco = scanner.nextLine();
        System.out.println("Digite o telefone do "+nome+": ");
        int telefone = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o CPF do "+nome+": ");
        String cpf = scanner.nextLine();
        System.out.println("Digite a idade do "+nome+": ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        PessoaFisica novaPessoa = new PessoaFisica(
            nome,email,endereco,telefone,cpf,idade);
        System.out.println("Pessoa Cadastrada: \n" +novaPessoa + "\n  com sucesso!");
        listaDePessoasFisicas.add(novaPessoa);

    }
    /**
     * (Caso 2) Solicita os dados de uma nova Pessoa Jurídica (Empresa) e a 
     * adiciona na lista.
     */
    void adicionarPessoaJuridica() {
        System.out.println("Digite o nome da Empresa: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o email do "+nome+": ");
        String email = scanner.nextLine();
        System.out.println("Digite o endereço do "+nome+": ");
        String endereco = scanner.nextLine();
        System.out.println("Digite o telefone do "+nome+": ");
        int telefone = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o CNPJ do "+nome+": ");
        String cnpj = scanner.nextLine();   
        PessoaJuridica novaEmpresa = new PessoaJuridica(nome,email,endereco,
                                                        telefone,cnpj);
        System.out.println("Empresa Cadastrada: \n" +novaEmpresa + "\ncom sucesso!");
        listaDePessoasJuridicas.add(novaEmpresa);
        
    }
    /**
     * (Caso 3) Solicita os dados de um novo Advogado e o adiciona na lista.
     */
    void adicionarAdvogado() {
        System.out.println("Digite o nome do Advogado: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o email do "+nome+": ");
        String email = scanner.nextLine();
        System.out.println("Digite o endereco do "+nome+":");
        String endereco = scanner.nextLine();
        System.out.println("Digite o telefone do "+nome+":");
        int telefone = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o OAB do "+nome+":");
        String oab = scanner.nextLine();
        Advogado novoAdvogado = new Advogado(nome, email, endereco, telefone, oab);
        System.out.println("Advogado Cadastrado: \n" +novoAdvogado + "\ncom sucesso!");
        listaDeAdvogados.add(novoAdvogado);
    }
    /**
     * (Caso 4) Solicita os dados de um novo Juiz e o adiciona na lista.
     */
    void adicionarJuiz() {
        System.out.println("Digite o nome do Juiz: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o email do "+nome+": ");
        String email = scanner.nextLine();
        System.out.println("Digite o endereco do "+nome+":");
        String endereco = scanner.nextLine();
        System.out.println("Digite o telefone do "+nome+":");
        int telefone = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o Carteira de Magistrado do "+nome+":");
        String carteiraMagistrado = scanner.nextLine();
        Juiz novoJuiz = new Juiz(nome,email,endereco,telefone,carteiraMagistrado);
        System.out.println("Juiz Cadastrado: \n" +novoJuiz + "\ncom sucesso!");
        listaDejuizes.add(novoJuiz);
    }
    /**
     * (Caso 5) Solicita os dados de um novo Processo e o adiciona na lista.
     */
    public void adicionarProcesso() {
        System.out.println("Digite o codigo do processo: ");
        String codigoProcesso = scanner.nextLine();
        System.out.println("Digite o status do processo: ");
        String statusProcesso = scanner.nextLine();
        Processo novoProcesso = new Processo(codigoProcesso,statusProcesso);
        System.out.println("Processo Cadastrado: \n" +novoProcesso + "\ncom sucesso!");
        listaDeProcessos.add(novoProcesso);
        
    }
    /**
     * (Caso 6) Associa uma Pessoa Física existente a um Processo existente.
     * O usuário seleciona a pessoa e o processo a partir de listas numeradas.
     */
    public void adicionarPessoaNoProcesso() {
        System.out.println("Digite o numero da pessoa que deseja adicionar ao processo: ");
        for (int i=0;i< listaDePessoasFisicas.size();i++){
            System.out.println(i + " - " + listaDePessoasFisicas.get(i).getNome());
        }
        int numeroPessoa = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o numero do processo que deseja adicionar a pessoa: ");
        for (int j=0;j<listaDeProcessos.size();j++){
            System.out.println(j + " - " + listaDeProcessos.get(j).getCodigoProcesso());
        }
        int numeroProcesso = scanner.nextInt();
        scanner.nextLine();
        listaDeProcessos.get(numeroProcesso).adicionaPessoaFisica(
            listaDePessoasFisicas.get(numeroPessoa));
        System.out.println(listaDePessoasFisicas.get(numeroPessoa).getNome()+
        " Foi adicionado ao processo com sucesso");     
    }
    /**
     * (Caso 7) Associa uma Pessoa Jurídica (Empresa) existente a um Processo
     * existente.
     * O usuário seleciona a empresa e o processo a partir de listas numeradas.
     */
    void adicionarEmpresaNoProcesso() {
        System.out.println("Digite o numero da empresa que deseja adicionar ao processo: ");
        for(int i =0;i < listaDePessoasJuridicas.size();i++){
            System.out.println(i + " - " + listaDePessoasJuridicas.get(i).getNome());
        }
        int numeroEmpresa = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o numero do processo que deseja adicionar a empresa: ");
        for (int j=0;j<listaDeProcessos.size();j++){
            System.out.println(j + " - " + listaDeProcessos.get(j).getCodigoProcesso());
        }
        int numeroProcesso = scanner.nextInt();
        scanner.nextLine();
        listaDeProcessos.get(numeroProcesso).adicionaPessoaJuridica(
            listaDePessoasJuridicas.get(numeroEmpresa));
        System.out.println(listaDePessoasJuridicas.get(numeroEmpresa).getNome()+
        " Foi adicionado ao processo com sucesso");
    }
    /**
     * (Caso 8) Define um Advogado como responsável por um Processo.
     * O usuário seleciona o advogado e o processo a partir de listas numeradas.
     */
    void adicionarAdvogadoNoProcesso() {
        System.out.println("Digite o nome do advogado para adicionar ao processo: ");
        for(int i=0;i<listaDeAdvogados.size();i++){
            System.out.println(i + " - " + listaDeAdvogados.get(i).getNome());
        }
        int numeroAdvogado = scanner.nextInt();
        scanner.nextLine();
        System.out.println(
            "Digite o numero do processo que deseja adiconar o Advogado: ");
        for(int j = 0;j <listaDeProcessos.size();j++){
            System.out.println(j + " - "+listaDeProcessos.get(j).getCodigoProcesso());
        }
        int numeroProcesso = scanner.nextInt();
        scanner.nextLine();
        listaDeProcessos.get(numeroProcesso).adicionaAdvogadoResponsavel
                                (listaDeAdvogados.get(numeroAdvogado));
    }
    /**
     * (Caso 9) Define um Juiz como responsável por um Processo.
     * O usuário seleciona o juiz e o processo a partir de listas numeradas.
     */
    void adicionarJuizNoProcesso() {
        System.out.println("Digite o numero do juiz a adiconar no processo: ");
        for (int i=0;i<listaDejuizes.size();i++){
            System.out.println(i + " - " + listaDejuizes.get(i).getNome());
        }
        int numeroDoJuiz = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o numero do processo a adicionar o juiz");
        for (int j=0;j<listaDeProcessos.size();j++){
            System.out.println(j + " - " + listaDeProcessos.get(j).getCodigoProcesso());
        }
        int numeroDoProcesso = scanner.nextInt();
        scanner.nextLine();
        listaDeProcessos.get(numeroDoProcesso).adicionaJuizResponsavel(
                                listaDejuizes.get(numeroDoJuiz));
        System.out.println(listaDejuizes.get(numeroDoJuiz).getNome()+
                            " Foi adicionado ao processo com sucesso");
    }
    /**
     * (Caso 10) Itera sobre a lista de Pessoas Físicas e imprime os detalhes 
     * de cada uma.
     */
    void listarPessoasFisicas() {
        System.out.println("Lista de Pessoas Cadastradas: \n");
        listaDePessoasFisicas.forEach(p -> System.out.println(p));
    }
    /**
     * (Caso 11) Itera sobre a lista de Pessoas Jurídicas e imprime os detalhes 
     * de cada uma.
     */
    void listarPessoasJuridicas() {
        System.out.println("Lista de Empresas Cadastradas: \n");
        listaDePessoasJuridicas.forEach(emp -> System.out.println(emp));
    }
    /**
     * (Caso 12) Itera sobre a lista de Advogados e imprime os detalhes de cada um.
     */
    void listarAdvogados() {
        System.out.println("Lista de Advogados Cadastrados \n");
        listaDeAdvogados.forEach(a -> System.out.println(a));
    }
    /**
     * (Caso 13) Itera sobre a lista de Juízes e imprime os detalhes de cada um.
     */
    void listarJuizes() {
        System.out.println("Lista de Juizes Cadastrados \n");
        listaDejuizes.forEach(j -> System.out.println(j));
    }
    /**
     * (Caso 14) Itera sobre a lista de Processos e imprime os detalhes de cada um.
     * A formatação da saída é controlada pelo método toString() da classe Processo.
     */
    void listarProcessos() {
        System.out.println("Lista de Processos \n");
        listaDeProcessos.forEach(p -> System.out.println(p));
    }





}
