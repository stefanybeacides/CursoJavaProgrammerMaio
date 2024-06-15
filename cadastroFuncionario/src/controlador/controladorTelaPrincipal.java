package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import interfaceGrafica.TelaGerente;

public class controladorTelaPrincipal implements ActionListener {

	JTextField opcaoDigitada;
	JFrame frameTelaPrincipalFrame;
	TelaGerente telaGerente = new TelaGerente();

	public controladorTelaPrincipal(JTextField caixaTextoOpcao, JFrame frameMenuPrincipal) {

		this.opcaoDigitada = caixaTextoOpcao;
		this.frameTelaPrincipalFrame = frameMenuPrincipal;

	}

	@Override
	public void actionPerformed(ActionEvent eventoBotao) {

		String opcao = opcaoDigitada.getText();

		if (opcao.equals("1") || opcao.equals("2")) {

			switch (opcao) {
			case "1":
				telaGerente.menuGerente();
				frameTelaPrincipalFrame.setVisible(false);
				System.out.println("Digitou a opção 1");
				break;
				
			case "2":
				
				System.out.println("Digitou a opção 2");
				break;
			}

		} else {

			JOptionPane.showMessageDialog(null, "Somente opção 1 ou 2 são válidas!");
		}
	}

}
