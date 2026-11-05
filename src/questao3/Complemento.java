package questao3;

public class Complemento extends Produto {

    public static final Complemento Leite = new Complemento("Leite", 1.5);
    public static final Complemento Chantilly = new Complemento("Chantilly", 3.5);
    public static final Complemento Calda = new Complemento("Calda", 2.5);

    protected Complemento(String nome, double preco) {
        super(nome, preco);
    }

}
