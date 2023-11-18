import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Loja {
    private static List<NotaFiscal> notasFiscais = new ArrayList<NotaFiscal>();
    public NotaFiscal getNotaById(int id){
        for (NotaFiscal nota : notasFiscais){
            if (nota.getId() == id) return nota;
        }

        return null;
    }
    public List<NotaFiscal> getNotasWithProduto(Produto produto){
        List<NotaFiscal> notasComProduto = new ArrayList<NotaFiscal>();
        for (NotaFiscal nota : notasFiscais) {
            if (nota.getProdutos().contains(produto)) notasComProduto.add(nota);
        }

        return notasComProduto;
    }

    public void addNota(NotaFiscal nota){
        notasFiscais.add(nota);
    }
}
