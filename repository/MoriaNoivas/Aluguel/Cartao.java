package Aluguel;
import java.util.*;

public class Cartao extends FormaPagamento{	
	//Heranca de FormaPagamento	
	
	private int numParcela;
	private float valorParcela;
	private char bandeiraCartao;
	private String numCartao;
	private Date vencimento;
	private String nomeCartao;

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

	public char getBandeiraCartao() {
		return bandeiraCartao;
	}

	public void setBandeiraCartao(char bandeiraCartao) {
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
	public void cadastraCartao(String numCartao, char bandeira, Date vencimento, String nomeCartao) {
		// Recebe os atributos da classe
		this.numCartao = numCartao;
		this.bandeiraCartao = bandeira;
		this.vencimento = vencimento;
		this.nomeCartao = nomeCartao;		
	}
}
