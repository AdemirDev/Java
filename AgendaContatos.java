package programas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AgendaContatos extends JFrame {

	//Construção da Janela
	public AgendaContatos() {
		JFrame janela = new JFrame();
		janela.setSize(500, 500);
		janela.setLocationRelativeTo(null);
		janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
		janela.setVisible(true);
		janela.setLayout(new FlowLayout());
		janela.setLayout(new BorderLayout());
		//janela.setLayout(new GridLayout());
		
	// Adicionando componentes
		JButton btn1 = new JButton("Norte");
		JButton btn2 = new JButton("Sul");
		JButton btn3 = new JButton("Leste");
		JButton btn4 = new JButton("Oeste");
		JButton btn5 = new JButton("Centro");
		JButton btn6 = new JButton("Botao 6");
		JButton btn7 = new JButton("Botao 7");
		
		
		
		// Criar Panel
		JPanel pn = new JPanel();
		
		// Criar o TextField
		JTextField txt = new JTextField(10);
		
		// Criar o Label que aparecerá a mensagem
		JLabel lblResultado = new JLabel("Exemplo do Panel");
		
		// Criar o Botão de Enviar Mensagem
		JButton btnEnviar = new JButton("Enviar");
		
		// Adicionar o Evento de enviar ao Botao
		
		btnEnviar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String textoDigitado= txt.getText();
				
				lblResultado.setText("Resultado: " + textoDigitado);
			}
		});
		
		// Atualizar o Label com a entrada capturada
		
		
		
		
		
	
		// Adicionando evento ao btn 1
		btn1.addActionListener(new ActionListener(){
			// seu código 
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Exibir Mensagem");
			}
			
	
		});
		
		// Adicionando os componentes prontos a janela
		janela.getContentPane().add(btn1, BorderLayout.NORTH);
		janela.getContentPane().add(btn2, BorderLayout.SOUTH);
		janela.getContentPane().add(btn3, BorderLayout.EAST);
		janela.getContentPane().add(btn4, BorderLayout.WEST);
		janela.getContentPane().add(btn5, BorderLayout.CENTER);
		pn.add(btn6);
		pn.add(btn7);
		pn.add(txt);

		pn.add(btnEnviar);
		pn.add(lblResultado);
		janela.getContentPane().add(pn);
		
	
	

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new AgendaContatos();

	}

}


