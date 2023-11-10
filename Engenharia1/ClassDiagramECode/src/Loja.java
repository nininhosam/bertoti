import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<NotaFiscal> notasFiscais = new ArrayList<NotaFiscal>();
    public NotaFiscal getNotaByCnpj(String cpnj){
        return null;
    }
    public NotaFiscal getNotaWithProduto(Produto produto){
        return null;
    }
    public void addNota(NotaFiscal nota){
        notasFiscais.add(nota);
    }
}
