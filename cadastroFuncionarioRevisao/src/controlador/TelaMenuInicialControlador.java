package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import tela.TelaMenuGerente;

public class TelaMenuInicialControlador implements ActionListener {
	
	//Atributos da classe
	JTextField opcao;
	//Telas
	TelaMenuGerente telaMenuGerente = new TelaMenuGerente();
	
	
	public TelaMenuInicialControlador(JTextField opcao) {
		this.opcao = opcao;
	}



	@Override // Sobreescrever
	public void actionPerformed(ActionEvent e) {
		
		
		if(opcao.getText().equals("1") || opcao.getText().equals("2") || opcao.getText().equals("3")) {
			switch (opcao.getText()) {
				case "1": {
					telaMenuGerente.chamarTelaMenuGerente();
					System.out.println("Direcione para a tela do Gerente!");
					break;
					
					}
				case "2": {
					System.out.println("Direcione para a tela do Atendente!");
					break;
					
					}
				case "3": {
					System.exit(0);
					break;
					
				}
				
			}
		}else {
			
			JOptionPane.showMessageDialog(null, "A opção " + opcao.getText() + " não é válida!\nEscolha 1 para GERENTE, 2 para ATENDENTE ou 3 para ENCERRAR.");
	
	}
		
}
	
	

}
