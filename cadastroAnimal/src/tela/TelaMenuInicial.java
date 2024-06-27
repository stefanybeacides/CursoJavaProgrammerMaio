package tela;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.TelaMenuCachorroControlador;
import controlador.TelaMenuInicialControlador;

public class TelaMenuInicial {
	
public void chamarTelaMenuInicial() {
		
		JFrame frameTelaInicial = new JFrame(); // Instanciando um JFrame vazio
		
		GridLayout grid = new GridLayout(0, 1);
		
		frameTelaInicial.setSize(300,300); // Altura e largura
		JPanel panelTelaInicial = new JPanel(); // Cria o objeto painel
		
		JLabel labelOpcaoCachorro = new JLabel("1 - Menu Cachorro"); // Cria a Label 1
		panelTelaInicial.add(labelOpcaoCachorro); // Adiciona a Lable no painel
		panelTelaInicial.setLayout(grid);
		
		JLabel labelOpcaoCobra = new JLabel("2 - Menu Cobra"); // Cria a Label 2
		panelTelaInicial.add(labelOpcaoCobra); // Adiciona a Lable no painel
		
		JLabel labelOpcaoEncerrar = new JLabel("3 - Encerrar"); // Cria a Label 3
		panelTelaInicial.add(labelOpcaoEncerrar); // Adiciona a Lable no painel
		
		JTextField opcaoTexto = new JTextField(10); // Caixa de texto
		panelTelaInicial.add(opcaoTexto); // Add o que foi digitado
		
		JButton botaoEnviar = new JButton("Enviar"); // Botão enviar
		panelTelaInicial.add(botaoEnviar);
		
		
		
		frameTelaInicial.add(panelTelaInicial); // Adiciona o painel no frame
		frameTelaInicial.setVisible(true); // Define a visibilidade do frame
		
		TelaMenuInicialControlador telaMenuInicialControlador = new TelaMenuInicialControlador(opcaoTexto, frameTelaInicial);
		botaoEnviar.addActionListener(telaMenuInicialControlador);
		
	}

}
