package cadastroAnimais;

import javax.swing.JOptionPane;

import interacaoUsuario.Menu;

public class Principal {

	public static void main(String[] args) {

		try {
			Menu menu = new Menu();

			menu.menuInicial();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro: " + e);
		}

	}

}
