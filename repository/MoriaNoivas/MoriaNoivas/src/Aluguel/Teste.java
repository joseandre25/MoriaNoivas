package Aluguel;

import java.util.Date;

public class Teste {

	public static void main(String[] args) {
		
		Date date = new Date();
	
		Pedido p = new Pedido(date, date, date, 200.00f);
		
		Cartao c = new Cartao();
		
		c.cadastraCartao("2136 5214 9584 2203", "VISA", date, "Garibaldo");
		
		
		p.relatorioPedido();
		p.setValorTotal(200f);
		p.getValorTotal();
		
		//System.out.println(p1.relatorioPedido());
		
		FormaPagamento pagamento = new FormaPagamento();
		
		pagamento.escolherForma(p);
		
		
		c.dadosCartao();		
		
	}

}
