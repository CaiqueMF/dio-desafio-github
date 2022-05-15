package repeticao;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;
        System.out.println("nota: ");
        nota = scan.nextInt();
        while (nota>10 || nota < 0){
            System.out.println("nota invalida, insira novamente");
            nota = scan.nextInt();
        }
    }
}
