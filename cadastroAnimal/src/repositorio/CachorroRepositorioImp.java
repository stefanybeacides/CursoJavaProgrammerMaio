package repositorio;

import java.util.List;

import entidade.Cachorro;

public class CachorroRepositorioImp implements CachorroRepisitorio{

	@Override //Aponta que esse método é uma SobEscrita de um método da interface
	public boolean salvarCachorro(Cachorro cachorro) {
	
		return false;
	}

	@Override
	public List<Cachorro> listarCachorroRepositorio() {
		
		return null;
	}
	
	

}
