package Aula15;

import java.util.Scanner;

public class Cotacao extends Veiculo {	
	

 public Cotacao(String marca, String modelo, int anoFabricacao, String placa, double valor) {
		super(marca, modelo, anoFabricacao, placa, valor);
		
	}

public void cotar () { 
	
    Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o ano do Veiculo: ");
	
	setAnoFabricacao(sc.nextInt());	
	 
	 //verificar se o carro tem menos de 10 anos
	 
	if (getAnoFabricacao() < 2013) {
		 
		 System.out.println("Cotacao Indisponivel !! (Veiculo Antigo) " );
		 
		 return;
		 
			 }  else {
				 
				 System.out.println(" Vamos Prosseguir!! \n");				 
			 }
	
	sc.close();
		
		
	}
		
	
public void valorSeguro () {
	
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Digite o valor do veiculo ");
	
	setValor(sc.nextDouble());
	 
	System.out.println("Valor do Seguro: " + " R$" + (getValor()*0.05));
	
	return;
}

	
	}



	
		
	
	

