package questao3;

public abstract class Produto {
    private String nome;
    private double preco;

    protected Produto(String nome, double preco) {
        super();
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }
}
