import java.util.Scanner; // Objeto java Padrão para receber dados atraves do console.

public class Principal{
	
	public static void main(String[] args){

		Scanner entradaDeDados = new Scanner (System.in); // Objeto java Padrão para receber dados atraves do console.
	
		Animal objetoAnimal = new Animal(); // Chamar e inicializar
		
		System.out.println("Digite o nome do Animal:");  // Trecho de codigo usado para apresentar a mensagem para o usuario.
		
		objetoAnimal.nomeAnimal = entradaDeDados.next(); // Estou armazenando o valor digitado pelo usuario na variavel Nome. 

		System.out.println("O nome recebido foi: " + objetoAnimal.nomeAnimal);

		System.out.println("Digite a idade do Animal: ");
		objetoAnimal.idade = Integer.parseInt(entradaDeDados.next());

		System.out.println("A idade do animal: " + objetoAnimal.idade);

		 
		
	}	
}