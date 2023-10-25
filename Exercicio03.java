package Aula10;

public class Exercicio03 {

	public static void main(String[] args) {
		
			
		
		double[] elementos = new double [7];
		
		double valorTotal=0;		
		
		
		elementos[0] = 10;
		elementos[1] = 20;
		elementos[2] = 30;
		elementos[3] = 40;
		elementos[4] = 50;
		elementos[5] = 60;
		elementos[6] = 70;
		
		for (int i=0; i< elementos.length; i++) {
			valorTotal = valorTotal+elementos[i];
			
			
		}
		
		System.out.println("A Media dos Valores e: " + (valorTotal/7));
		
		
		 
		
		
		
		
		


	}

}
