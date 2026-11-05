package questao3;

import java.util.HashMap;

public class Pedido {

    private final Bebida bebida;
    private final HashMap<Complemento, Integer> complementos = new HashMap<>();

    public Pedido(Bebida bebida) {
        this.bebida = bebida;
    }

    public Pedido adicionarComplemento(Complemento complemento) {
        var quantidade = this.complementos.getOrDefault(complemento, 0);

        this.complementos.put(complemento, quantidade + 1);

        return this;
    }

    public String getDescricao() {
        if (this.complementos.size() == 0) {
            return bebida.getNome();
        }

        var descricao = bebida.getNome() + " com";

        var first = true;
        for (var complemento : this.complementos.entrySet()) {
            if (!first) {
                descricao += ",";
            } else {
                first = false;
            }

            descricao += " " + complemento.getValue() + "x" + complemento.getKey().getNome();
        }

        return descricao;
    }

    public double getPreco() {
        var precoComplementos = 0.0;
        for (var complemento : this.complementos.entrySet()) {
            precoComplementos += complemento.getKey().getPreco() * complemento.getValue();
        }

        return this.bebida.getPreco() + precoComplementos;
    }

}
