package interacaoUsuario;

import java.util.List;

import javax.swing.JOptionPane;

import entidade.Cachorro;
import entidade.Gato;

public class cadastroAnimal {

	public Cachorro cadastrarCachorro() {

		Cachorro animaisEntidade = new Cachorro();
		
		try {
			
			animaisEntidade.setNome(JOptionPane.showInputDialog("Digite o nome do cachorro: "));
			animaisEntidade.setIdade(JOptionPane.showInputDialog("Digite a idade do cachorro: "));
			animaisEntidade.setRaca(JOptionPane.showInputDialog("Digite a raça do cachorro: "));
			
			   String pesoStr;
			    while (true) {
			        pesoStr = JOptionPane.showInputDialog("Digite o peso do cachorro: ");
			        if (isDouble(pesoStr)) {
			            animaisEntidade.setPeso(Double.parseDouble(pesoStr));
			            break;
			        } else {
			            JOptionPane.showMessageDialog(null, "Peso inválido. Por favor, insira um número decimal.");
			        }
			    }
			    
			    double valor = calcularValor(animaisEntidade.getPeso());
	            JOptionPane.showMessageDialog(null, "O valor calculado para o cachorro é: " + valor);
			
		} catch (Exception e) {
			
			
		}

		

		return animaisEntidade;

	}

	public Gato cadastroGato() {

		Gato animaisEntidade = new Gato();
		
		try {
			
			animaisEntidade.setNome(JOptionPane.showInputDialog("Digite o nome do gato: "));
			animaisEntidade.setIdade(JOptionPane.showInputDialog("Digite a idade do gato: "));
			animaisEntidade.setCor(JOptionPane.showInputDialog("Digite a cor do gato: "));
			
			   String pesoStr;
			    while (true) {
			        pesoStr = JOptionPane.showInputDialog("Digite o peso do gato: ");
			        if (isDouble(pesoStr)) {
			            animaisEntidade.setPeso(Double.parseDouble(pesoStr));
			            break;
			        } else {
			            JOptionPane.showMessageDialog(null, "Peso inválido. Por favor, insira um número decimal.");
			        }
			    }
			    
			    double valor = calcularValor(animaisEntidade.getPeso());
	            JOptionPane.showMessageDialog(null, "O valor calculado para o gato é: " + valor);
			
		} catch (Exception e) {
			
			
		}

		

		return animaisEntidade;

	}
	
	// INÍCIO MÉTODO CALCULAR VALOR
			public static Double calcularValor(Double peso) {
				
				double valor = peso * 50;
				
				return valor;
				
			} //FIM MÉTODO CALCULAR VALOR

	public void imprimirCachorro(List<Cachorro> listaCachorro) {

		StringBuilder impressaoCachorroString = new StringBuilder();

		for (Cachorro cachorroItemLista : listaCachorro) {
			impressaoCachorroString.append("Nome: ").append(cachorroItemLista.getNome()).append("\n").append("Idade: ")
					.append(cachorroItemLista.getIdade()).append("\n").append("Raça: ")
					.append(cachorroItemLista.getRaca()).append("\n").append("Peso: ")
					.append(cachorroItemLista.getPeso()).append("\n").append("O valor do cachorro é: R$")
					.append(calcularValor(cachorroItemLista.getPeso())).append("\n").append("_____________________________")
					.append("\n");

		}

		JOptionPane.showMessageDialog(null, impressaoCachorroString.toString());

	}

	public void imprimirGato(List<Gato> listaGato) {

		StringBuilder impressaoGatoString = new StringBuilder();

		for (Gato gatoItemLista : listaGato) {
			impressaoGatoString.append("Nome: ").append(gatoItemLista.getNome()).append("\n").append("Idade: ")
					.append(gatoItemLista.getIdade()).append("\n").append("Cor: ")
					.append(gatoItemLista.getCor()).append("\n").append("Peso: ")
					.append(gatoItemLista.getPeso()).append("\n").append("O valor do gato é: R$")
					.append(calcularValor(gatoItemLista.getPeso())).append("\n").append("_____________________________")
					.append("\n");

		}

		JOptionPane.showMessageDialog(null, impressaoGatoString.toString());

	}
	
	public boolean isDouble(String str) {
	    if (str == null) {
	        return false;
	    }
	    try {
	        Double.parseDouble(str);
	        return true;
	    } catch (NumberFormatException e) {
	        return false;
	    }
	}
	

}
