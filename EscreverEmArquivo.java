package programa;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class EscreverEmArquivo {
	public static void main(String[] args) {
		Path caminho = Paths.get("C:\\Users\\sn1084573\\Desktop\\DeuRuim.pdf");
		
	
			String texto = JOptionPane.showInputDialog("Escreve a Mensagem para ser inserida no documento:");
	
		
		JOptionPane.showMessageDialog(null, "Mensagem Inserida com Sucesso");
		
		
		
		byte [] textoByte = texto.getBytes();
		try {
			Files.write(caminho, textoByte);
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			}
	}

}
