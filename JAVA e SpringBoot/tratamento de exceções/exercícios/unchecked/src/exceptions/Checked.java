package exceptions;

import javax.swing.*;
import java.io.*;

public class Checked {
    public static void main(String[] args){
        String NomeDoArquivo = "teste.txt";
        try {
            ImprimirArquivoNoConsole(NomeDoArquivo);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "revisar nome do arquivo");
        }catch (IOException e) {
            JOptionPane.showMessageDialog(null, "erro inesperado");
        }

        System.out.println("o programa conntinua");
    }
    public static void ImprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);
        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line= br.readLine();
        }while (line != null);
        bw.flush();
        br.close();
    }
}
