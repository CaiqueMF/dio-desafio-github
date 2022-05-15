package array;

import java.util.Random;

public class Aleatorio {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numAlestorio = new int[20];

        for(int i = 0; i < numAlestorio.length; i++){
            numAlestorio[i] = random.nextInt(100);
        }

        for( int numero : numAlestorio){
            System.out.println(numero);
        }
        for( int numero : numAlestorio){
            System.out.println(numero+1);
        }

    }
}
