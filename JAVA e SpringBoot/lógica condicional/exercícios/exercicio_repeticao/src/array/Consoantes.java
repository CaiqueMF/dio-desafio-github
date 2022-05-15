package array;

public class Consoantes {
    public static void main(String[] args) {
        char[] vetor = {'a','b','c','d','e','f'};
        char[] conso = new char[6];
        int cont = 0;
        for(int i = 0; i < vetor.length;i++){
            switch (vetor[i]){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    break;
                default:
                   conso[cont]=vetor[i];
                   cont++;
            }
        }
        System.out.println(cont);
        for (int i = 0; i<cont;i++){
            System.out.println(conso[i]);
        }

    }
}
