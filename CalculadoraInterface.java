package Aula18_Interface;

import java.util.Scanner;

public class CalculadoraInterface implements Operacao {

	public static void main(String[] args) {
	System.out.println("Escolha a Operacao desejada: \n\n"
			+ "Opcao 1: Adicao \n"
			+ "Opcao 2: Subtracao \n"
			+ "Opcao 3: Multiplicao \n"
			+ "Opcao 4: Divisao");
	
	Scanner sc = new Scanner(System.in);
	
	int opcao =0;
	
	opcao=sc.nextInt();
	
	switch (opcao) {
		
		case 1:
			Operacao.adicao();
			break;
			
		case 2:
			Operacao.subtracao();
			break;
		case 3:
			Operacao.multiplicacao();
			break;
		case 4:
			Operacao.divisao();
			break;
			
		default :
			System.out.println (" Escolha Invalida!!! ");
			break;

	}

	}
	}
