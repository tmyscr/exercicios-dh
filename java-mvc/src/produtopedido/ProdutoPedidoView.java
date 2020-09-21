package produtopedido;

public class ProdutoPedidoView {
	
	public void imprimir(int fkProduto, String fkPedido, int quantidadeProduto) {
		System.out.println("PRODUTO-PEDIDO");
		System.out.println("Código Produto: " + fkProduto);
		System.out.println("Código Pedido: " + fkPedido);
		System.out.println("Quantidade do Produto: " + quantidadeProduto);
		System.out.print(System.lineSeparator());
	}
	
}
