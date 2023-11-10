public class Specs {
    private double valor;
    private int quantidade;

    public Specs(int quantidade, double valor) {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void Desconto(double desconto){
        this.valor -= this.valor * desconto;
    }
}
