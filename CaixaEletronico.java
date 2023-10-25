package AplicacaoConta;


import java.util.Scanner;

import Aula14.Conta;
import Aula14.ContaInvestimento;



public class CaixaEletronico {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Conta conta1 = new Conta("Ademir", "252123", 250000, "207505", 3000); // instanciando a classe
		ContaInvestimento conta2 = new ContaInvestimento("Gabriel", "666666", 90000, "3998-5", 30000, null, 0, 0, 0);
		
		//conta1.setTitular("Luciene");

		System.out.println("######### Bem vindo ao Banco do Povo ############");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("###################################");

		try {
			
					// variavel para capturar teclado
				int opcao = 0;

				System.out.println("Escolha uma opcao:");
				System.out.println("Opcao 1: Consultar Saldo.");
				System.out.println("Opcao 2: Depositar.");
				System.out.println("Opcao 3: Sacar.");
				System.out.println("Opcao 4: Sair ");
				System.out.println("Opcao 5: Investir ");
				opcao= sc.nextInt();// capturando entrada teclado
				

				switch (opcao) {

				case 1:

					conta1.consultarSaldo();
					
					break;

				case 2:
					
					
					System.out.println("Digite o valor do deposito:");
					double deposito;
					deposito = sc.nextDouble();
					//conta1.depositar();
					conta1.depositar(deposito);
					
					
					break;
			
				case 3:
					double saque;
					System.out.println("Digite o valor de saque");
					saque = sc.nextDouble();
					conta1.sacar(saque);
					
					break;

				case 4:
					
					System.out.println(" Obrigado por utilizar nosso Sistema!!!!");
					break;
					
				case 5:
					
				conta2.investir(0);

				}
			
		} catch (Exception e) {
			System.out.print("Erro");

		}

	}

}

