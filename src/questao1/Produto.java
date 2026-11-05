package questao1;

public class Produto {
    public String nome;

    public Produto(String nome) {
        super();
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Produto produto)) {
            return false;
        }

        return this.nome == produto.nome;
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }
}
