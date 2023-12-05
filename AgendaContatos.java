package programas;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import classes.Conexao;

public class AgendaContatos extends JFrame{
	
	private Conexao conexao;
	
	public AgendaContatos(Conexao conexao) {
		super ("Agenda");
		this.conexao = conexao;
		
		//Criando os componentes
		
		JButton btnListar = new JButton ("Listar Amigos");
		JButton btnInserir = new JButton ("Inserir Amigos");
		JButton btnAtualizar = new JButton ("Atualizar Amigos");
		JButton btnDeletar = new JButton ("Deletar Amigos");
		
		//Adicionando os componentes a um painel
		
		JPanel panel = new JPanel(new GridLayout(4,1,10,10));
		panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10)); // espamento externo 
		
		panel.add(btnListar);
		panel.add(btnInserir);
		panel.add(btnAtualizar);
		panel.add(btnDeletar);
		
		// Adicionando funções aos botões
		
		btnListar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				listarAmigos();
				
			}
		});
		
		
	}
	
	
	public static void main(String [ ] args) {
		
		
		
	}
	
}