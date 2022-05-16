package array;
import java.io.IOException;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        double soma =0;
        int entrada;
        do{
            entrada=leitor.nextInt();
            if(entrada>0){
                soma+=entrada;
                cont++;
            }
        }while(entrada > 0);
        double media = soma/cont;
        System.out.printf("%.2f%n", media);
    }
}
