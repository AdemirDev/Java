
public class Veiculo {
	
	public String marca;
	public String modelo;
	public int anofabricacao;
	private String placa;
	public double valorTabela;
	
	public Veiculo(String marca, String modelo, int anofabricacao, String placa, double valorTabela) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anofabricacao = anofabricacao;
		this.placa = placa;
		this.valorTabela = valorTabela;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnofabricacao() {
		return anofabricacao;
	}

	public void setAnofabricacao(int anofabricacao) {
		this.anofabricacao = anofabricacao;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getValorTabela() {
		return valorTabela;
	}

	public void setValorTabela(double valorTabela) {
		this.valorTabela = valorTabela;
	}
	
	
		
	}
	


