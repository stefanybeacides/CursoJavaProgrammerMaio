package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entidade.CorrentistaPremium;

public class DaoCorrentistaPremium {
	
public class DaoCachorro {
		
		public boolean salvarCorrentistaNoBanco(CorrentistaPremium correntista) {
			boolean salvamento = false;
			
			FabricaConexao conexaoFabricaConexao = new FabricaConexao(); 
			Connection connectionCorrentistaPremium = null; 
			PreparedStatement preparaOComandoSQL = null; 
			
			String comandoSqlInsert = "insert into correntista_premium (nome, cpf, cep, logradouro, bairro, cidade, uf, email, qtdtransacao, anuidade) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
			try {
				connectionCorrentistaPremium = conexaoFabricaConexao.criarConexao(); 
				
				preparaOComandoSQL = connectionCorrentistaPremium.prepareStatement(comandoSqlInsert); 
				
				preparaOComandoSQL.setString(1, correntista.getNome()); 
				preparaOComandoSQL.setString(2, correntista.getCpf()); 
				preparaOComandoSQL.setString(3, correntista.getCep()); 
				preparaOComandoSQL.setString(4, correntista.getLogradouro());
				preparaOComandoSQL.setString(5, correntista.getBairro());
				preparaOComandoSQL.setString(6, correntista.getCidade());
				preparaOComandoSQL.setString(7, correntista.getUf());
				preparaOComandoSQL.setString(8, correntista.getEmail());
				preparaOComandoSQL.setInt(9, correntista.getQtdTransacao());
				preparaOComandoSQL.setDouble(10, correntista.getValorAnuidade());
				
				preparaOComandoSQL.execute(); 

				
				System.out.println("Correntista registrado com sucesso!");
				
				salvamento = true; 
				
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Erro ao registrar correntista!");
				
			}finally { 
				try {
					if (connectionCorrentistaPremium != null) {
						connectionCorrentistaPremium.close(); 
				
					}
					if (preparaOComandoSQL != null) {
						preparaOComandoSQL.close(); 
				
					}
					
					
					
				} catch (Exception e2) {
					System.out.println("Não foi possível encerrar a conexão!");
					
				}
				
			}
			
			
			return salvamento;
			
		}

}

	public static List<CorrentistaPremium> retornoListaCorrentista() {
		String comandoSqlBuscarCorrentista = "select * from correntista_premium";
		List<CorrentistaPremium> listaCorrentista = new ArrayList<>();
		FabricaConexao conexaoFabricaConexao = new FabricaConexao();
		
		
		Connection connectionExemplo = null;
		PreparedStatement preparaOComandoSQL = null;
		ResultSet resultadoTabelaBanco = null;
		
		try {
			
			connectionExemplo = conexaoFabricaConexao.criarConexao();
			preparaOComandoSQL = connectionExemplo.prepareStatement(comandoSqlBuscarCorrentista);
			resultadoTabelaBanco = preparaOComandoSQL.executeQuery();
			
			while (resultadoTabelaBanco.next()) {
				CorrentistaPremium correntista = new CorrentistaPremium();
				
				correntista.setNome(resultadoTabelaBanco.getString("nome"));
				correntista.setCpf(resultadoTabelaBanco.getString("cpf"));
				correntista.setCep(resultadoTabelaBanco.getString("cep"));
				correntista.setLogradouro(resultadoTabelaBanco.getString("logradouro"));
				correntista.setBairro(resultadoTabelaBanco.getString("bairro"));
				correntista.setCidade(resultadoTabelaBanco.getString("cidade"));
				correntista.setUf(resultadoTabelaBanco.getString("uf"));
				correntista.setEmail(resultadoTabelaBanco.getString("email"));
				correntista.setQtdTransacao(resultadoTabelaBanco.getInt("qtd transação"));
				correntista.setValorAnuidade(resultadoTabelaBanco.getDouble("valor anuidade"));
				
				listaCorrentista.add(correntista);
				
			}
			
			
		} catch (Exception e) {
			System.out.println("Erro ao buscar a lista de correntistas!");
			
		}finally {
			try {
				if (connectionExemplo != null) {
					connectionExemplo.close();
				}
				if (preparaOComandoSQL != null) {
					preparaOComandoSQL.close();
				}
				
			} catch (Exception e2) {
				System.out.println("Não foi possível encerrar a conexão!");
			}
		}
		
		
		return listaCorrentista;
	}

}
