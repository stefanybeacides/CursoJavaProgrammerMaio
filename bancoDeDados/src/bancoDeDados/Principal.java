package bancoDeDados;

import java.sql.Connection;

public class Principal {
	
	public static void main (String args[]) {
		
		FabricaConexao conexao = new FabricaConexao();//Instancia a classe que conté ométodo que retorna o objeto conexão
		
		Connection conexaoRecebida = conexao.criarConexaoExemplo();
		
		
		if (conexaoRecebida == null) {
			
			System.out.println("Deu ruim! Não posso usar a conexão.");
			
		}else {
			
			System.out.println("Deu bom! Posso usar a conexão.");
			
		}
		
		
		
	}

}
