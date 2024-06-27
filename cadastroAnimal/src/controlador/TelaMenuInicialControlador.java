package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import tela.TelaMenuCachorro;
import tela.TelaMenuCobra;


public class TelaMenuInicialControlador implements ActionListener {
	
	//Atributos da classe
	JTextField opcao;
	JFrame frameTelaInicial;
	
	//Telas
	TelaMenuCachorro telaMenuCachorro = new TelaMenuCachorro();
	TelaMenuCobra telaMenuCobra = new TelaMenuCobra();
	
	
	



	public TelaMenuInicialControlador(JTextField opcao, JFrame frameTelaInicial) {
		this.opcao = opcao;
		this.frameTelaInicial = frameTelaInicial;
	}






	@Override // Sobreescrever
	public void actionPerformed(ActionEvent e) {
		
		
		if(opcao.getText().equals("1") || opcao.getText().equals("2") || opcao.getText().equals("3")) {
			switch (opcao.getText()) {
				case "1": {
					telaMenuCachorro.chamarTelaMenuCachorro();
					System.out.println("Direcione para a tela do Cachorro!");
					frameTelaInicial.setVisible(false);
					break;
					
					}
				case "2": {
					telaMenuCobra.chamarTelaMenuCobra();
					System.out.println("Direcione para a tela da Cobra!");
					break;
					
					}
				case "3": {
					System.exit(0);
					break;
					
				}
				
			}
		}else {
			
			JOptionPane.showMessageDialog(null, "A opção " + opcao.getText() + " não é válida!\nEscolha 1 para CACHORRO, 2 para COBRA ou 3 para ENCERRAR.");
	
	}
		
}

}
