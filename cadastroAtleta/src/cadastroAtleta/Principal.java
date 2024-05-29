package cadastroAtleta;

import java.util.Scanner;

import entidade.Atleta;
import entidade.JogadorVolei;

public class Principal { // O que é uma classe? Representa um objeto concreto ou abstrato (veremos) dentro do projeto.
	// Ações (métodos) e atributos (características) = variaveis
	
	// INÍCIO DO MÉTODO MAIN
	public static void main(String[] args) {
		
		Scabber entradaDados = new Scanner (System.in);
		
		Atleta atleta = new Atleta ("Stefany"); // Construtor
		
		System.out.println("Digite a idade: ");
		
		String idadeVar = Integer.parseInt(entradaDados.next());
		
		atleta.setIdade(idadeVar);
		
		System.out.println("O nome encapsulado é: " + atleta.getNome ());
		
		
		
		
		
	} // FIM DO MÉTODO MAIN
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// INÍCIO DO MÉTODO PARA IMPRIMIR RESULTADO
	
	public static void imprimirResultadosNoConsole (Atleta atleta) { // Método é um trecho responsável por executar alguma ação
		//System.out.println("Nome do Atleta:");
		//System.out.println("Idade do Atleta:");
		//System.out.println("Salário do Atleta:");
		
	} // FIM DO MÉTODO IMPRIMIR RESULTADO

	
	public static Double calcularSalario(int qtdPartida) {
		
		double salario = qtdPartida * 10000;
		
		return salario;
		
		
	}
	
	
	
	
}
