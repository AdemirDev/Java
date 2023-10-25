package Aula14;

import java.util.Scanner;

public class ContaInvestimento extends Conta {	
	
	
	String investimento;
	static int tempo;
	double valor;
	double taxa;
	
	
	public ContaInvestimento(String titular, String cpf, double saldo, String numeroConta, double limite,
			String investimento, int tempo, double valor, double taxa) {
				
		super(titular, cpf, saldo, numeroConta, limite);
		this.investimento = investimento;
		this.tempo = tempo;
		this.valor = valor;
		this.taxa=taxa;
	}
	
	public static void investir (double valor) {
		
		System.out.println(" Informe o valor que deseja INVESTIR!! ");
		
		Scanner sc = new Scanner(System.in);
		
		valor = sc.nextDouble();
		
		if (valor < 100) {	
			
			System.out.println("Valor minimo para Investimento R$ 100!!! ");
			
								
		} else  {
						
			System.out.println("Informe quantos Meses o valor ficara investido:  ");
			tempo = sc.nextInt();
				
		} 
		
		double ganhosPeriodo = (valor * ( tempo * 0.05));
		
		System.out.println("Juros do Periodo R$ " + ganhosPeriodo);
		
		
		sc.close();
		
	}
	
	 	

}
