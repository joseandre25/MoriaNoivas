package Aluguel;
import java.util.Date;

public class Cartao extends FormaPagamento{	
	//Heranca de FormaPagamento	
	
	private int numParcela;
	private float valorParcela;
	private String bandeiraCartao;
	private String numCartao;
	private Date vencimento;
	private String nomeCartao;
	private boolean cadastrado = false;
	public Cartao() {
		// TODO Auto-generated constructor stub
	}

	public int getNumParcela() {
		return numParcela;
	}

	public void setNumParcela(int numParcela) {
		this.numParcela = numParcela;
	}

	public float getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(float valorParcela) {
		this.valorParcela = valorParcela;
	}

	public String getBandeiraCartao() {
		return bandeiraCartao;
	}

	public void setBandeiraCartao(String bandeiraCartao) {
		this.bandeiraCartao = bandeiraCartao;
	}

	public String getNumCartao() {
		return numCartao;
	}

	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	public String getNomeCartao() {
		return nomeCartao;
	}

	public void setNomeCartao(String nomeCartao) {
		this.nomeCartao = nomeCartao;
	}
	
	public void calculaParcela(int numParcela) {
		//pegar o valor da classe pedido
		
		this.numParcela = numParcela; //O metodo recebe o numero de parcela do atributo
		
		
	}
	public void cadastraCartao(String numCartao, String bandeira, Date vencimento, String nomeCartao) {
		// Recebe os atributos da classe
		this.numCartao = numCartao;
		this.bandeiraCartao = bandeira;
		this.vencimento = vencimento;
		this.nomeCartao = nomeCartao;		
		this.cadastrado = true;
	}
	Date date = new Date();
	public void seCartao(Pedido p1) { //Adicionar Scanner
		if (this.cadastrado == false) {
			this.cadastraCartao("2136 5214 9584 2203", "VISA", date, "Garibaldo");
			//Metodo p/ calcular valor da parcela
			System.out.println("Dados do cartão: " + this.dadosCartao());
		}
		else {
			//Metodo p/ calcular valor da parcela
		}
	}

	
	public String dadosCartao() {
		return "Cartao [ bandeiraCartao="+ bandeiraCartao 
				+ ", \nnumCartao=" + numCartao 
				+ ", \nvencimento=" + vencimento 
				+ ", \nnomeCartao=" + nomeCartao + "]";
	}
	
}
