package aula04;

import java.util.Scanner;

public class ClassificaTriangulo {

	public static void main(String[] args) {
		
		//double lado1;
		//double lado2;
		//double lado3;
		
Scanner scanner =  new Scanner (System.in);
		
		System.out.println("Digite os tres lados do triangulo:");
		System.out.print("lado1:");
		double lado1 = scanner.nextDouble();
		System.out.print("lado2:");
		double lado2 = scanner.nextDouble();
		System.out.print("lado3:");
		double lado3 = scanner.nextDouble();
		
				
		if (lado1 != lado2 && lado1 != lado3 ) {
			System.out.println("Triangulo Escaleno");
			
		} else if (lado1 != lado2 && lado1 == lado3)	{
			System.out.println("Triangulo Isoceles");
			
	
		
		}
		
		
		
				

	}

}
