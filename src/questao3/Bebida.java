package questao3;

public class Bebida extends Produto {

    public static final Bebida Espresso = new Bebida("Espresso", 5.0);
    public static final Bebida Cha = new Bebida("Chá", 3.0);

    protected Bebida(String nome, double preco) {
        super(nome, preco);
    }

}
