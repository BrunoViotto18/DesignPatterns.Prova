package questao2;

import questao2.perfis.PerfilConveniado;
import questao2.perfis.PerfilMesalista;
import questao2.perfis.PerfilRotativo;

public class Program {

    public static void main(String[] args) {
        var rotativo = new PerfilRotativo();
        var mensalista = new PerfilMesalista();
        var conveniado = new PerfilConveniado();

        var ticket = new Ticket("AAA0A00", 90, rotativo);
        System.out.println("Rotativo (" + ticket.getMinutos() + " minutos): R$" + ticket.cobrar());

        ticket.perfil = mensalista;
        System.out.println("Mensalista (" + ticket.getMinutos() + " minutos): R$" + ticket.cobrar());

        ticket.perfil = conveniado;
        System.out.println("Conveniado (" + ticket.getMinutos() + " minutos): R$" + ticket.cobrar());
    }

}
