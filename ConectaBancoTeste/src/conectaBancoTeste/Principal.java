package conectaBancoTeste;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		
		DaoPessoa daoPessoa = new DaoPessoa();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Stefany B.");
		pessoa.setCpf("46928288892");
		pessoa.setEmail("stefanybeacides@hotmail.com");
		
		
		boolean resultado = daoPessoa.salvarPessoaNoBanco(pessoa);
		
		if(resultado){
 			JOptionPane.showMessageDialog(null, "Deu certo!");
		
		}else {
			JOptionPane.showMessageDialog(null, "Deu errado!");
		
	}

}
	
}
