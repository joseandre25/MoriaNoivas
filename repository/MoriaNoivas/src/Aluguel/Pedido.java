package Aluguel;
import java.util.*;

public class Pedido {
	
	private Date dataPedido;
	private Date dataRecebimento;
	private Date dataDevolucao;
	private Float valorTotal;
	private Float valorliquido;
	private Float Aliquota;
	private int numAluguel;
	private int numPedido;
	
	
	
	public Pedido(Date dataPedido, Date dataRecebimento, Date dataDevolucao, Float valorTotal, Float valorliquido,
			Float aliquota, int numAluguel, int numPedido) {
		super();
		this.dataPedido = dataPedido;
		this.dataRecebimento = dataRecebimento;
		this.dataDevolucao = dataDevolucao;
		this.valorTotal = valorTotal;
		this.valorliquido = valorliquido;
		Aliquota = aliquota;
		this.numAluguel = numAluguel;
		this.numPedido = numPedido;
	}

	
	public Date getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
	public Date getDataRecebimento() {
		return dataRecebimento;
	}
	public void setDataRecebimento(Date dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}
	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public Float getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Float valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Float getValorliquido() {
		return valorliquido;
	}
	public void setValorliquido(Float valorliquido) {
		this.valorliquido = valorliquido;
	}
	public Float getAliquota() {
		return Aliquota;
	}
	public void setAliquota(Float aliquota) {
		Aliquota = aliquota;
	}
	public int getNumAluguel() {
		return numAluguel;
	}
	public void setNumAluguel(int numAluguel) {
		this.numAluguel = numAluguel;
	}
	public int getNumPedido() {
		return numPedido;
	}
	public void setNumPedido(int numPedido) {
		this.numPedido = numPedido;
	}
	
	
	public void calculaValorAliquota(float desconto) {
		
	}


	public String relatorioPedido() {
		return "Pedido [dataPedido=" + dataPedido + ", dataRecebimento=" + dataRecebimento + ", dataDevolucao="
				+ dataDevolucao + ", valorTotal=" + valorTotal + ", valorliquido=" + valorliquido + ", Aliquota="
				+ Aliquota + ", numAluguel=" + numAluguel + ", numPedido=" + numPedido + "]";
	}
	
	

}
