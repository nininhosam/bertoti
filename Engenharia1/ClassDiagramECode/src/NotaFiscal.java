import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NotaFiscal {
    private String cnpj;
    private LocalDateTime horaDeEmissao;
    private List<Produto> produtos = new ArrayList<Produto>();

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public LocalDateTime HoraDeEmissao() {
        return horaDeEmissao;
    }

    public void setHoraDeEmissao(LocalDateTime horaDeEmissao) {
        this.horaDeEmissao = horaDeEmissao;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void addProdutos(Produto produto) {
        this.produtos.add(produto);
    }
    public Produto getProdutoById(String id){
        for (Produto prod : produtos){
            if (Objects.equals(prod.getId(), id)) return prod;
        }
        return new Produto(null, null, null);
    }
    public List<Produto> getProdutoBySpecs(Specs specs){
        List<Produto> produtosMatch = new ArrayList<Produto>();
        for (Produto prod : produtos){
            if (prod.getSpecs().equals(specs)) produtosMatch.add(prod);
        }
        return produtosMatch;
    }
    public NotaFiscal(String cnpj){
        this.cnpj = cnpj;
        this.horaDeEmissao = LocalDateTime.now();
    }
}
