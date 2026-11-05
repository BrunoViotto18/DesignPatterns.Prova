package questao2.perfis;

public class PerfilMesalista implements Perfil {

    public static final double VALOR_MENSAL = 100.0;

    @Override
    public double cobrar(int minutos) {
        return VALOR_MENSAL;
    }

}
