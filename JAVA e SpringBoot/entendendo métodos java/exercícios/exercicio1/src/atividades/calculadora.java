package atividades;

public class calculadora {
    public static void main(String[] args) {
        int a =  2;
        int b = 3;
        todasOperacoes(a, b);

        float c = 12.30f;
        bomAlgo(c);

        float d = emprestimo(5000,24);
        System.out.println(d);
    }

    private static void todasOperacoes(int n, int m) {
        System.out.println(n+m);
        System.out.println(n-m);
        System.out.println(n*m);
        System.out.println((float)n/m);
    }

    private static void bomAlgo(float hora){
        if(hora < 12){
            System.out.println("bom dia");
        }else if(hora < 18){
            System.out.println("boa tarde");
        }else{
            System.out.println("boa noite");
        }
    }

    private static float emprestimo(int valor, int parcelas){
        float taxa = 1.1f;
        if(valor > 100){
            taxa+=0.2;
        }
        if(parcelas > 12){
            taxa+=0.2;
        }
        return valor*taxa;
    }
}
