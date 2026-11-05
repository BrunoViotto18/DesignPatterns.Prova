package questao2.perfis;

public class PerfilConveniado implements Perfil {

    public static final double DESCONTO_PERCENTUAL = 0.85;

    private Perfil perfil = new PerfilRotativo();

    @Override
    public double cobrar(int minutos) {
        
        if (minutos <= 30){
            return 0;
        }

        return perfil.cobrar(minutos) * DESCONTO_PERCENTUAL;

    }

}
