package gerenciaArquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;

import entidades.Gerente;

public class ManipuladorArquivo {
	
	public void registrarGerente (Gerente gerente) {
		
		String enderecoArquivo = "C:\\GIT\\JavaCertification\\cadastroFuncionario//registroGerente.txt";
		
		
		try {
			
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(enderecoArquivo));
			
			bufferedWriter.append("O nome do gerente é: " + gerente.getNome());
			bufferedWriter.newLine();
			bufferedWriter.append("O CPF do gerente é: " + gerente.getCpf());
			bufferedWriter.newLine();
			bufferedWriter.append("A gerência do gerente é: " + gerente.getGerencia());
			
			bufferedWriter.close();
			
			
		} catch (Exception e) {
			
			System.out.println("Erro ao registrar o gerente!");
			
		}
		
		
	}
	
	

}
