package entidade;

public class Atleta {

		
		private String nome;
		private int idade; // Apenas para número inteiro
		private int qtdPartida;
		private double salario; // Números com casas decimais - ex: 10.5
		
		public Atleta(String nome) {
			super();
			this.nome = nome;
		}
		
		
		public String getNome() {
			
			return nome;
			
		}
		
		public void setIdade(int idade) {
			
			this.idade = idade;
		}

		
		
		
		

		
}