package tela;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCadastroCobra {
	
	public void chamarTelaCadastroCobra() {
		
		GridLayout grid = new GridLayout(0,1);
		String primeiroCampo = "Digite o nome da cobra";
		String segundoCampo = "Digite o CAF da cobra";
		String terceiroCampo = "Digite o tipo de veneno da cobra"; 
		
		JFrame frameTelaCadastroCobra = new JFrame();
		
		frameTelaCadastroCobra.setSize (300, 300);
		JPanel panelTelaCadastroCobra = new JPanel();
		
		JLabel labelPrimeiroCampo = new JLabel(primeiroCampo);
		panelTelaCadastroCobra.add(labelPrimeiroCampo);
		panelTelaCadastroCobra.setLayout(grid);
		
		JTextField caixaTextoPrimeiroCampo = new JTextField(10);
		panelTelaCadastroCobra.add(caixaTextoPrimeiroCampo);
		
		
		JLabel labelSegundoCampo = new JLabel(segundoCampo);
		panelTelaCadastroCobra.add(labelSegundoCampo);
		
		JTextField caixaTextoSegundoCampo = new JTextField(10);
		panelTelaCadastroCobra.add(caixaTextoSegundoCampo);
		
		
		JLabel labelTerceiroCampo = new JLabel(terceiroCampo);
		panelTelaCadastroCobra.add(labelTerceiroCampo);
		
		JTextField caixaTextoTerceiroCampo = new JTextField(10);
		panelTelaCadastroCobra.add(caixaTextoTerceiroCampo);
		
		JButton botaoCadastrar = new JButton("Cadastrar");
		panelTelaCadastroCobra.add(botaoCadastrar);
		
		
		frameTelaCadastroCobra.add(panelTelaCadastroCobra);
		frameTelaCadastroCobra.setVisible(true);
		
		
	}

}
