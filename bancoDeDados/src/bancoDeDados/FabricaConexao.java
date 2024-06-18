package bancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;

public class FabricaConexao {
	
	private static String USUARIO = "root";// Usuário do banco
	private static String SENHA = "root";//Senha do banco
	private static String BANCO_URL = "jdbc:mysql://localhost:3306/exemplo?useTimezone=true&serverTimezone=UTC"; //URL DO BANCO DE DADOS
	
	
	public Connection criarConexaoExemplo() {
		
		Connection conexaoBancoDadosExemplo = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			
			conexaoBancoDadosExemplo = DriverManager.getConnection(BANCO_URL,USUARIO,SENHA);
			
			System.out.println("Conexão criada com sucesso!");
			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			System.out.println("Erro na conexão!");
			
		}
		
		
		return conexaoBancoDadosExemplo; 
	}

}
