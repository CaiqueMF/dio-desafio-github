package repeticao;

import java.util.Scanner;

public class MairEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maior=-2147483648;
        float media=0;
        int resposta;
        for(int i = 0; i<5; i++){
            resposta=scan.nextInt();
            if(resposta>maior){
                maior = resposta;
            }
            media+=resposta;
        }
        media/=5;
        System.out.println("maior: " + maior);
        System.out.println("média: " + media);
    }
}
