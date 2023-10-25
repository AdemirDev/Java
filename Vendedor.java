package SistemaFuncionario;

import java.util.Scanner;

public class Vendedor extends Funcionarios {

	@Override
	public double calcularSalario(double quantidadeSalarios) {
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("digite a qtd de salarios ");
		quantidadeSalarios=sc.nextDouble();
		sc.close();
		
		return super.calcularSalario(quantidadeSalarios)+500;
	}
	


}

