package interacaoUsuario;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import entidades.Carro;
import entidades.Moto;

public class CadastroVeiculo {
	
	public Carro cadastrarCarro() { // public -> visibilidade
									// carro -> tipo de retorno
									// cadastrarCarro -> nome do método(identificação)
									// esse método obrigatoriamente retorna um objeto do tipo CARRO
		
		Carro carroEntidade = new Carro();
		
		carroEntidade.setMarca(JOptionPane.showInputDialog("Digite a marca: "));
		carroEntidade.setModelo(JOptionPane.showInputDialog("Digite o modelo: "));
		carroEntidade.setCor(JOptionPane.showInputDialog("Digite a cor: "));
		carroEntidade.setNumeroPortas(JOptionPane.showInputDialog("Digite o número de portas: "));
		
		return carroEntidade; // Retorna o objeto carroEntidade que é um objeto do tipo Carro
		
	}
	
	public Moto cadastroMoto() {
		
		Moto motoEntidade = new Moto();
		
		motoEntidade.setMarca(JOptionPane.showInputDialog("Digite a marca: "));
		motoEntidade.setModelo(JOptionPane.showInputDialog("Digite o modelo: "));
		motoEntidade.setCor(JOptionPane.showInputDialog("Digite a cor: "));
		motoEntidade.setTipoGuidao(JOptionPane.showInputDialog("Digite o tipo do Guidão: "));
		
		return motoEntidade;

	}
	
	public void imprimirCarro(List<Carro> listaCarros) {
		
		StringBuilder impressaoCarrosString = new StringBuilder();
		
		for(Carro carroItemLista:listaCarros) {
			
			impressaoCarrosString.append("\n").append("Marca: ").append(carroItemLista.getMarca()).append("\n")
								.append("Modelo: ").append(carroItemLista.getModelo()).append("\n")
								.append("Cor: ").append(carroItemLista.getCor()).append("\n")
								.append("Quantidade de portas: ").append(carroItemLista.getNumeroPortas())
								.append("\n").append("__________________________").append("\n");
			
		}
		
		JOptionPane.showMessageDialog(null, impressaoCarrosString.toString());
		
	}
	
	public void imprimirMoto(List<Moto> listaMotos) {
		
		StringBuilder impressaoMotosString = new StringBuilder();
		
		for(Moto motoItemLista:listaMotos) {
			
			impressaoMotosString.append("\n").append("Marca: ").append(motoItemLista.getMarca()).append("\n")
								.append("Modelo: ").append(motoItemLista.getModelo()).append("\n")
								.append("Cor: ").append(motoItemLista.getCor()).append("\n")
								.append("Tipo do guidão: ").append(motoItemLista.getTipoGuidao())
								.append("\n").append("__________________________").append("\n");
			
		}
		
		JOptionPane.showMessageDialog(null, impressaoMotosString.toString());
		
	}
	
	

}
