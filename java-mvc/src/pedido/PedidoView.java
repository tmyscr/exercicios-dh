package pedido;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PedidoView {
	
	public void imprimir(String nfe, LocalDate dataEmissao, double valorTotal, String statusPedido, int fkCliente) {
		System.out.println("PEDIDO");
		System.out.println("Nota Fiscal: " + nfe);
		System.out.println("Data do Pedido: " + dataEmissao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("Valor Total: " + valorTotal);
		System.out.println("Status do Pedido: " + statusPedido);
		System.out.println("Código Cliente: " + fkCliente);
		System.out.print(System.lineSeparator());
	}
	 
}
