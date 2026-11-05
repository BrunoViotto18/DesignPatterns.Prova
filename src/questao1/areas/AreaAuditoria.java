package questao1.areas;

import questao1.Produto;

public class AreaAuditoria implements Area {

    @Override
    public void update(Produto produto, int quantidade) {
        System.out.println("[Auditoria] Produto " + produto.nome + ": Novo estoque de " + quantidade);
    }

}
