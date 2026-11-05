package questao2;

import questao2.perfis.Perfil;

public class Ticket {

    private String placa;
    private int minutos;

    public Perfil perfil;

    public Ticket(String placa, int minutos, Perfil perfil) {
        super();
        this.placa = placa;
        this.minutos = minutos;
        this.perfil = perfil;
    }

    public String getPlaca() {
        return this.placa;
    }

    public int getMinutos() {
        return this.minutos;
    }

    public double cobrar() {
        return this.perfil.cobrar(this.minutos);
    }

}
