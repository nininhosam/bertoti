public class Main {
    public static void main(String[] args) {
        NotaFiscal nf1 = new NotaFiscal("Mel Ltda");
        Specs specEx = new Specs(3, 2.0);
        Specs specEx2 = new Specs(5, 1.0);

        Produto prod1 = new Produto("pr128", "Lapis", specEx);
        Produto prod2 = new Produto("pr129", "Caneta", specEx);
        Produto prod3 = new Produto("pr130", "Apontador", specEx2);
        Produto prod4 = new Produto("pr131", "Borracha", specEx2);
        nf1.addProdutos(prod1);
        nf1.addProdutos(prod2);
        nf1.addProdutos(prod3);
        nf1.addProdutos(prod4);


        System.out.println(nf1.getProdutoById("pr130").getId() + " | " + nf1.getProdutoById("pr130").getNome() + " | " + nf1.getProdutoById("pr130").getSpecs().getValor());
        nf1.getProdutoById("pr130").getSpecs().Desconto(0.05);
        System.out.println(nf1.getProdutoById("pr130").getId() + " | " + nf1.getProdutoById("pr130").getNome() + " | " + nf1.getProdutoById("pr130").getSpecs().getValor());
        System.out.println("\n");
        for (var produto : nf1.getProdutoBySpecs(specEx)){

            System.out.println(produto.getId() + " | " + produto.getNome());
        }

    }
}