package array;

import java.util.Random;

public class Matrix {
    public static void main(String[] args) {
        Random random = new Random();

        int [][]M = new int [4][4];
        for (int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                M[i][j]=random.nextInt(9);
            }
        }
        for(int[] linha : M){
            for(int elemento : linha){
                System.out.print(elemento + " ");
            }
            System.out.println(" ");
        }
    }
}
