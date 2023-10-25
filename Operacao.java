package Aula18_Interface;

import java.util.Scanner;

public interface Operacao {
	
	//double numero1=0;
	//double numero2=0;
	
	public static void adicao() {
		
		System.out.println("Digite o primeiro numero: ");
		Scanner sc = new Scanner(System.in);
		double numero1 = sc.nextDouble();
		System.out.println("Digite o segundo numero ");
		double numero2=sc.nextDouble();		
		System.out.println("A soma dos numeros é " + (numero1+numero2));
		sc.close();
		
	}	
	
	public static void subtracao() {
		
		System.out.println("Digite o primeiro numero: ");
		Scanner sc = new Scanner(System.in);
		double numero1 = sc.nextDouble();
		System.out.println("Digite o segundo numero ");
		double numero2=sc.nextDouble();		
		System.out.println("A Subtracao dos numeros é " + (numero1-numero2));
		sc.close();
		
	}
	public static void multiplicacao() {
		
		System.out.println("Digite o primeiro numero: ");
		Scanner sc = new Scanner(System.in);
		double numero1 = sc.nextDouble();
		System.out.println("Digite o segundo numero ");
		double numero2=sc.nextDouble();		
		System.out.println("A Multiplicacao dos numeros é " + (numero1*numero2));
		sc.close();
		
	}
	public static void divisao() {
		
		System.out.println("Digite o primeiro numero: ");
		Scanner sc = new Scanner(System.in);
		double numero1 = sc.nextDouble();
		System.out.println("Digite o segundo numero ");
		double numero2=sc.nextDouble();	
		
		if (numero2==0) {
			System.out.println("Erro: Divisão por zero não permitida.");
		} else {
		System.out.println("A Divisao dos numeros é " + (numero1/numero2));
		sc.close();
		
	}
		
		

}
}
