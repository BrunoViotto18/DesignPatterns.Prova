package questao3;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        var pedido1 = new Pedido(Bebida.Cha)
            .adicionarComplemento(Complemento.Leite);

        var pedido2 = new Pedido(Bebida.Espresso)
            .adicionarComplemento(Complemento.Calda)
            .adicionarComplemento(Complemento.Calda);

        var pedido3 = new Pedido(Bebida.Espresso)
            .adicionarComplemento(Complemento.Calda)
            .adicionarComplemento(Complemento.Chantilly);

        ArrayList<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);

        for (var pedido : pedidos) {
            System.out.println(pedido.getDescricao() + ": R$" + pedido.getPreco());
        }
    }

}
