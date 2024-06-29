package tela;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import arquivo.ManipuladorArquivo;
import entidade.Correntista;
import entidade.CorrentistaBasico;

public class TelaListarCorrentistas {
	
public static void listarCorrentistas(List<Correntista> list) {
		
		int qtdLinhas = list.size();
		
		String[][] tabelaString = new String [qtdLinhas] [10];
		
		int posicaoColuna = 0;
		int posicaoLinha = 0;
		
		for (Correntista correntista : list) {
			
			tabelaString[posicaoLinha][posicaoColuna] = correntista.getNome();
			posicaoColuna ++;
			
			tabelaString[posicaoLinha][posicaoColuna] = correntista.getCpf();
			posicaoColuna ++;
			
			tabelaString[posicaoLinha][posicaoColuna] = correntista.getCep();
			posicaoColuna ++;
			
			tabelaString[posicaoLinha][posicaoColuna] = correntista.getLogradouro();
			posicaoColuna ++;
			
			tabelaString[posicaoLinha][posicaoColuna] = correntista.getBairro();
			posicaoColuna ++;
			
			tabelaString[posicaoLinha][posicaoColuna] = correntista.getCidade();
			posicaoColuna ++;
			
			tabelaString[posicaoLinha][posicaoColuna] = correntista.getUf();
			posicaoColuna ++;
			
			tabelaString[posicaoLinha][posicaoColuna] = correntista.getEmail();
			posicaoColuna ++;
			
			tabelaString[posicaoLinha][posicaoColuna] = String.valueOf(correntista.getQtdTransacao());
			posicaoColuna ++;
			
			tabelaString[posicaoLinha][posicaoColuna] = String.valueOf(correntista.getValorAnuidade());
			
			posicaoLinha ++;
			posicaoColuna = 0;
			
		}
		
		String nomeColunas[] = {"NOME", "CPF", "CEP", "LOGRADOURO", "BAIRRO", "CIDADE", "UF", "EMAIL", "QTD TRANSAÇÕES", "VALOR ANUIDADE"};
		
		JFrame frameListarCorrentista = new JFrame();
		
		frameListarCorrentista.setSize(500,600);
		
		JTable tabelaCorrentista = new JTable(tabelaString, nomeColunas);
		
	
		
		tabelaCorrentista.setBounds(30, 40, 300, 300);
		
		JScrollPane scrollPaneListarCorrentista = new JScrollPane(tabelaCorrentista);
		
		JPanel panelListarCorrentista = new JPanel();
		
		panelListarCorrentista.add(scrollPaneListarCorrentista);
		
		frameListarCorrentista.add(panelListarCorrentista);
		
		JButton gerarPDF = new JButton("Gerar PDF Detalhado");
		panelListarCorrentista.add(gerarPDF);
		
		gerarPDF.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
                try {
                	ManipuladorArquivo manipuladorArquivo = new ManipuladorArquivo();
                	manipuladorArquivo.gerarPdfCorrentista(list);
                	TelaSecundaria secundaria  = new TelaSecundaria();
                	frameListarCorrentista.setVisible(false);
                	TelaSecundaria.chamarTelaMenuSecundario(list.get(0).getTabela());
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
        });
		
		frameListarCorrentista.setVisible(true);
		
	}
		
	}

