package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao{
	
	public Connection conexao;
	// Método construtor da classe que gera uma conexao com o banco de dados
	public Conexao(String url, String usuario, String senha) throws SQLException {
		
		this.conexao = DriverManager.getConnection(url, usuario,senha);
	}
	// Método para Listar Amigos
	public ResultSet listarAmigos() throws SQLException{
		String query = "SELECT * FROM amigo";
		PreparedStatement preparedStatement = conexao.prepareStatement(query);
		return preparedStatement.executeQuery();
	}
	//Método para inserir Amigos
	
	public boolean inserirAmigos(String nome, String email, String telefone) throws SQLException{
		String query = "INSERT INTO amigo ( nome, email, telefone) VALUES ( ?, ?, ?)";
		PreparedStatement preparedStatemente =
				conexao.prepareStatement(query);
		preparedStatemente.setString(1, nome);
		preparedStatemente.setString(2, email);
		preparedStatemente.setString(3, telefone);
		
		return preparedStatemente.executeUpdate(query)>0;		
	}
	
	//Método atualizar lista de amigos
	
	public boolean atualizarLista() {
		return false;
	}
	
	// Método deletar amigo
	public boolean deletarAmigo(int id) throws SQLException {
		String query = "DELETE FROM amigo WHERE id = ?";
		PreparedStatement preparedstatement = conexao.prepareStatement(query);
		preparedstatement.setInt(1, id);
		return preparedstatement.executeUpdate(query)>0;
	}
	
	public void fecharConexao() throws SQLException {
		if ( conexao != null && !conexao.isClosed()) {
			conexao.close();
		}
	}
}