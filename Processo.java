import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Processo {
    private String codigoProcesso;
    private String statusProcesso;
    private Advogado advogadoResponsavel; 
    private List<PessoaFisica> listaDePessoasFisicas = new ArrayList<>();
    private List<PessoaJuridica> listaDePessoasJuridicas = new ArrayList<>();

    
    
    //sera que preciso desse construtor?
    public Processo(String codigoProcesso, String statusProcesso) {
        this.codigoProcesso = codigoProcesso;
        this.statusProcesso = statusProcesso;
    }
    public Processo(String codigoProcesso, String statusProcesso, 
                    Advogado advogadoResponsavel) {
        this.codigoProcesso = codigoProcesso; 
        this.statusProcesso = statusProcesso;
        this.advogadoResponsavel = advogadoResponsavel;
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
    //me puxei xD
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
                (!listaDePessoasFisicas.isEmpty() ? 
                ", Pessoas envolvidas no processo: ["
                + nomesPessoasFisicas + "]" : "") +
                (!listaDePessoasJuridicas.isEmpty()
                ? ", Empresas envolvidas no processo: ["
                + nomesPessoasJuridicas : "") + "]";
    }
}
