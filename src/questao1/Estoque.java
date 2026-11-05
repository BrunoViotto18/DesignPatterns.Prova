package questao1;

import java.util.HashMap;
import java.util.HashSet;

import questao1.areas.Area;

public class Estoque {

    private HashMap<Produto, Integer> produtos = new HashMap<>();
    private HashSet<Area> areas = new HashSet<>();

    public void subscribe(Area area) {
        this.areas.add(area);
    }

    public void unsubscribe(Area area) {
        this.areas.remove(area);
    }

    public void updateEstoque(Produto produto, int novaQuantidade) {
        var quantidadeVelha = this.produtos.put(produto, novaQuantidade);

        if (quantidadeVelha == null && novaQuantidade == 0){
            return;
        }

        if (quantidadeVelha != null && quantidadeVelha == novaQuantidade) {
            return;
        }

        this.notificarAreas(produto, novaQuantidade);
    }

    private void notificarAreas(Produto produto, int quantidade) {
        for (var area : this.areas) {
            area.update(produto, quantidade);
        }
    }

}
