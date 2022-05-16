package exceptions;


import javax.swing.*;

public class Unchecked {
    public static void main(String[] args) {
        boolean continua = true;
        while (continua){
            String a = JOptionPane.showInputDialog("entrada1: ");
            String b = JOptionPane.showInputDialog("entrada2: ");
            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println(resultado);
                continua=false;
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "entrada invalida " + e.getMessage());
            }catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null, "impossível dividir por 0");
            }finally {
                System.out.println("entrou no finally");
            }
        }


    }
    static int dividir(int a, int b){
    return (a/b);
    }
}
