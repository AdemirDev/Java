package Aula7;

import javax.swing.JOptionPane;

public class Calculadora_JOptionPane {

	public static void main(String[] args) {
		
		double numero1 = Double.parseDouble(null);
		double numero2 = Double.parseDouble(null);
		String operacao = JOptionPane.showInputDialog(null);
		
		JOptionPane.showInputDialog(null, "Digite o primeiro numero");
		
		JOptionPane.showInputDialog(null, "Escolha uma operacao:\n Divisao / \n ou  Subtracao -\n  ou Multiplicacao x \n ou Soma + ");
		
		switch(operacao) {
			
		case " / ":
			double resultado = (numero1 / numero2);
			JOptionPane.showMessageDialog(null, resultado);
			break;
			
		case " - ":
			double resultado3 = (numero1 - numero2);
			
			break;
			
		case " * ":
			double resultado1 = (numero1 * numero2);
			
			break;
			
		case " + ":
			double resultado2 = (numero1 + numero2);
			
			break;
			
			
				
				
				
			
			
			
		}
		
	}

}
