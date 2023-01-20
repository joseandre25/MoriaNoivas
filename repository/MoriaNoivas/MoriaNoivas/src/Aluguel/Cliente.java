package Aluguel;

public class Cliente {

	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	private String nome;
	private String endereco;
	private String cidade;
	private String rg;
	private String cpf;
	private String telefone;
	
	public void Cliente(String nome, String endereco, String cidade, String rg, String cpf, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.rg = rg;
		this.cpf = cpf;
		this.telefone = telefone;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", \nendereco=" + endereco + ", \ncidade=" + cidade + ", \nrg=" + rg + ", \ncpf=" + cpf
				+ ", \ntelefone=" + telefone + "]";
	}
}
