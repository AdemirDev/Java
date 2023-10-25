package aula04;

import java.util.Scanner;

public class SwithCase {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println ("Escolha uma atividade:");
		System.out.println ("1. Estudar");
		System.out.println ("2. Praticar Esporte");
		System.out.println ("3. Assitir Filme");
		
		int escolha = scanner.nextInt();
		
		switch (escolha) {
		
		case 1:
			System.out.println (" Estudar");
			break;
			
		case 2:
			System.out.println (" Praticar Esporte");
			break;
			
		case 3:
			System.out.println (" Assitir Filme");
			break;
			
			default :
				System.out.println (" Escolha Invalida");
				break;
				
				



		

	}

}
}
