package controlador;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JTextField;

import arquivo.ManipuladorArquivoCachorro;
import entidade.Cachorro;
import persistencia.DaoCachorro;

public class TelaCadastroCachorroControlador implements ActionListener{
	
	JTextField caixaTextoPrimeiroCampoRecebidoNome;
	JTextField caixaTextoSegundoCampoRecebidoCaf;
	JTextField caixaTextoTerceiroCampoRecebidoRaca;
	
	ManipuladorArquivoCachorro manipuladorArquivoCachorro = new ManipuladorArquivoCachorro();
	DaoCachorro daoCachorro = new DaoCachorro();
	
	
	public TelaCadastroCachorroControlador(JTextField caixaTextoPrimeiroCampoRecebidoNome,
			JTextField caixaTextoSegundoCampoRecebidoCaf, JTextField caixaTextoTerceiroCampoRecebidoRaca) {
		this.caixaTextoPrimeiroCampoRecebidoNome = caixaTextoPrimeiroCampoRecebidoNome;
		this.caixaTextoSegundoCampoRecebidoCaf = caixaTextoSegundoCampoRecebidoCaf;
		this.caixaTextoTerceiroCampoRecebidoRaca = caixaTextoTerceiroCampoRecebidoRaca;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		registrarArquivo();
		
		System.out.println("O nome: " + caixaTextoPrimeiroCampoRecebidoNome.getText());
		System.out.println("O CAF: " + caixaTextoSegundoCampoRecebidoCaf.getText());
		System.out.println("A raça: " + caixaTextoTerceiroCampoRecebidoRaca.getText());
		
	}
	
	public void registrarArquivo() {
		Cachorro cachorro = new Cachorro();
		
		cachorro.setNome(caixaTextoPrimeiroCampoRecebidoNome.getText());
		cachorro.setCaf(caixaTextoSegundoCampoRecebidoCaf.getText());
		cachorro.setRaca(caixaTextoTerceiroCampoRecebidoRaca.getText());
		
		manipuladorArquivoCachorro.registrarCachorro(cachorro);
		
		daoCachorro.salvarCachorroNoBanco(cachorro);
		
	}

}
