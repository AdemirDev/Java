package Aula10;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
	
		String cores[] = new String[3];	
		
		
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<3; i++) {
			//System.out.print(" Digite a cor: ");
			//cores[i]=sc.nextLine();
			
			cores[i]=JOptionPane.showInputDialog(null, " Digite a Cor: ");
			
			
		}
		System.out.println("-----------");
		for (int i=0; i<3; i++) {
			//System.out.println(cores[i]);
			//JOptionPane.showInputDialog(null, " Digite a Primeira Cor: " + cores[i]);
			JOptionPane.showMessageDialog(null, cores[i]);
		}
		
		

	}

}
