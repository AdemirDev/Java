package metodos;

public class Calculadora {
	
	public static void  somaNumeros(int numero, int numero1) {
		
		System.out.println("Soma: " + (numero + numero1));
		
		
	}
			
public static void subrairNumeros(int numero, int numero1) {
		
		System.out.println("Subtracao: " + (numero - numero1));
		
		
	}

public static void multiplicarNumeros(int numero, int numero1) {
	
	System.out.println("Multiplicacao: " + (numero * numero1));
	
	
}
	
public static void dividirNumeros(int numero, int numero1) {
	
	System.out.println("Divisao:  " + (numero / numero1));
	
	
}	
	
	
	

	public static void main(String[] args) {
		
		int numero = 10;
		int numero1 = 5;
		
		multiplicarNumeros(numero, numero1 );
		
		somaNumeros(numero, numero1);
		
		subrairNumeros(numero, numero1);
		
		dividirNumeros(numero, numero1);
	
	}

}
