package controlador;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import entidade.Cachorro;

public class TelaListarCachorro {
	
	public static void listarCachorro(List<Cachorro> listaCachorro) {
		
		int qtdLinhas = listaCachorro.size();
		
		String[][] tabelaString = new String [qtdLinhas] [3];
		
		int posicaoColuna = 0;
		int posicaoLinha = 0;
		
		for (Cachorro cachorro : listaCachorro) {
			
			tabelaString[posicaoLinha][posicaoColuna] = cachorro.getNome();
			posicaoColuna ++;
			
			tabelaString[posicaoLinha][posicaoColuna] = cachorro.getCaf();
			posicaoColuna ++;
			
			tabelaString[posicaoLinha][posicaoColuna] = cachorro.getRaca();
			
			posicaoLinha ++;
			posicaoColuna = 0;
			
		}
		
		String nomeColunas[] = {"NOME", "CAF", "RAÇA"};
		
		JFrame frameListarCachorro = new JFrame();
		
		frameListarCachorro.setSize(500,600);
		
		JTable tabelaCachorro = new JTable(tabelaString, nomeColunas);
		
		tabelaCachorro.setBounds(30, 40, 300, 300);
		
		JScrollPane scrollPaneListarCachorro = new JScrollPane(tabelaCachorro);
		
		JPanel panelListarCachorro = new JPanel();
		
		panelListarCachorro.add(scrollPaneListarCachorro);
		
		frameListarCachorro.add(panelListarCachorro);
		
		frameListarCachorro.setVisible(true);
		
	}

}
