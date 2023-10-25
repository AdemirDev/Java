package SistemaFuncionario;

import java.util.Scanner;

public class Gerente extends Funcionarios {

	@Override
	public double calcularSalario(double quantidadeSalarios) {
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Digite a Qtd de Salarios ");
		quantidadeSalarios=sc.nextDouble();
		sc.close();
		
		return super.calcularSalario(quantidadeSalarios) + 800;
	}
	
/*public void main ( String args[]) {
	
	Gerente ge = new Gerente();
	
	ge.nome= "Ademir";
	ge.cargo = "Programador";
	ge.cpf = 222222222;
	
	
	
	}*/


}
