package Aluguel;
import java.util.*;

public class FormaPagamento {
	
	private Date dataPagamento;
	private float entrada;
	private float valorDescontado; // Valor Total - Entrada
	private boolean seEntrada;
	private int forma;
	
	
	
	public FormaPagamento() {
		// TODO Auto-generated constructor stub
	}
	
	public Date getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	public double getEntrada() {
		return entrada;
	}
	public void setEntrada(float entrada) {
		this.entrada = entrada;
	}
	
	public void StatusPagamento() {
		
	}
	public void escolherForma(Pedido p1) {
		System.out.println("Digite 0 para dinheiro: \n" + 
							"Digite 1 para cartão: \n" + 
							"Digite 2 para dinheiro e cartão: ");
		Scanner sc = new Scanner(System.in);
		
		this.forma = sc.nextInt();
		
		System.out.println("Valor da forma de pagamento "+this.forma);
		
		if(this.forma == 2) {
			this.entrada(p1, 150, true);
		}
	}
	
	
	
	public void entrada(Pedido p1, float entrada, boolean seEntrada) {
		//Parametro: Classe e nome do objeto
		//Desconto de entrada no valor total
		
		if(seEntrada) {
		this.entrada = entrada;
		this.valorDescontado = p1.getValorTotal()-this.entrada; //Novo Valor
		System.out.println("Novo Valor descontado: " + this.valorDescontado);
		}
		else {
		System.out.println("\nValor Total: " + p1.getValorTotal());
		
	}}
}
