package tela;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.ControllerTelaInicial;

public class TelaInicial {
	
public void chamarTelaMenuInicial() {
		
		JFrame frameTelaInicial = new JFrame(); 
		
		GridLayout grid = new GridLayout(0, 1);
		
		frameTelaInicial.setSize(300,300); 
		JPanel panelTelaInicial = new JPanel();
		
		JLabel labelCorrentistaBasico = new JLabel("1 - Correntista básico");
		panelTelaInicial.add(labelCorrentistaBasico);
		panelTelaInicial.setLayout(grid);
		
		JLabel labelCorrentistaPremium = new JLabel("2 - Correntista premium");
		panelTelaInicial.add(labelCorrentistaPremium);
		
		JLabel labelEncerrar = new JLabel("3 - Encerrar");
		panelTelaInicial.add(labelEncerrar);
		
		JTextField opcaoTexto = new JTextField(10);
		panelTelaInicial.add(opcaoTexto);
		
		JButton botaoEnviar = new JButton("Enviar");
		panelTelaInicial.add(botaoEnviar);
		

		frameTelaInicial.add(panelTelaInicial);
		frameTelaInicial.setVisible(true);
		
		ControllerTelaInicial controllerTelaInicial = new ControllerTelaInicial(frameTelaInicial, opcaoTexto, botaoEnviar);
		botaoEnviar.addActionListener(controllerTelaInicial);
		
	}

}
