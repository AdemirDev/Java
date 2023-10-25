package Aula18_Interface;

public class Triangulo implements CalculaArea {
	
	private double base;
	private double altura;
	

	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
		
		
		
	}



	public double getBase() {
		return base;
	}



	public void setBase(double base) {
		this.base = base;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}



	@Override
	public void calcularArea() {
		System.out.println("A area do Triangulo é : " + (base*altura)/2);
		
	}

}
