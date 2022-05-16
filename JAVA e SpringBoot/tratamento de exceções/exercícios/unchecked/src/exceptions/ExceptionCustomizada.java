package exceptions;

import javax.swing.*;
import java.io.*;

public class ExceptionCustomizada {
    public static void main(String[] args){
        String nomeDoArquivo = JOptionPane.showInputDialog("nome do arquivo");
        imprimirArquivoNoConsole(nomeDoArquivo);
        System.out.println("programa continua");
    }
    public static void imprimirArquivoNoConsole(String nomeDoArquivo){
        try{
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            br.close();
        } catch (ImpossivelAverturaDeArquivoException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }catch (IOException ex){
            JOptionPane.showMessageDialog(null, "erro não eesperado");
        }
    }
    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAverturaDeArquivoException {
        File file = new File(nomeDoArquivo);
        try{
            return new BufferedReader(new FileReader(nomeDoArquivo));
        }catch (FileNotFoundException e){
            throw new ImpossivelAverturaDeArquivoException(file.getName(), file.getPath());
        }
    }
}

class ImpossivelAverturaDeArquivoException extends Exception{
    private String nomeDoArquivo;
    private String diretorio;

    public ImpossivelAverturaDeArquivoException(String nomeDoArquivo, String diretorio) {
        super("o arquivo" + nomeDoArquivo + "não foi encontado em " + diretorio);
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorio = diretorio;
    }
    @Override
    public String toString(){
        return "impossível abertura do arquivo";
    }
}