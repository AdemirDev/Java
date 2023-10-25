package metodos;

public class UsandoMetodos {

	public static void main(String[] args) {
		
		int numero =6;
		int numero2 =2;
		int resultado = numero + numero2;
		
		// Calculadora lendo o mesmo pacote criado em outra Classe
		
		Calculadora.somaNumeros(numero, numero2);
		Calculadora.subrairNumeros(numero, numero2);
		Calculadora.multiplicarNumeros(numero, numero2);
		Calculadora.dividirNumeros(numero, numero2);
		
		
		
		System.out.println("Vamos a proxima fase do curso");
		Calculadora.somaNumeros(numero, numero2);	
		System.out.println(resultado);
		System.out.println("a soma agora dever ser diferente");
		
		
		
		
		
		

	}

}
