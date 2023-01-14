package Aluguel;
import java.util.*;

public class Teste {

	public static void main(String[] args) {
				
		Date data = new Date();
		
		Pedido p = new Pedido(data, data, data, 200.00f);
		
		//System.out.println(p1.relatorioPedido());
		
		FormaPagamento pagamento = new FormaPagamento();
		
		pagamento.escolherForma(p);
		
		
		
		
		
	}

}
