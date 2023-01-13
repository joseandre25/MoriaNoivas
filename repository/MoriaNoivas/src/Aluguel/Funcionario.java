package Aluguel;

public class Funcionario {
		
	private String nome;
	private String cpf;
	private int cadastro;
	private String funcao;
	
	public Funcionario(String nome, String cpf, int cadastro, String funcao) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.cpf = cpf;
		this.cadastro = cadastro;
		this.funcao = funcao;
	}
	
	
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", \ncpf=" + cpf + ", \ncadastro=" + cadastro + ", \nfuncao=" + funcao + "]";
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getCadastro() {
		return cadastro;
	}

	public void setCadastro(int cadastro) {
		this.cadastro = cadastro;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

}
