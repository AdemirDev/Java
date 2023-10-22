
public class Seguradora {

	public static void main(String[] args) {
		
		System.out.println("***************** Bem Vindo a Seguradora AAJ ****************** \n ");
		
		Cotacao ct  = new Cotacao(null, null, 0, null, 0);
		Veiculo carro1 = new Veiculo(null, null, 0, null, 0);
		Cliente cliente1 = new Cliente(null, 0, (char) 0, 0, null);
		
		
		cliente1.dadoscliente();
		ct.verificarAno();
		ct.calcularValor();
		
		
		
	}

}
