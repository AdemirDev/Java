package programa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class GerarArquivoTexto {

    public static void main(String[] args) {
        try (BufferedWriter escreve = new BufferedWriter(new FileWriter("meuArquivo.pdf"))) {
            escreve.write("Estou aprendendo a gerar arquivos com Java");
           

      

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
