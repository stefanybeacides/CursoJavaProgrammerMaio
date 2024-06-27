package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import persistencia.DaoCorrentistaBasico;
import tela.TelaCadastroCorrentista;
import tela.TelaListarCorrentistas;
import tela.TelaSecundaria;

public class ControllerTelaSecundaria implements ActionListener{

	JFrame frameTelaSecundaria;
	JTextField opcao;
	JButton botaoEnviar;
	
	
	TelaSecundaria telaSecundaria = new TelaSecundaria();
	

	public ControllerTelaSecundaria(JFrame frameTelaSecundaria, JTextField opcao, JButton botaoEnviar) {
		this.frameTelaSecundaria = frameTelaSecundaria;
		this.opcao = opcao;
		this.botaoEnviar = botaoEnviar;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(opcao.getText().equals("1") || opcao.getText().equals("2") || opcao.getText().equals("3") || opcao.getText().equals("4") || opcao.getText().equals("5")) {
			switch (opcao.getText()) {
				case "1": {
					TelaCadastroCorrentista.chamarTelaCadastroCorrentista();
					System.out.println("Direcione para o menu secundário!");
					frameTelaSecundaria.setVisible(false);
					break;
					
					}
				case "2": {
					TelaListarCorrentistas.listarCorrentistas(DaoCorrentistaBasico.retornoListaCorrentista());
					System.out.println("Direcione para a lista de correntistas!");
					break;
					
					}
				case "3": {
					
					System.out.println("Edite correntista!");
					break;
					
					}
				case "4": {
					
					System.out.println("Delete correntista!");
					break;
					
					}
				case "5": {
					System.exit(0);
					break;
					
				}
				
			}
		}else {
			
			JOptionPane.showMessageDialog(null, "A opção " + opcao.getText() + " não é válida!\nEscolha 1 para CADASTRAR, 2 para LISTAR, 3 para EDITAR, 4 para DELETAR ou 5 para ENCERRAR.");
	
	}
		
	}


	

	
}
