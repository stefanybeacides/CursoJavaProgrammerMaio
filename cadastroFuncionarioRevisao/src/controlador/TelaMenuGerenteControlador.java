package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaMenuGerenteControlador implements ActionListener {
	
	JTextField opcaoRecebida;

	public TelaMenuGerenteControlador(JTextField opcaoRecebida) {
		this.opcaoRecebida = opcaoRecebida;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (opcaoRecebida.getText().equals("G1") || opcaoRecebida.getText().equals("G2") || opcaoRecebida.getText().equals("G3")) {
				switch (opcaoRecebida.getText()) {
				case "G1": {
		
					System.out.println("Direcione para a tela de cadastro do Gerente!");
					break;
					
					}
				case "G2": {
					System.out.println("Direcione para a lista de Gerentes!");
					break;
					
					}
				case "G3": {
					System.exit(0);
					break;
					
				}
			
			}
		}else {
			
			JOptionPane.showMessageDialog(null, "A opção " + opcaoRecebida.getText() + " não é válida!\nEscolha G1 para CADASTRAR GERENTE, G2 para LISTAR GERENTES ou G3 para ENCERRAR.");
		}
		
	}

}
