package tela;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.TelaMenuInicialControlador;

public class TelaMenuInicial {
	
	public void chamarTelaMenuInicial() {
		
		JFrame frameTelaInicial = new JFrame(); // Instanciando um JFrame vazio
		
		frameTelaInicial.setSize(200,200); // Altura e largura
		JPanel panelTelaInicial = new JPanel(); // Cria o objeto painel
		
		JLabel labelOpcaoGerente = new JLabel("1 - Menu Gerente"); // Cria a Label 1
		panelTelaInicial.add(labelOpcaoGerente); // Adiciona a Lable no painel
		
		JLabel labelOpcaoAtendente = new JLabel("2 - Menu Atendente"); // Cria a Label 2
		panelTelaInicial.add(labelOpcaoAtendente); // Adiciona a Lable no painel
		
		JLabel labelOpcaoEncerrar = new JLabel("3 - Encerrar"); // Cria a Label 3
		panelTelaInicial.add(labelOpcaoEncerrar); // Adiciona a Lable no painel
		
		JTextField opcaoTexto = new JTextField(10);
		panelTelaInicial.add(opcaoTexto);
		
		JButton botaoEnviar = new JButton("Enviar");
		panelTelaInicial.add(botaoEnviar);
		
		
		
		
		
		frameTelaInicial.add(panelTelaInicial); // Adiciona o painel no frame
		frameTelaInicial.setVisible(true); // Define a visibilidade do frame
		
		TelaMenuInicialControlador telaMenuInicialControlador = new TelaMenuInicialControlador(opcaoTexto); // Ao construir o controlador o mesmo vai ter o valor opcaoTexto inserido
		botaoEnviar.addActionListener(telaMenuInicialControlador);
		
	}

}
