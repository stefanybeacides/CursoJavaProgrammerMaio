package tela;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.TelaMenuCobraControlador;

public class TelaMenuCobra {
	
	public void chamarTelaMenuCobra() {
		
		JFrame frameTelaMenuCobra = new JFrame(); // Instanciando um JFrame vazio
				
				frameTelaMenuCobra.setSize(200,200); // Altura e largura
				JPanel panelTelaMenuCobra = new JPanel(); // Cria o objeto painel
				
				JLabel labelOpcaoCadastroCobra = new JLabel("CO1 - Cadastrar Cobra"); // Cria a Label 1
				panelTelaMenuCobra.add(labelOpcaoCadastroCobra); // Adiciona a Lable no painel
				
				JLabel labelOpcaoListarCobra = new JLabel("CO2 - Listar Cobras"); // Cria a Label 2
				panelTelaMenuCobra.add(labelOpcaoListarCobra); // Adiciona a Lable no painel
				
				JLabel labelOpcaoEncerrar = new JLabel("CO3 - Encerrar"); // Cria a Label 3
				panelTelaMenuCobra.add(labelOpcaoEncerrar); // Adiciona a Lable no painel
				
				JTextField opcaoTexto = new JTextField(10); // Caixa de texto
				panelTelaMenuCobra.add(opcaoTexto); // Add o que foi digitado
				
				JButton botaoEnviar = new JButton("Enviar"); // Botão enviar
				panelTelaMenuCobra.add(botaoEnviar); // Adiciona o botão na tela
				
				
				frameTelaMenuCobra.add(panelTelaMenuCobra); // Adiciona o painel no frame
				frameTelaMenuCobra.setVisible(true);//Deixa visível
				
				TelaMenuCobraControlador telaMenuCobraControlador = new TelaMenuCobraControlador(opcaoTexto);
				botaoEnviar.addActionListener(telaMenuCobraControlador);
				
			}

}
