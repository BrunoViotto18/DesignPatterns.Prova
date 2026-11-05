package questao1.areas;

import questao1.Produto;

public class AreaCompras implements Area {

    @Override
    public void update(Produto produto, int quantidade) {
        if (quantidade >= 5) {
            return;
        }

        System.out.println("[Compras] AVISO: " + produto.nome + " está com estoque de " + quantidade + " produtos");
    }

}
