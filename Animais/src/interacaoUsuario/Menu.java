package interacaoUsuario;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entidade.Cachorro;
import entidade.Gato;

public class Menu {

public void menuInicial() {
		
		
		cadastroAnimal cadAnimal = new cadastroAnimal();
		Cachorro cachorroParaAddNaLista = new Cachorro();
		Gato gatoParaAddNaLista = new Gato();
		List<Cachorro> cachorroLista = new ArrayList<Cachorro>();
		List<Gato> gatoLista = new ArrayList<Gato>();
		
		
		int opcao;
		
		boolean menuResultado = true; // somente verdadeiro ou falso
		
		// tudo que está dentro do while vai se repetir enquanto(while) a variavel menuResultado for true(verdadeiro)
		while (menuResultado) {
			
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para Cachorro " + "\n"
					+ " Digite 2 para Gato" + "\n" 
					+ " Digite 3 para listar os Cachorros" + "\n"
					+ " Digite 4 para listar os Gatos" + "\n"
					+ " Digite 5 para listaEncerrar" + "\n"
					
					));
			
			switch (opcao) { // Verificar o valor da variavel opcao
			case 1: { // Caso for 1 entra nesse caso
				cachorroParaAddNaLista = cadAnimal.cadastrarCachorro();// VAI EXECUTAR ESSA LINHA
				cachorroLista.add(cachorroParaAddNaLista);
				break;
			}
			case 2: { //Caso for 2 entra nesse caso
				gatoParaAddNaLista = cadAnimal.cadastroGato();
				gatoLista.add(gatoParaAddNaLista);
				
				break;
			}
			case 3: { 
				cadAnimal.imprimirCachorro(cachorroLista);
				break;
			}
			case 4: { 
				cadAnimal.imprimirGato(gatoLista);
				break;
			}
			case 5: { //Caso for 2 entra nesse caso
				System.exit(0);
				break;
			}
			default: // Se não for nenhuma opcao entra aqui
				JOptionPane.showMessageDialog(null, "Insira 1 ou 2");
				break;
			}
			
		}
		
		/*USANDO O MENU COM IF
		if(opcao == 1) { // SE A OPÇÃO DIGITADA FOR 1
			cadastroVeiculo.cadastrarCarro();// VAI EXECUTAR ESSA LINHA
		}
		if(opcao == 2) {
			cadastroVeiculo.cadastroMoto();
		}
		
		if(opcao != 1 || opcao != 2) {
				JOptionPane.showMessageDialog(null, "Insira 1 ou 2");
		}
		*/
		
	
		
	}// FIM

	
	
}
