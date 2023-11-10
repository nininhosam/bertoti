public class Produto {
    private String id;
    private String nome;
    private Specs specs;

    public Produto(String id, String nome, Specs specs) {
        this.id = id;
        this.nome = nome;
        this.specs = specs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Specs getSpecs() {
        return specs;
    }

    public void setSpecs(Specs specs) {
        this.specs = specs;
    }
}
