package Aula18_Interface;

public class Cliente implements Dao,DEA {
	
	private int codigo;
	private String nome;
	
	public Cliente(int codigo, String nome) {
		this.codigo=codigo;
		this.nome= nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void inserir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exlcuir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void localizar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calcular() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizarLista() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirLista() {
		// TODO Auto-generated method stub
		
	}
	
	

}
