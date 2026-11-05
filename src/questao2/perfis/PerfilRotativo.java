package questao2.perfis;

public class PerfilRotativo implements Perfil {

    public static final double VALOR_HORA = 10.0;

    @Override
    public double cobrar(int minutos) {
        var horas = Math.ceil(minutos / 60.0);
        return horas * VALOR_HORA;
    }

}
