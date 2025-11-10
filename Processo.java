import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Representa um processo judicial no sistema.
 * Contém informações sobre o código, status, e as partes envolvidas
 * (advogado, juiz, pessoas físicas e jurídicas).
 */
class Processo {
    // Atributos da classe Processo
    private String codigoProcesso;
    private String statusProcesso;
    private Advogado advogadoResponsavel;
    private Juiz juizResponsavel; 
    private List<PessoaFisica> listaDePessoasFisicas = new ArrayList<>();
    private List<PessoaJuridica> listaDePessoasJuridicas = new ArrayList<>();
    
    
    
    public Processo(String codigoProcesso, String statusProcesso) {
        this.codigoProcesso = codigoProcesso;
        this.statusProcesso = statusProcesso;
    }
    public String getCodigoProcesso() {
        return codigoProcesso;
    }
    public void setCodigoProcesso(String codigoProcesso) {
        this.codigoProcesso = codigoProcesso;
    }
    public String getStatusProcesso() {
        return statusProcesso;
    }
    public void setStatusProcesso(String statusProcesso) {
        this.statusProcesso = statusProcesso;
    }

    public Advogado getAdvogadoResponsavel() { // Novo getter
        return advogadoResponsavel;
    }

    public void adicionaAdvogadoResponsavel(Advogado advogadoResponsavel) { 
        this.advogadoResponsavel = advogadoResponsavel;
    }
    
    public Juiz getJuizResponsavel() {
        return juizResponsavel;
    }

    public void adicionaJuizResponsavel(Juiz juizResponsavel) {
        this.juizResponsavel = juizResponsavel;
    }
    
    public List<PessoaFisica> getListaDePessoasFisicas() {
        return listaDePessoasFisicas;
    }
    public void adicionaPessoaFisica(PessoaFisica pessoaFisica) {
        this.listaDePessoasFisicas.add(pessoaFisica);
    }
    public List<PessoaJuridica> getListaDePessoasJuridicas() {
        return listaDePessoasJuridicas;
    }
    public void adicionaPessoaJuridica(PessoaJuridica pessoaJuridica) {
        this.listaDePessoasJuridicas.add(pessoaJuridica);
    }

    /**
     * Sobrescreve o método toString() para fornecer uma representação textual 
     * do objeto Processo.
     * A saída é formatada dinamicamente, mostrando os dados do advogado, juiz 
     * e das listas
     * de pessoas e empresas apenas se eles não forem nulos ou vazios.
     */
    @Override
    public String toString() {
        String nomesPessoasFisicas = listaDePessoasFisicas.stream()
                .map(Pessoa::getNome)
                .collect(Collectors.joining(", "));
        String nomesPessoasJuridicas = listaDePessoasJuridicas.stream()
                .map(Pessoa::getNome)
                .collect(Collectors.joining(", "));

        return "Processo [codigoProcesso=" + codigoProcesso +
                ", statusProcesso=" + statusProcesso +
                (advogadoResponsavel != null ? ", Advogado: " + 
                advogadoResponsavel.getNome() : "") +
                (juizResponsavel != null ? ", Juiz: " + 
                juizResponsavel.getNome() : "") +
                (!listaDePessoasFisicas.isEmpty() ? 
                ", Pessoas envolvidas no processo: ["
                + nomesPessoasFisicas + "]" : "") +
                (!listaDePessoasJuridicas.isEmpty()
                ? ", Empresas envolvidas no processo: ["
                + nomesPessoasJuridicas : "") + "]";
    }
}
