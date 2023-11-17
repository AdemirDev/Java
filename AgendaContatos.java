package programas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
		
		
		//JTextField txt = new JTextField();
		//txt.setSize(20,10);
		
		
	
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
		//janela.getContentPane().add(btn6, BorderLayout.);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new AgendaContatos();

	}

}