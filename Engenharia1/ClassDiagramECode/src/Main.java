public class Main {
    public static void main(String[] args) {
        // Loja
        Loja loja = new Loja();
        // Notas
        NotaFiscal nf1 = new NotaFiscal("Mel Ltda");
        NotaFiscal nf2 = new NotaFiscal("Melirondro Ltda");
        NotaFiscal nf3 = new NotaFiscal("Meliuz Ltda");
        // Specs
        Specs specEx = new Specs(3, 2.0);
        Specs specEx2 = new Specs(5, 1.0);
        // Produtos
        Produto prod1 = new Produto("pr128", "Lapis", specEx);
        Produto prod2 = new Produto("pr129", "Caneta", specEx);
        Produto prod3 = new Produto("pr130", "Apontador", specEx2);
        Produto prod4 = new Produto("pr131", "Borracha", specEx2);

        // Produtos nas notas
        nf1.addProdutos(prod1);
        nf1.addProdutos(prod2);
        nf1.addProdutos(prod3);
        nf1.addProdutos(prod4);
            nf2.addProdutos(prod3);
        nf3.addProdutos(prod2);
        nf3.addProdutos(prod4);
        // Notas na loja
        loja.addNota(nf1);
        loja.addNota(nf2);
        loja.addNota(nf3);

        //Teste: Mostrando propriedades do produto pr130 na nota 1
        System.out.println(nf1.getProdutoById("pr130").getId() + " | " + nf1.getProdutoById("pr130").getNome() + " | " + nf1.getProdutoById("pr130").getSpecs().getValor());
        nf1.getProdutoById("pr130").getSpecs().Desconto(0.05);
        //Teste: Mostrando propriedades do produto pr130 na nota 1 pós desconto
        System.out.println(nf1.getProdutoById("pr130").getId() + " | " + nf1.getProdutoById("pr130").getNome() + " | " + nf1.getProdutoById("pr130").getSpecs().getValor());

        //Teste mostrando todos os produtos com o Spec "specEx"
        for (var produto : nf1.getProdutoBySpecs(specEx)){
            System.out.println(produto.getId() + " | " + produto.getNome());
        }

        //Teste: Monstrando getNotaById pegando cada nota por seu Id
        System.out.println(loja.getNotaById(1).getId());
        System.out.println(loja.getNotaById(2).getId());
        System.out.println(loja.getNotaById(3).getId());
        //Teste: Pegando id de todas as notas que tem o produto prod2 no meio
        for ( NotaFiscal nota :  loja.getNotasWithProduto(prod2)) {
            System.out.println(nota.getId());
        }
    }
}