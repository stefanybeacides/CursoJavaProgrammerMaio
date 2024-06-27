package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class ControllerTelaCadastroCorrentista implements ActionListener {
	
	JTextField caixaTextoRecebidoNome;
	JTextField caixaTextoRecebidoCpf;
	JTextField caixaTextoRecebidoCep;
	JTextField caixaTextoRecebidoLogradouro;
	JTextField caixaTextoRecebidoBairro;
	JTextField caixaTextoRecebidoCidade;
	JTextField caixaTextoRecebidoUf;
	JTextField caixaTextoRecebidoEmail;
	JTextField caixaTextoRecebidoQtd;
	JTextField caixaTextoRecebidoAnuidade;
	JFrame frameTelaCadastroCorrentista;
	
	
	
	public ControllerTelaCadastroCorrentista(JTextField caixaTextoRecebidoNome, JTextField caixaTextoRecebidoCpf,
			JTextField caixaTextoRecebidoCep, JTextField caixaTextoRecebidoLogradouro,
			JTextField caixaTextoRecebidoBairro, JTextField caixaTextoRecebidoCidade, JTextField caixaTextoRecebidoUf,
			JTextField caixaTextoRecebidoEmail, JTextField caixaTextoRecebidoQtd, JTextField caixaTextoRecebidoAnuidade,
			JFrame frameTelaCadastroCorrentista) {
		this.caixaTextoRecebidoNome = caixaTextoRecebidoNome;
		this.caixaTextoRecebidoCpf = caixaTextoRecebidoCpf;
		this.caixaTextoRecebidoCep = caixaTextoRecebidoCep;
		this.caixaTextoRecebidoLogradouro = caixaTextoRecebidoLogradouro;
		this.caixaTextoRecebidoBairro = caixaTextoRecebidoBairro;
		this.caixaTextoRecebidoCidade = caixaTextoRecebidoCidade;
		this.caixaTextoRecebidoUf = caixaTextoRecebidoUf;
		this.caixaTextoRecebidoEmail = caixaTextoRecebidoEmail;
		this.caixaTextoRecebidoQtd = caixaTextoRecebidoQtd;
		this.caixaTextoRecebidoAnuidade = caixaTextoRecebidoAnuidade;
		this.frameTelaCadastroCorrentista = frameTelaCadastroCorrentista;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
	}
	

}
