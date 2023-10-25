package Aula18_Interface;

import java.util.Scanner;

public class CalculadoraDeArea {

	public static void main(String[] args) {
		Retangulo rt = new Retangulo(0, 0);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Digite a altura do retangulo:");
		
		rt.setAltura(sc.nextDouble());
		
		System.out.println(" Digite a Largura do retangulo:");
		
		rt.setLargura(sc.nextDouble());
		
		rt.calcularArea();
		
		//System.out.println(" A area do Retangulo é: " + (rt.getAltura()*rt.getLargura()));
		
		sc.close();
		
		
	}

}
