package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entidade.Correntista;
import entidade.CorrentistaBasico;
import persistencia.DaoCorrentista;
import persistencia.DaoCorrentistaBasico;

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
	String tipoCorrentista;
	JFrame frameTelaCadastroCorrentista;
	JButton botaoCadastrar;
	JButton botaoVoltar;
	
	
	
	public ControllerTelaCadastroCorrentista(JTextField caixaTextoRecebidoNome, JTextField caixaTextoRecebidoCpf,
			JTextField caixaTextoRecebidoCep, JTextField caixaTextoRecebidoLogradouro,
			JTextField caixaTextoRecebidoBairro, JTextField caixaTextoRecebidoCidade, JTextField caixaTextoRecebidoUf,
			JTextField caixaTextoRecebidoEmail, JTextField caixaTextoRecebidoQtd, JTextField caixaTextoRecebidoAnuidade, String correntista,
			JFrame frameTelaCadastroCorrentista, JButton botaoCadastrar, JButton botaoVoltar) {
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
		this.tipoCorrentista = correntista;
		this.botaoCadastrar = botaoCadastrar;
		this.botaoVoltar = botaoVoltar;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		 if (e.getSource() == botaoCadastrar) {
			 CorrentistaBasico correntista = new CorrentistaBasico();
			 DaoCorrentistaBasico dao = new DaoCorrentistaBasico();
			 DaoCorrentista daoCorrentista = new DaoCorrentista();
			 Correntista correntista2 = daoCorrentista.buscarCorrentista(caixaTextoRecebidoCpf.getText());
			 
			 if (correntista2 == null) {
			 
	            correntista.setNome(caixaTextoRecebidoNome.getText()); 
	            correntista.setCpf(caixaTextoRecebidoCpf.getText()); 
	            correntista.setCep(caixaTextoRecebidoCep.getText());
	            correntista.setLogradouro(caixaTextoRecebidoLogradouro.getText());
	            correntista.setBairro(caixaTextoRecebidoBairro.getText());
	            correntista.setCidade(caixaTextoRecebidoCidade.getText());
	            correntista.setUf(caixaTextoRecebidoUf.getText());
	            correntista.setEmail(caixaTextoRecebidoEmail.getText());
	            correntista.setQtdTransacao(Integer.parseInt(caixaTextoRecebidoQtd.getText()));
	            correntista.setValorAnuidade(Double.parseDouble(caixaTextoRecebidoAnuidade.getText()));
	            correntista.setTabela(tipoCorrentista);


	            boolean sucesso = dao.salvarCorrentistaNoBanco(correntista);
	            if (sucesso) {
	                JOptionPane.showMessageDialog(frameTelaCadastroCorrentista, "Cadastro realizado com sucesso!");
	                limparCampos();
	            } else {
	                JOptionPane.showMessageDialog(frameTelaCadastroCorrentista, "Erro ao realizar cadastro!");
	            }
			 }else {
				 JOptionPane.showMessageDialog(null, "CPF ja cadastrado na base de dados.");
			 }
	        } else if (e.getSource() == botaoVoltar) {
	            frameTelaCadastroCorrentista.dispose();
	        }
	    }

	    private void limparCampos() {
	        caixaTextoRecebidoNome.setText("");
	        caixaTextoRecebidoCpf.setText("");
	        caixaTextoRecebidoCep.setText("");
	        caixaTextoRecebidoLogradouro.setText("");
	        caixaTextoRecebidoBairro.setText("");
	        caixaTextoRecebidoCidade.setText("");
	        caixaTextoRecebidoUf.setText("");
	        caixaTextoRecebidoEmail.setText("");
	        caixaTextoRecebidoQtd.setText("");
	        caixaTextoRecebidoAnuidade.setText("");
	    }
		
	}
	


