package exemplo;

public class Main {
    public static void main(String[] args) {
        boolean b1,b2,b3,b4;
        b1 = b3 = true;
        b2 = b4 = false;
        System.out.println(b1&&b2);
        System.out.println(b1&&b3);
        System.out.println(b2||b3);
        System.out.println(b2||b4);
        System.out.println(b1^b3);
        System.out.println(b4^b1);
        System.out.println(!b1);
        System.out.println(!b2);
        int i1,i2;
        float f1,f2;
        i1=i2=2;
        f1=f2=2.5f;
        System.out.println((i1>i2)||(f2<f1));
        System.out.println(((i1+i2)<(f2-f1))&&true);

    }
}
