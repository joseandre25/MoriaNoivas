package Aluguel;
import java.util.*;

public class Faturamento {
	
	private float ganhos;
	private ArrayList qtdpedidos;
	private int somaQtdPedidos;
	private ArrayList valorPedidos;
		
	public float getGanhos() {
		return ganhos;
	}
	public void setGanhos(float ganhos) {
		this.ganhos = ganhos;
	}
	public ArrayList getQtdpedidos() {
		return qtdpedidos;
	}
	public void setQtdpedidos(ArrayList qtdpedidos) {
		this.qtdpedidos = qtdpedidos;
	}
	public int getSomaQtdPedidos() {
		return somaQtdPedidos;
	}
	public void setSomaQtdPedidos(int somaQtdPedidos) {
		this.somaQtdPedidos = somaQtdPedidos;
	}
	public ArrayList getValorPedidos() {
		return valorPedidos;
	}
	public void setValorPedidos(ArrayList valorPedidos) {
		this.valorPedidos = valorPedidos;
	}
	
	public void resumoGanhos(Date periodoInicial, Date periodoFinal) {
		
	}
	public void somaQtdPedidos() {
		
	}
	public void addQtdPedidos(Pedido numPedido) {
		//numPedido vem da classe Pedido
		//Adiciona o pedido ao arraylist
	}
	public void addValorPedidos(Pedido valorPedido) {
		
	}
}
