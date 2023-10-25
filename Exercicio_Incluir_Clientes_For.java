package aula06;

import java.util.Scanner;

public class Exercicio_Incluir_Clientes_For {

	public static void main(String[] args) {
		
		Scanner captura = new Scanner(System.in);		
		String [] cliente = new String [4];	 
		
		for(int contador =0;contador<=cliente.length; contador++) {	
							
		System.out.println("Digite o nome do cliente:");
		cliente [contador] = captura.nextLine();
		
		}
		
		for(int i=0; i< cliente.length; i++)
		System.out.println(cliente[i]="");				
			
		}
		
			

	}


