package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import tela.TelaCadastroCobra;

public class TelaMenuCobraControlador implements ActionListener {
	
	//Atributo de classe
	JTextField opcaoRecebida;
	
	//Telas
	TelaCadastroCobra cadastroCobra = new TelaCadastroCobra();
	
	

	public TelaMenuCobraControlador(JTextField opcaoTexto) {
		this.opcaoRecebida = opcaoTexto;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (opcaoRecebida.getText().equals("CO1") || opcaoRecebida.getText().equals("CO2") || opcaoRecebida.getText().equals("CO3")) {
				switch (opcaoRecebida.getText()) {
				case "CO1": {
					cadastroCobra.chamarTelaCadastroCobra();
					System.out.println("Direcione para a tela de cadastro da Cobra!");
					break;
					
					}
				case "CO2": {
					System.out.println("Direcione para a lista de Cobras!");
					break;
					
					}
				case "CO3": {
					System.exit(0);
					break;
					
				}
			
			}
		}else {
			
			JOptionPane.showMessageDialog(null, "A opção " + opcaoRecebida.getText() + " não é válida!\nEscolha CO1 para CADASTRAR COBRA, CO2 para LISTAR COBRAS ou CO3 para ENCERRAR.");
		}
		
	}

}
