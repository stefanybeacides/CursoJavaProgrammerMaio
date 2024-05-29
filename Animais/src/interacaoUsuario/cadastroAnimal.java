package interacaoUsuario;

import java.util.List;

import javax.swing.JOptionPane;

import entidade.Cachorro;
import entidade.Gato;

public class cadastroAnimal {

	public Cachorro cadastrarCachorro() {

		Cachorro animaisEntidade = new Cachorro();

		animaisEntidade.setNome(JOptionPane.showInputDialog("Digite o nome do cachorro: "));
		animaisEntidade.setIdade(JOptionPane.showInputDialog("Digite a idade do cachorro: "));
		animaisEntidade.setRaca(JOptionPane.showInputDialog("Digite a raça do cachorro: "));

		return animaisEntidade;

	}

	public Gato cadastroGato() {

		Gato animaisEntidade = new Gato();

		animaisEntidade.setNome(JOptionPane.showInputDialog("Digite o nome do gato: "));
		animaisEntidade.setIdade(JOptionPane.showInputDialog("Digite a idade do gato: "));

		return animaisEntidade;

	}

	public void imprimirCachorro(List<Cachorro> listaCachorro) {

		StringBuilder impressaoCachorroString = new StringBuilder();

		for (Cachorro cachorroItemLista : listaCachorro) {
			impressaoCachorroString.append("Nome: ").append(cachorroItemLista.getNome()).append("\n").append("Idade: ")
					.append(cachorroItemLista.getIdade()).append("\n").append("Raça: ")
					.append(cachorroItemLista.getRaca()).append("\n").append("_____________________________")
					.append("\n");

		}

		JOptionPane.showMessageDialog(null, impressaoCachorroString.toString());

	}

	public void imprimirGato(List<Gato> listaGato) {

		StringBuilder impressaoGatoString = new StringBuilder();

		for (Gato gatoItemLista : listaGato) {
			impressaoGatoString.append("Nome: ").append(gatoItemLista.getNome()).append("\n").append("Idade: ")
					.append(gatoItemLista.getIdade()).append("\n").append("Cor: ").append(gatoItemLista.getCor())
					.append("\n").append("_____________________________").append("\n");

		}

		JOptionPane.showMessageDialog(null, impressaoGatoString.toString());

	}

}
