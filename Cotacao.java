import java.util.Scanner;

public class Cotacao  extends Veiculo {

	public Cotacao(String marca, String modelo, int anofabricacao, String placa, double valorTabela) {
		super(marca, modelo, anofabricacao, placa, valorTabela);
		
	}

	public void verificarAno() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Digite o ano do Veiculo: ");
		setAnofabricacao(sc.nextInt());
		
		if (getAnofabricacao() < 2013) {
			
			System.out.println(" Cotaçao não Disponível ( Veiculo Antigo) ");			
			return;
		} else { 
			System.out.println("Ok, Vamos Prosseguir... ");			
			//return;
		}
	
			
			
			
	} 
	
	public void calcularValor() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Valor de Tabela do Veiculo: ");
		
		setValorTabela(sc.nextDouble());
		
		System.out.println("Valor do Seguro: " + "R$"+(getValorTabela()*0.05));		
		
		return;
	
	}
	
}
