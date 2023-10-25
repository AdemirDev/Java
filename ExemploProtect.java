package metodos;

public class ExemploProtect {

	public static void main(String[] args) {
		
		
		int numero =12;
		int numero2 =4;
		
		// Calculadora lendo o mesmo pacote criado em outra Classe
		
		Calculadora.somaNumeros(numero, numero2);
		Calculadora.subrairNumeros(numero, numero2);
		Calculadora.multiplicarNumeros(numero, numero2);
		Calculadora.dividirNumeros(numero, numero2);
	}

}
