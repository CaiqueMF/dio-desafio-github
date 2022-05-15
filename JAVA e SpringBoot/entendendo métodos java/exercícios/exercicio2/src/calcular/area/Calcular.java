package calcular.area;

public class Calcular {
    public static float receberValor(float base){
        return base * base;
    }
    public static float receberValor(float base, float altura){
        return base * altura;
    }
    public static float receberValor(float base, float altura, float baseMenor){
        return (base + baseMenor)*altura/2;
    }

}
