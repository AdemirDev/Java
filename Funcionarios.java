package SistemaFuncionario;

public abstract class Funcionarios {
	
	public String nome;
	public int cpf;
	public String cargo;	
	
		
	public double calcularSalario(double quantidadeSalarios) {
		
		return quantidadeSalarios*1000;
	}


}
