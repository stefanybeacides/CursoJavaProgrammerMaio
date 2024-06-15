package arquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;

import entidade.Cobra;

public class ManipuladorArquivoCobra {
	
public void registrarCobra (Cobra cobra) {
		
		String enderecoArquivo = "C:\\GIT\\JavaCertification\\cadastroAnimal//registroCobra.txt";
		
		
		try {
			
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(enderecoArquivo));
			
			bufferedWriter.append("O nome da cobra é: " + cobra.getNome());
			bufferedWriter.newLine();
			bufferedWriter.append("O CAF da cobra é: " + cobra.getCaf());
			bufferedWriter.newLine();
			bufferedWriter.append("O tipo de veneno da cobra é: " + cobra.getVeneno());
			
			bufferedWriter.close();
			
			
		} catch (Exception e) {
			
			System.out.println("Erro ao registrar a cobra!");
			
		}
		
		
	}

}
