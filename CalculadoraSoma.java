import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.ComponentOrientation;
import java.awt.Font;

public class CalculadoraSoma extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtPrimeiro;
	private JTextField txtSegundo;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraSoma frame = new CalculadoraSoma();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculadoraSoma() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 800, 300);
		getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		comboBox = new JComboBox();
		comboBox.setName("opcoes");
		comboBox.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		comboBox.setToolTipText("");
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Escolha a Operação Desejada:", "", "Soma", "Subtração", "Multiplicação", "Divisão"}));
		getContentPane().add(comboBox);
		
		txtPrimeiro = new JTextField();
		txtPrimeiro.setText("Primeiro");
		txtPrimeiro.setToolTipText("");
		txtPrimeiro.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtPrimeiro.setIgnoreRepaint(true);
		txtPrimeiro.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(txtPrimeiro);
		txtPrimeiro.setColumns(10);
		
		txtSegundo = new JTextField();
		txtSegundo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtSegundo.setText("Segundo");
		txtSegundo.setToolTipText("");
		txtSegundo.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(txtSegundo);
		txtSegundo.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Double txtPrimeiro1 = Double.parseDouble.getText().txtPrimeiro);
		
		double txtPrimeiro1 = Double.parseDouble(txtPrimeiro.getText());
		double txtSegundo1 = Double.parseDouble(txtSegundo.getText());

		switch (comboBox.getSelectedItem().toString()) {
		case "Soma":
			
			double resultado = txtPrimeiro1 + txtSegundo1;
			JOptionPane.showMessageDialog(null, "A soma dos valores é: " + resultado);
			
			break;
			
		case "Subtração":
			
			double resultado1 = txtPrimeiro1 - txtSegundo1;
			JOptionPane.showMessageDialog(null, "A Subtração dos valores é: " + resultado1);
			
			break;
			
		case "Multiplicação":
			
			double resultado2 = txtPrimeiro1 * txtSegundo1;
			JOptionPane.showMessageDialog(null, "A Multiplicação dos valores é: " + resultado2);
			
			break;
			
		case "Divisão":
			
			if (txtPrimeiro1 == 0) {
				
				JOptionPane.showMessageDialog(null, "Não é possivel dividir o valor zero!!!! ");
			} else {
			
			double resultado3 = txtPrimeiro1 / txtSegundo1;
			JOptionPane.showMessageDialog(null, "A Divisão dos valores é: " + resultado3);
			}
			
			break;
			
			default:
				
				JOptionPane.showMessageDialog(null, "Escolha a Operação Desejada!");
				
				break;
				
			
			
		
		
		}
		
		
			}
		});
		
		getContentPane().add(btnNewButton);
		
	
	}

}
