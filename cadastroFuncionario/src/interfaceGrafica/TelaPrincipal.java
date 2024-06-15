package interfaceGrafica;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.controladorTelaPrincipal;

public class TelaPrincipal {

	public void menuPrincipal() {

		JFrame frameMenuPrincipal = new JFrame(); // Frame da tela
		frameMenuPrincipal.setSize(200, 200); // Informa largura e altura

		JPanel panelMenuPrincipal = new JPanel(); // Painel onde iremos agrupar os componentes

		JLabel labelOpcao1 = new JLabel("1 - Para Menu Gerente"); // Label da primeira opção
		panelMenuPrincipal.add(labelOpcao1); // Adiciona a labelOpcao1 no painel

		JLabel labelOpcao2 = new JLabel("2 - Para Menu Atendente"); // Label da segunda opção
		panelMenuPrincipal.add(labelOpcao2);// Adiciona a labelOpcao2 no painel

		JTextField caixaTextoOpcao = new JTextField(10); // Cria a caixa de texto
		panelMenuPrincipal.add(caixaTextoOpcao); // Adiciona a caixa de texto no painel

		JButton botaoEnviar = new JButton("Enviar"); // Cria o botão com o valor Enviar
		panelMenuPrincipal.add(botaoEnviar); // Adiciona o botão no painel

		frameMenuPrincipal.add(panelMenuPrincipal); // Adicionando o painel no frame
		frameMenuPrincipal.setVisible(true); // Tornando o frame visível

		controladorTelaPrincipal controladorTelaPrincipal = new controladorTelaPrincipal(caixaTextoOpcao, frameMenuPrincipal); // Criando o controlador já com o valor que foi digitado
		botaoEnviar.addActionListener(controladorTelaPrincipal); // Inserindo o controlador no botão
		

	} 
}
