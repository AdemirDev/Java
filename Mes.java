package ExercicioPagina100;

import java.util.Scanner;

/*
Faça uma classe chamada Mes que possua um método chamado getMesPorExtenso que recebe 
um número inteiro, referente ao mês do ano, um código referente ao idioma (1 para português e 2 
para inglês) e retorne o mês por extenso. A tabela a seguir ilustra alguns exemplos. Faça também 
outra classe para testar o método * 
 * 
 */

public class Mes {
	
	public static void getMesPorExtenso(int mes, String linguagem) {
		
				
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Digite o numero do mes: ( 1 a 12) ");
		
		mes = sc.nextInt();
		
		System.out.println("Digite o Idioma: (1 pt ou 2 ingles)  ");
		linguagem = sc.next();
		
		
		
		switch (mes) {
		
		case 1:
			System.out.println("Janeiro");
		break;
		
		case 2:
			System.out.println("Fevereiro");
			break;
			
			
		case 3:
			System.out.println("Março");
			break;
			
		case 4:
			System.out.println("Abril");
			break;
			
		case 5:
			System.out.println("Maio");
			break;
			
		case 6:
			System.out.println("Junho");
			break;
			
		case 7:
			System.out.println("Julho");
			break;
			
		case 8:
			System.out.println("Agosto");
			break;
			
		case 9:
			System.out.println("Setembro");
			break;
			
		case 10:
			System.out.println("Outubro");
			break;
			
		case 11:
			System.out.println("Novembro");
			break;
			
		case 12:
			System.out.println("Dezembro");
			break;
		
		default:
		System.out.println("Mes nao Encontrado ");
		
		} 
		
		/*
		else {
			
			switch (mes) {
			
			case 1:
				System.out.println("January");
			break;
			
			case 2:
				System.out.println("Febuary");
				break;
				
				
			case 3:
				System.out.println("March");
				break;
				
			case 4:
				System.out.println("April");
				break;
				
			case 5:
				System.out.println("May");
				break;
				
			case 6:
				System.out.println("June");
				break;
				
			case 7:
				System.out.println("July");
				break;
				
			case 8:
				System.out.println("August");
				break;
				
			case 9:
				System.out.println("September");
				break;
				
			case 10:
				System.out.println("Octuber");
				break;
				
			case 11:
				System.out.println("November");
				break;
				
			case 12:
				System.out.println("December");
				break;
			
			default:
			System.out.println("Mes nao Encontrado ");
			}
			*/
			
			
		}
			
		
							
	

		public static void main(String[] args) {	
					
			
			int mes = 1;
			int linguagem=1;
			
			
			getMesPorExtenso(linguagem, null);
			
			
		
		
		
	

	}

}
