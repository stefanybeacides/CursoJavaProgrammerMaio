package entidade;

public class CorrentistaPremium extends Correntista {
	
	public Double calcularLimiteCredito(double qtdTransacao) {
		
		return qtdTransacao * 0.7;

	}

}
