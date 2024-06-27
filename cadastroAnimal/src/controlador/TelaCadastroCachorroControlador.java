package controlador;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import arquivo.ManipuladorArquivoCachorro;
import entidade.Cachorro;
import persistencia.DaoCachorro;

public class TelaCadastroCachorroControlador implements ActionListener{
	
	JTextField caixaTextoPrimeiroCampoRecebidoNome;
	JTextField caixaTextoSegundoCampoRecebidoCaf;
	JTextField caixaTextoTerceiroCampoRecebidoRaca;
	JFrame frameTelaCadastroCachorro;
	
	ManipuladorArquivoCachorro manipuladorArquivoCachorro = new ManipuladorArquivoCachorro();
	
	//DaoCachorro daoCachorro = new DaoCachorro(); - NUNCA DEVEMOS CHAMAR A DAO PELO CONTROLLER
	
	

	public TelaCadastroCachorroControlador(JTextField caixaTextoPrimeiroCampoRecebidoNome,
			JTextField caixaTextoSegundoCampoRecebidoCaf, JTextField caixaTextoTerceiroCampoRecebidoRaca,
			JFrame frameTelaCadastroCachorro) {
		
		this.caixaTextoPrimeiroCampoRecebidoNome = caixaTextoPrimeiroCampoRecebidoNome;
		this.caixaTextoSegundoCampoRecebidoCaf = caixaTextoSegundoCampoRecebidoCaf;
		this.caixaTextoTerceiroCampoRecebidoRaca = caixaTextoTerceiroCampoRecebidoRaca;
		this.frameTelaCadastroCachorro = frameTelaCadastroCachorro;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		registrarArquivo();
		
		System.out.println("O nome: " + caixaTextoPrimeiroCampoRecebidoNome.getText());
		System.out.println("O CAF: " + caixaTextoSegundoCampoRecebidoCaf.getText());
		System.out.println("A raça: " + caixaTextoTerceiroCampoRecebidoRaca.getText());
		frameTelaCadastroCachorro.setVisible(false);
		
	}
	
	public void registrarArquivo() {
		Cachorro cachorro = new Cachorro();
		
		cachorro.setNome(caixaTextoPrimeiroCampoRecebidoNome.getText());
		cachorro.setCaf(caixaTextoSegundoCampoRecebidoCaf.getText());
		cachorro.setRaca(caixaTextoTerceiroCampoRecebidoRaca.getText());
		
		manipuladorArquivoCachorro.registrarCachorro(cachorro);
		
		
		if (daoCachorro.salvarCachorroNoBanco(cachorro)) {
			
			JOptionPane.showMessageDialog(null, "Dados do cachorro registrados com sucesso!");
		}else {
			
			JOptionPane.showMessageDialog(null, "Erro ao registrar dados do cachorro!");
		}
		
	}

}
