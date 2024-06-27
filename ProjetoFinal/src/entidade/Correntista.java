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
	private String QtdTransacao;
	private String ValorAnuidade;
	
	
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
	public String getQtdTransacao() {
		return QtdTransacao;
	}
	public void setQtdTransacao(String qtdTransacao) {
		QtdTransacao = qtdTransacao;
	}
	public String getValorAnuidade() {
		return ValorAnuidade;
	}
	public void setValorAnuidade(String valorAnuidade) {
		ValorAnuidade = valorAnuidade;
	}
	
	
	

}
