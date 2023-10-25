package Aula10;

import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<5; i++) {			
			
			String quantidadeProduto[] = new String [5];
			System.out.println("Digite o produto da posicao:  " + i);
			quantidadeProduto[i] = sc.next();
			
	//		for (int i=0; i<5 ; i++ ) {
				
				System.out.println(quantidadeProduto[i]);
			
		}	
		
			
						sc.close();
		}
	}


