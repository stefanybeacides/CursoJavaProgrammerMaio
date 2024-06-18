package conectaBancoTeste;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DaoPessoa {
	
	public boolean salvarPessoaNoBanco(Pessoa pessoa) {
		boolean salvamento = false;
		
		FabricaConexao conexaoFabricaConexao = new FabricaConexao(); //Instancia a classe Fabrica de Conexão
		Connection connectionTeste = null; //Cria o objeto conexão como null
		PreparedStatement preparaOComandoSQL = null; // Cria o objeto que prepara o comando SQL
		
		String comandoSqlInsert = "insert into pessoa (nome, cpf, email) values (?, ?, ?)";//Base do comando SQL
		
		try {
			connectionTeste = conexaoFabricaConexao.criarConexaoTeste(); // Recebe o objeto de conexão da classe Fabrica de Conexão
			
			preparaOComandoSQL = connectionTeste.prepareStatement(comandoSqlInsert); // Armazena a conexão e o comando SQL que vai ser preparado
			
			preparaOComandoSQL.setString(1, pessoa.getNome()); // Coloca o valor no campo nome
			preparaOComandoSQL.setString(2, pessoa.getCpf()); // Coloca o valor no campo cpf
			preparaOComandoSQL.setString(3, pessoa.getEmail()); // Coloca o valor no campo email
			
			preparaOComandoSQL.execute(); // Executa o comando no banco de dados

			
			System.out.println("Pessoa registrada com sucesso!"); // Log
			
			salvamento = true; // Se tudo funcionar certo
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Erro ao registrar pessoa!");
			
		}finally { // É obrigatório para fechar as conexões, vai cair aqui se der certo ou errado
			
			try {
				if (connectionTeste != null) {
					connectionTeste.close(); // Se o objeto connectionTeste estiver aberto essa linha vai encerrar
			
				}
				if (preparaOComandoSQL != null) {
					preparaOComandoSQL.close(); // Se o objeto preparaOComandoSQL estiver aberto essa linha vai encerrar
			
				}
				
				
				
			} catch (Exception e2) {
				System.out.println("Não foi possível encerrar a conexão!");
				
			}
			
		}
		
		
		return salvamento;
		
	}

}
