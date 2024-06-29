package entidade;

public class CorrentistaBasico extends Correntista {

	public Double calcularLimiteSaque(double qtdTransacao) {

		return qtdTransacao * 0.5;

	}
	
}
