package interacaoUsuario;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entidades.Carro;
import entidades.Moto;

public class Menu {
	
	public void menuInicial() {
		
		CadastroVeiculo cadastroVeiculo = new CadastroVeiculo(); // Instancia a classe cadastro de veículo
		Carro carroParaAddNaLista = new Carro(); // Instancia a classe CARRO->Objeto do tipo entidade
		List<Carro> carroLista = new ArrayList<Carro>(); // Cria uma lista que armazena objetos dos tipo CARRO
		Moto motoParaAddNaLista = new Moto(); // Instancia a classe do tipo CARRO-> Objeto do tipo entidade
		List<Moto> motoLista = new ArrayList<Moto>(); // Cria uma lista que armazena itens do tipo MOTO
		
		int opcao = 0; // Amazena a opção de menu escolhida pelo usuário
		
		while (true) { // Tudo que está dentro do while vai se repetir enquanto(while) a variável menuResultado for true
			
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para Carro" + "\n"
			+ "Digite 2 para Moto" + "\n" 
			+ "Digite 3 para listar Carros cadastrados" + "\n"
			+ "Digite 4 para listar Motos cadastradas" + "\n"
			+ "Digite 5 para Encerrar" + "\n"));
			
		
		switch (opcao) { //Verifica o valor da variavel opção que foi escolhida pelo usuário
		case 1: { // Se o usuário digitar 1 entra nesse caso
			carroParaAddNaLista = cadastroVeiculo.cadastrarCarro(); // Chama o método que é reponsável por cadastrar CARROS, que está dentro da classe cadastroVeiculo, e armazena o cadastro no objeto carroParaAddNaLista
			carroLista.add(carroParaAddNaLista);
			break;
		}
		
		case 2: { // Se o usuário digitar 2 entra nesse caso
			motoParaAddNaLista = cadastroVeiculo.cadastroMoto(); // Chama o método que é reponsável por cadastrar MOTOS, que está dentro da classe cadastroVeiculo, e armazena o cadastro no objeto motoParaAddNaLista
			motoLista.add(motoParaAddNaLista);
			break;
		}
		
		case 3: { // Se o usuário digitar 3 entra nesse caso
			cadastroVeiculo.imprimirCarro(carroLista);
			break;
		}
		
		case 4: { // Se o usuário digitar 4 entra nesse caso
			cadastroVeiculo.imprimirMoto(motoLista);
			break;
		}
		
		case 5: { // Se o usuário digitar 5 entra nesse caso
			System.exit(0);
			break;
		}
		default: // Se não for nenhuma das opções entra nesse caso
			JOptionPane.showMessageDialog(null, "Opção inválida! Por favor digite 1 ou 2.");
			break;
		}
		
	}
		
		
		
		/*if (opcao == 1) {
			
			cadastroVeiculo.cadastrarCarro();
			
		}
		if (opcao == 2) {
			
			cadastroVeiculo.cadastroMoto();
		}
		if (opcao != 1 && opcao != 2) {
			
			JOptionPane.showMessageDialog(null, "Opção inválida! Por favor digite 1 ou 2.");
		}*/
		
		cadastroVeiculo.cadastrarCarro();
		cadastroVeiculo.cadastroMoto();

	}

}
