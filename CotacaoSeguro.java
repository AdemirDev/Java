package Aula15;

import java.util.Scanner;

public class CotacaoSeguro {

	public static void main(String[] args) {
		
		
		Cotacao ct = new Cotacao(null, null, 0, null, 0);
		Veiculo carro1 = new Veiculo(null, null, 0, null, 0);
		Cliente cliente1 = new Cliente("Ademir", 0, 0, (char) 0, 123456789);
		
		
		
		
		System.out.println("###############################\n");
		System.out.println("Bem Vindo a Seguradora \n" );
		System.out.println("###############################");
		
		
		//while (true) {
			Scanner sc = new Scanner(System.in);
			
			//System.out.println("Digite o ano do Veiculo: ");
			//carro1.setAnoFabricacao(sc.nextInt());
			
			ct.cotar();
			ct.valorSeguro();
		
			
			
			
			
			
			
			
		
			
		}

	}

