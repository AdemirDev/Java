package ExemploSemOO;

import java.util.Scanner;

// calcular areas de dois retangulos x/y e verificar o que e maior!

public class CalculaAreaRetangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Digite a base do retangulo X: ");
		int xBase = sc.nextInt();
		
		System.out.println(" Digite a Altura do retangulo X: ");
		int xAltura = sc.nextInt();
		
		System.out.println(" Digite a base do retangulo Y: ");
		int yBase = sc.nextInt();
		
		System.out.println(" Digite a Altura do retangulo Y: ");
		int yAltura = sc.nextInt();
		
		
		
		//int xBase = 10;
		//int xAltura = 2;
		int xArea = xAltura * xBase;
		
		//int yBase = 10;
		//int yAltura = 2;
		int yArea = yAltura * yBase;
		
		
		
		
		if (xArea > yArea) {
			System.out.println(" A area do retangulo X e maior");
		} else {
			System.out.println(" A area do retangulo Y e maior");
		}
		

	}
	
	

}
