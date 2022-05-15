package exemplo;

public class Main {
    public static void main(String[] args) {
        compara(1,2);
        compara(1.5f,1.6f);
        compara('a', 'b');
        compara("oi", "ola");
        compara(true, false);
        compara(1, 1.5f);

    }

    public static void compara(int a, int b) {
        System.out.println(a == b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<=b);
    }
    public static void compara(float a, float b){
        System.out.println(a == b);
        System.out.println(a!=b);
        System.out.println(a>=b);
        System.out.println(a<b);
    }
    public static void compara(char a, char b){
        System.out.println(a == b);
        System.out.println(a!=b);
    }
    public static void compara(String a, String b){
        System.out.println(a == b);
        System.out.println(a!=b);
    }
    public static void compara(boolean a, boolean b){
        System.out.println(a == b);
        System.out.println(a!=b);
    }
    public static void compara(int a, float b){
        System.out.println(a>b);
    }
}