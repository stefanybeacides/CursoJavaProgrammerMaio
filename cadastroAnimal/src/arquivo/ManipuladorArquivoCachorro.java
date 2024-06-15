package arquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;

import entidade.Cachorro;

public class ManipuladorArquivoCachorro {

public void registrarCachorro (Cachorro cachorro) {
		
		String enderecoArquivo = "C:\\GIT\\JavaCertification\\cadastroAnimal//registroCachorro.txt";
		
		
		try {
			
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(enderecoArquivo));
			
			bufferedWriter.append("O nome do cachorro é: " + cachorro.getNome());
			bufferedWriter.newLine();
			bufferedWriter.append("O CAF do cachorro é: " + cachorro.getCaf());
			bufferedWriter.newLine();
			bufferedWriter.append("A raça do cachorro é: " + cachorro.getRaca());
			
			bufferedWriter.close();
			
			
		} catch (Exception e) {
			
			System.out.println("Erro ao registrar o cachorro!");
			
		}
		
		
	}
	
}
