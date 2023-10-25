package Aula14;

public class Conta {

	private String titular;
	private String cpf;
	private double saldo;
	private String numeroConta;
	private double limite;
	
	public Conta(String titular, String cpf, double saldo, String numeroConta, double limite) {
		super();
		this.titular = titular;
		this.cpf = cpf;
		this.saldo = saldo;
		this.numeroConta = numeroConta;
		this.limite = limite;
	}
	
	public String getTitular() {
		return titular;
	}



	public void setTitular(String titular) {
		this.titular = titular;
	}




	public String getCpf() {
		return cpf;
	}




	public void setCpf(String cpf) {
		this.cpf = cpf;
	}




	public double getLimite() {
		return limite;
	}




	public void setLimite(double limite) {
		this.limite = limite;
	}




	public double getSaldo() {
		return saldo;
	}




	public String getNumeroConta() {
		return numeroConta;
	}

		

	// Método para sacar dinheiro

	public void sacar(double valor) {
		if (valor <= 0) {
			System.out.println("O valor de saque deve ser maior que zero.");
		} else if (valor <= (saldo + limite)) {
			saldo -= valor;
			System.out.println("Saque de R$" + valor + " realizado com sucesso.");
		} else {
			System.out.println("Saldo insuficiente para realizar o saque.");
		}
	}

	// Método depositar dinheiro
	
	public void depositar(double valor) {
		if (valor <= 0) {
			System.out.println("O valor de deposito deve ser maior que zero.");
		} else {
			saldo += valor;
			System.out.println("Deposito de R$" + valor + " realizado com sucesso.");
		}
	}

	// Método consultar Saldo
	
	public void consultarSaldo() {
		System.out.println("Nome: " + titular);
		System.out.println("CPF: " + cpf);
		System.out.println("Número da Conta: " + numeroConta);
		System.out.println("Saldo: R$" + saldo);
		System.out.println("Limite: R$" + limite);
	}
}
