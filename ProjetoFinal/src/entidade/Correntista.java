package entidade;

public abstract class Correntista {
	
	private String Nome;
	private String Cpf;
	private String Cep;
	private String Logradouro;
	private String Bairro;
	private String Cidade;
	private String Uf;
	private String Email;
	private int QtdTransacao;
	private Double ValorAnuidade;
	private String Tabela;
	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	public String getCep() {
		return Cep;
	}
	public void setCep(String cep) {
		Cep = cep;
	}
	public String getLogradouro() {
		return Logradouro;
	}
	public void setLogradouro(String logradouro) {
		Logradouro = logradouro;
	}
	public String getBairro() {
		return Bairro;
	}
	public void setBairro(String bairro) {
		Bairro = bairro;
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public String getUf() {
		return Uf;
	}
	public void setUf(String uf) {
		Uf = uf;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getQtdTransacao() {
		return QtdTransacao;
	}
	public void setQtdTransacao(int qtdTransacao) {
		QtdTransacao = qtdTransacao;
	}
	public double getValorAnuidade() {
		return ValorAnuidade;
	}
	public void setValorAnuidade(Double valorAnuidade) {
		ValorAnuidade = valorAnuidade;
	}
	public String getTabela() {
		return Tabela;
	}
	public void setTabela(String tabela) {
		Tabela = tabela;
	}
	
	
	
	

}
