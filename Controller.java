
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Controller {
    
    //criando listas para acessar no switch
        List<PessoaFisica> listaDePessoasFisicas = new ArrayList<>();
        List<PessoaJuridica> listaDePessoasJuridicas = new ArrayList<>();
        List<Advogado> listaDeAdvogados = new ArrayList<>();
        List<Juiz> listaDejuizes = new ArrayList<>();
        List<Processo> listaDeProcessos = new ArrayList<>();

    //scanner para captura de dados
    Scanner scanner = new Scanner(System.in);
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
    //case 1
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
        PessoaFisica novaPessoa = new PessoaFisica(
            nome,email,endereco,telefone,cpf,idade);
        System.out.println("Pessoa Cadastrada: \n" +novaPessoa + "\n  com sucesso!");
        listaDePessoasFisicas.add(novaPessoa);

    }
    //case 2
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
        int cnpj = scanner.nextInt();   
        scanner.nextLine();     
        PessoaJuridica novaEmpresa = new PessoaJuridica(nome,email,endereco,
                                                        telefone,cnpj);
        System.out.println("Empresa Cadastrada: \n" +novaEmpresa + "\ncom sucesso!");
        listaDePessoasJuridicas.add(novaEmpresa);
        
    }
    //case 3
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
        scanner.nextLine();
        Advogado novoAdvogado = new Advogado(nome, email, endereco, telefone, oab);
        System.out.println("Advogado Cadastrado: \n" +novoAdvogado + "\ncom sucesso!");
        listaDeAdvogados.add(novoAdvogado);
    }
    //case 4
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
        scanner.nextLine();
        Juiz novoJuiz = new Juiz(nome,email,endereco,telefone,carteiraMagistrado);
        System.out.println("Juiz Cadastrado: \n" +novoJuiz + "\ncom sucesso!");
        listaDejuizes.add(novoJuiz);
    }
    //case 5
    public void adicionarProcesso() {
        System.out.println("Digite o codigo do processo: ");
        String codigoProcesso = scanner.nextLine();
        System.out.println("Digite o status do processo: ");
        String statusProcesso = scanner.nextLine();
        Processo novoProcesso = new Processo(codigoProcesso,statusProcesso);
        System.out.println("Processo Cadastrado: \n" +novoProcesso + "\ncom sucesso!");
        listaDeProcessos.add(novoProcesso);
        
    }
    case 6
    public void adicionarPessoaNoProcesso() {
        System.out.println("Digite o numero da pessoa que deseja adicionar ao processo: ");
        for (int i=0;i< listaDePessoasFisicas.size();i++){
            System.out.println(i + " - " + listaDePessoasFisicas.get(i).getNome());
        }
        int numeroPessoa = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o numero do processo que deseja adicionar a pessoa: ");
        for (int j=0;i<listaDeProcessos.size();j++){
            System.out.println(j + " - " + listaDeProcessos.get(j).getCodigoProcesso());
        }
        int numeroProcesso = scanner.nextInt();
        scanner.nextLine();
        listaDeProcessos.get(numeroProcesso).adicionaPessoaFisica(
            listaDePessoasFisicas.get(numeroPessoa));
        System.out.println(listaDePessoasFisicas.get(numeroPessoa).getNome()+
        " Foi adicionado ao processo com sucesso");     
    }
    //case 7 
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
    //case 8
    void adicionarAdvogadoNoProcesso() {
        
    }

}
