import java.util.Scanner;

import javax.swing.JOptionPane;

public class Cliente {
	
	private String nome;
	private int idade;
	private char sexo;
	private int cpf;
	private String cep;
	
	
	public Cliente(String nome, int idade, char sexo, int cpf, String cep) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.cpf = cpf;
		this.cep = cep;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public void dadoscliente () {
		
		Scanner sc = new Scanner(System.in);
		
		   JOptionPane.showInputDialog("Qual seu nome? ");
		
		
	}
	
	
}

