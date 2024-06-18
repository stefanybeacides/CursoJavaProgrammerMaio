package conectaBancoTeste;

import java.sql.Connection;
import java.sql.DriverManager;

public class FabricaConexao {
	
	private static String USUARIO = "root";// Usuário do banco
	private static String SENHA = "root";//Senha do banco
	private static String BANCO_URL = "jdbc:mysql://localhost:3306/teste?useTimezone=true&serverTimezone=UTC"; //URL DO BANCO DE DADOS
	
	
	public Connection criarConexaoTeste() {
		
		Connection conexaoBancoDadosTeste = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			
			conexaoBancoDadosTeste = DriverManager.getConnection(BANCO_URL,USUARIO,SENHA);
			
			System.out.println("Deu certo!");
			
			
		} catch (Exception e) {
			
			System.out.println("Deu errado!");
			
		}
		
		
		return conexaoBancoDadosTeste;
	}

}
