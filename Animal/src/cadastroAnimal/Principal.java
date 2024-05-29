package cadastroAnimal;

import java.util.Scanner;

import entidade.Animal;

public class Principal {
	
	// INÍCIO MÉTODO MAIN
	public static void main(String[] args) {
		
		Animal objetoAnimal = new Animal();
		
		Scanner entradaDados = new Scanner (System.in);
		
		System.out.println("Informe o nome do animal:");
		objetoAnimal.nome = entradaDados.next();
		
		System.out.println("Informe a idade do animal:");
		objetoAnimal.idade = Integer.parseInt(entradaDados.next());
		
		System.out.println("Informe o peso do animal:");
		objetoAnimal.peso = Double.parseDouble(entradaDados.next());
		
		objetoAnimal.valor = calcularValor(objetoAnimal.peso);
		
		imprimirResultadoNoConsole(objetoAnimal);
		
	} // FIM MÉTODO MAIN
	
	// INÍCIO MÉTODO IMPRIMIR RESULTADO
	public static void imprimirResultadoNoConsole (Animal animal) {
		
		System.out.println("Nome do animal: " + animal.nome);
		System.out.println("Idade do animal: " + animal.idade);
		System.out.println("Peso do animal: " + animal.peso);
		System.out.println("O valor do animal é: R$" + animal.valor);
		
	} // FIM MÉTODO IMPRIMIR RESULTADO
	
	// INÍCIO MÉTODO CALCULAR VALOR
	public static Double calcularValor(Double peso) {
		
		double valor = peso * 50;
		
		return valor;
		
	} //FIM MÉTODO CALCULAR VALOR

}
