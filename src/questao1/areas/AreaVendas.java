package questao1.areas;

import java.util.HashMap;

import questao1.Produto;

public class AreaVendas implements Area {
    private HashMap<Produto, Integer> produtos = new HashMap<>();

    @Override
    public void update(Produto produto, int quantidade) {
        var quantidadeAntiga = this.produtos.get(produto);

        this.produtos.put(produto, quantidade);

        if (quantidade <= 0) {
            return;
        }

        if ((quantidadeAntiga == null || quantidadeAntiga <= 0) && quantidade > 0){
            System.out.println("[Vendas] Produto " + produto.nome + " está com estoque disponível");
        }
    }

}
