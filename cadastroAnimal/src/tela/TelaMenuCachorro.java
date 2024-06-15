package tela;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.TelaMenuCachorroControlador;

public class TelaMenuCachorro {
	
	public void chamarTelaMenuCachorro() {
		
		JFrame frameTelaMenuCachorro = new JFrame(); // Instanciando um JFrame vazio
				
				frameTelaMenuCachorro.setSize(200,200); // Altura e largura
				JPanel panelTelaMenuCachorro = new JPanel(); // Cria o objeto painel
				
				JLabel labelOpcaoCadastroCachorro = new JLabel("CA1 - Cadastrar Cachorro"); // Cria a Label 1
				panelTelaMenuCachorro.add(labelOpcaoCadastroCachorro); // Adiciona a Lable no painel
				
				JLabel labelOpcaoListarCachorro = new JLabel("CA2 - Listar Cachorro"); // Cria a Label 2
				panelTelaMenuCachorro.add(labelOpcaoListarCachorro); // Adiciona a Lable no painel
				
				JLabel labelOpcaoEncerrar = new JLabel("CA3 - Encerrar"); // Cria a Label 3
				panelTelaMenuCachorro.add(labelOpcaoEncerrar); // Adiciona a Lable no painel
				
				JTextField opcaoTexto = new JTextField(10); // Caixa de texto
				panelTelaMenuCachorro.add(opcaoTexto); // Add o que foi digitado
				
				JButton botaoEnviar = new JButton("Enviar"); // Botão enviar
				panelTelaMenuCachorro.add(botaoEnviar); // Adiciona o botão na tela
				
				
				frameTelaMenuCachorro.add(panelTelaMenuCachorro); // Adiciona o painel no frame
				frameTelaMenuCachorro.setVisible(true);//Deixa visível
				
				TelaMenuCachorroControlador telaMenuCachorroControlador = new TelaMenuCachorroControlador(opcaoTexto);
				botaoEnviar.addActionListener(telaMenuCachorroControlador);
				
			}

}
