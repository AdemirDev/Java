package programas;


import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PrimeiraInterface {
	
	

	public static void main(String[] args) {
		
		JFrame janela =new JFrame("MinhaJanela");
		janela.setSize(300, 200);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setResizable(true);
		
		
		
		
		JLabel label = new JLabel("Meu Label");			
		
		JButton btn = new JButton(" Btn 1");
		
		janela.getContentPane().add(label);
		
		JComboBox lista = new JComboBox();
		
		String[]Option = {"opcao 1","opcao 2" , "opcao 3"};
		
		JComboBox<String>comboBox = new JComboBox<>(Option);
		janela.getContentPane().add(comboBox);
		
		
		
		JTextField txt = new JTextField();
		txt.add(txt);
		
		
		
		
		
		
		
	}

}
