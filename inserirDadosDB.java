package aplications;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class inserirDadosDB {

	public static void main(String[] args) {
		
		
		String URL = "jdbc:mysql://localhost:3306/loja";
		String USUARIO = "root";
		String SENHA = "senai";
		
		try {
			
			// estabelce a conexao com o banco de dados
			
			Connection conexao = DriverManager.getConnection(URL,USUARIO,SENHA);
			
			
				
				// Cria uma instrução sql parametrizada
		
			String SQL = "INSERT INTO cliente (cpf,nome,sobrenome,email,telefone) VALUES (?,?,?,?,?) ";
		
			PreparedStatement pp = conexao.prepareStatement(SQL);
			
			pp.setInt(1, 123456789);
			pp.setString(2, "Ademir");
			pp.setString(3, "Jr");
			pp.setString(4, "ademir@ig");
			pp.setInt(5, 555545445);
			
			// fecha conexao
			
			conexao.close();
				
				
			
		} catch (Exception e){
			e.printStackTrace();
		}
	}

}
