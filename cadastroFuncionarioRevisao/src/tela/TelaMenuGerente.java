package tela;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.TelaMenuGerenteControlador;

public class TelaMenuGerente {

	public void chamarTelaMenuGerente() {
		
JFrame frameTelaMenuGerente = new JFrame(); // Instanciando um JFrame vazio
		
		frameTelaMenuGerente.setSize(200,200); // Altura e largura
		JPanel panelTelaMenuGerente = new JPanel(); // Cria o objeto painel
		
		JLabel labelOpcaoCadastroGerente = new JLabel("G1 - Cadastrar Gerente"); // Cria a Label 1
		panelTelaMenuGerente.add(labelOpcaoCadastroGerente); // Adiciona a Lable no painel
		
		JLabel labelOpcaoListarGerente = new JLabel("G2 - Listar Gerente"); // Cria a Label 2
		panelTelaMenuGerente.add(labelOpcaoListarGerente); // Adiciona a Lable no painel
		
		JLabel labelOpcaoEncerrar = new JLabel("G3 - Encerrar"); // Cria a Label 3
		panelTelaMenuGerente.add(labelOpcaoEncerrar); // Adiciona a Lable no painel
		
		JTextField opcaoTexto = new JTextField(10); // Caixa de texto
		panelTelaMenuGerente.add(opcaoTexto); // Add o que foi digitado
		
		JButton botaoEnviar = new JButton("Enviar"); // Botão enviar
		panelTelaMenuGerente.add(botaoEnviar); // Adiciona o botão na tela
		
		
		frameTelaMenuGerente.add(panelTelaMenuGerente); // Adiciona o painel no frame
		frameTelaMenuGerente.setVisible(true);//Deixa visível
		
		TelaMenuGerenteControlador telaMenuGerenteControlador = new TelaMenuGerenteControlador(opcaoTexto);
		botaoEnviar.addActionListener(telaMenuGerenteControlador);
		
	}
	
}
