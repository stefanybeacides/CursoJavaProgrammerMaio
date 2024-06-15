package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import arquivo.ManipuladorArquivoCobra;
import entidade.Cobra;


public class TelaCadastroCobraControlador implements ActionListener{

	JTextField caixaTextoPrimeiroCampoRecebidoNome;
	JTextField caixaTextoSegundoCampoRecebidoCaf;
	JTextField caixaTextoTerceiroCampoRecebidoVeneno;
	
	ManipuladorArquivoCobra manipuladorArquivoCobra = new ManipuladorArquivoCobra();
	

	public TelaCadastroCobraControlador(JTextField caixaTextoPrimeiroCampoRecebidoNome,
			JTextField caixaTextoSegundoCampoRecebidoCaf, JTextField caixaTextoTerceiroCampoRecebidoRaca) {
		this.caixaTextoPrimeiroCampoRecebidoNome = caixaTextoPrimeiroCampoRecebidoNome;
		this.caixaTextoSegundoCampoRecebidoCaf = caixaTextoSegundoCampoRecebidoCaf;
		this.caixaTextoTerceiroCampoRecebidoVeneno = caixaTextoTerceiroCampoRecebidoVeneno;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		registrarArquivo();
		
		System.out.println("O nome: " + caixaTextoPrimeiroCampoRecebidoNome.getText());
		System.out.println("O CAF: " + caixaTextoSegundoCampoRecebidoCaf.getText());
		System.out.println("O tipo de veneno: " + caixaTextoTerceiroCampoRecebidoVeneno.getText());
		
	}
	
	public void registrarArquivo() {
		Cobra cobra = new Cobra();
		
		cobra.setNome(caixaTextoPrimeiroCampoRecebidoNome.getText());
		cobra.setCaf(caixaTextoSegundoCampoRecebidoCaf.getText());
		cobra.setVeneno(caixaTextoTerceiroCampoRecebidoVeneno.getText());
		
		manipuladorArquivoCobra.registrarCobra(cobra);
		
	}

}

