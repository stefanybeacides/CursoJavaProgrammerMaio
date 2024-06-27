package repositorio;

import java.util.List;

import entidade.Cachorro;

public interface CachorroRepisitorio {

	public boolean salvarCachorro(Cachorro cachorro);
	
	public List<Cachorro> listarCachorroRepositorio();
	
}
