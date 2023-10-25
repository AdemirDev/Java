package metodos;

public class MetodoSemRetorno {
	
	// public deixa o metodos visivel a todas as classes
	
	// private = deixa o metodo/atributo  visivel apenas para a classe em que se encontra ( maior nivel)
	
	// protect = deixa metodo/atributo visivel a pacotes e e classe do memso pacote
	
	// Sintaxe para escrever metodos: qualificador tipo de retorno nome do metodo
	
	
	public static void escreveAlgo() {
		
		
		System.out.println(" Aprendendo Metodo em Java.  " );
	}
	
	public static void somaNumerosInteiros(int numero1, int numero2) {
		System.out.println(" A soma dos Numeros e: " + numero1 + numero2);
	}
	
	public static void imprimePalavra(String palavra) {
		System.out.println(" A palavra e: " + palavra);
	}
	
	
	
	
	
	
	
	public static void main(String args[]) {
		
		escreveAlgo();
		imprimePalavra("Palavra");
		
	}

}
