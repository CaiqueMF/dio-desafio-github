package repeticao;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int entrada=scan.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(entrada + " X " + i + " = " + (entrada*i));
        }
    }
}
