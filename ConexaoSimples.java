package aplications;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConexaoSimples {

	public static void main(String[] args) {
		
		Connection conexao = null;
		String URL = "jdbc:mysql://localhost:3306/loja";
		String USUARIO = "root";
		String SENHA = "senai";
		
		try {
			// registra p Drive jdbc
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// classe responsavel por fazer a conexao
		try {
			conexao = DriverManager.getConnection(URL,USUARIO,SENHA);
			
		}	catch (SQLException erro) {
				erro.printStackTrace();
				
			}			
				return;
				
				
		}catch (ClassNotFoundException erro) {
			  System.out.println("Erro ao efetuar conexao " + erro.getMessage());
			
				}
				
				return;
				
				
	}
	

}
	


