package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entidade.Cachorro;
import persistencia.DaoCachorro;
import tela.TelaCadastroCachorro;

public class TelaMenuCachorroControlador implements ActionListener {

	// Atributo de classe
	JTextField opcaoRecebida;
	JFrame frameTelaMenuCachorro;

	// Telas
	TelaCadastroCachorro cadastroCachorro = new TelaCadastroCachorro();
	TelaListarCachorro listarCachorro = new TelaListarCachorro();
	
	DaoCachorro daoCachorro = new DaoCachorro();

	public TelaMenuCachorroControlador(JTextField opcaoRecebida, JFrame frameTelaMenuCachorro) {
		this.opcaoRecebida = opcaoRecebida;
		this.frameTelaMenuCachorro = frameTelaMenuCachorro;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {

		if (opcaoRecebida.getText().equals("CA1") || opcaoRecebida.getText().equals("CA2")
				|| opcaoRecebida.getText().equals("CA3")) {
			switch (opcaoRecebida.getText()) {
			case "CA1": {
				cadastroCachorro.chamarTelaCadastroCachorro();
				System.out.println("Direcione para a tela de cadastro do Cachorro!");
				frameTelaMenuCachorro.setVisible(false);
				break;

			}
			case "CA2": {
				TelaListarCachorro.listarCachorro(daoCachorro.retornoListaCachorro());
				System.out.println("Direcione para a lista de Cachorros!");
				break;

			}
			case "CA3": {
				System.exit(0);
				break;

			}

			}
		} else {

			JOptionPane.showMessageDialog(null, "A opção " + opcaoRecebida.getText()
					+ " não é válida!\nEscolha CA1 para CADASTRAR CACHORRO, CA2 para LISTAR CACHORROS ou CA3 para ENCERRAR.");
		}
	}
		

}
