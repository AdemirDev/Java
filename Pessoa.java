package Polimorfismo;

 public class Pessoa {
	
	private String fisica;
	private String juridica;
	private String cpf;
	private String cnpj;
	private String nome;
	
	
	public void emiteSom() {
		
		System.out.println(" testando ");
		
			
		
	}


	public String getFisica() {
		return fisica;
	}


	public void setFisica(String fisica) {
		this.fisica = fisica;
	}


	public String getJuridica() {
		return juridica;
	}


	public void setJuridica(String juridica) {
		this.juridica = juridica;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

}


