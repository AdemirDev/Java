package SistemaFuncionario;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class FolhaPagamento {

	public static void main(String[] args) {
	
		
		//while(true):
			
		System.out.println(" **********************************");
		
		System.out.println("Escolha uma opcao para calcular o salario: \n "
				+ "Opcao 1:  Salário Gerente \n "
				+ "Opcao 2:  Salario Vendedor \n "
				+ "Opcao 3:  Salario Programador \n "
				+ "Opcao 4:  Sair ");
		
		System.out.println("************************************");
		
		int opcao =0;
		
		Scanner sc = new Scanner(System.in);
		
		opcao=sc.nextInt();
		
		if (opcao == 4) {
			
			System.out.println("Saindo do Sistema....");
			
		} 
			
				
				
		switch (opcao) {
			
			case 1:
				
				Gerente ge = new Gerente();				
				ge.nome = JOptionPane.showInputDialog("Qual seu nome");
				ge.calcularSalario(opcao);							
				break;
				
			case 2:
				
				break;
				
			case 3:
				
				break;
				
						
				
				
				
		}
		
		
		
		
		
				
		

	}

}


