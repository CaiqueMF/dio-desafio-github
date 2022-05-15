package repeticao;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int par=0;
        int impar=0;
        int entrada;
        for(int i = 0; i < n; i++){
            entrada=scan.nextInt();
            if(entrada%2==0){
                par++;
            }else {
                impar++;
            }
        }
        System.out.println("par: " + par);
        System.out.println("impar: " + impar);
    }
}
