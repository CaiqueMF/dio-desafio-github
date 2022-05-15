package calcular.area;

public class Main {
    public static void main(String[] args) {
        float a,b,c;
        a = 5;
        b = 7.5f;
        c = 12;
        System.out.println(Calcular.receberValor(a));
        System.out.println(Calcular.receberValor(a,b));
        System.out.println(Calcular.receberValor(a,b,c));
    }
}
