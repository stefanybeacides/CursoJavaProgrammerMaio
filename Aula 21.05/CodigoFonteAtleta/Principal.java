import java.util.Scanner; // Objeto Java padrão para receber dados através do console.

public class Principal{

	public static void main (String[] args){

		Scanner entradaDeDados = new Scanner (System.in); // Objeto Java padrão para receber dados através do console.

		Atleta objetoAtleta = new Atleta(); // Chamar e inicializar

		System.out.println("Digite o nome do atleta:"); // Trecho de código usado para apresentar a mensagem para o usuário.

		objetoAtleta.nomeAtleta = entradaDeDados.next(); // Estou armazenando o valor digitado pelo usuário na variável Nome.

		System.out.println("O nome recebido foi: " + objetoAtleta.nomeAtleta);

		System.out.println("Digite a idade do Atleta: ");

		objetoAtleta.idade = Integer.parseInt(entradaDeDados.next());

	
	}

}