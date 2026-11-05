package questao1;

import questao1.areas.AreaAuditoria;
import questao1.areas.AreaCompras;
import questao1.areas.AreaVendas;

public class Program {
    
    public static void main(String[] args) {
        var auditoria = new AreaAuditoria();
        var compras = new AreaCompras();
        var vendas = new AreaVendas();

        var notebook = new Produto("Notebook");
        var celular = new Produto("Celular");
        var tv = new Produto("TV");

        var estoque = new Estoque();

        estoque.subscribe(auditoria);
        estoque.subscribe(compras);
        estoque.subscribe(vendas);

        System.out.println();
        estoque.updateEstoque(notebook, 5);

        System.out.println();
        estoque.updateEstoque(notebook, 3);

        System.out.println();
        estoque.updateEstoque(celular, 2);

        estoque.unsubscribe(compras);
        estoque.unsubscribe(vendas);

        System.out.println();
        estoque.updateEstoque(tv, 6);

        System.out.println();
        estoque.updateEstoque(notebook, 4);

        System.out.println();
        estoque.updateEstoque(celular, 2);

        System.out.println();
        estoque.updateEstoque(celular, 2);
    }

}
