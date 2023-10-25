package Aula18_Interface;

public class Retangulo implements CalculaArea {
	
	private double altura;
	private double largura;
	
	
	public Retangulo(double altura, double largura) {
		super();
		this.altura = altura;
		this.largura = largura;
		
		
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getLargura() {
		return largura;
	}


	public void setLargura(double largura) {
		this.largura = largura;
	}


	@Override
	public void calcularArea() {
		System.out.println("A area do Quadrado é " + (altura*largura) );
		
	}



	
		
	}
			


