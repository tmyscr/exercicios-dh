package produtopedido;

public class ProdutoPedidoController {
	
	private ProdutoPedido model;
	private ProdutoPedidoView view;
	
	public ProdutoPedidoController(ProdutoPedido model, ProdutoPedidoView view) {
		this.model = model;
		this.view = view;
	}
	
	public int getProdutoPedidoFkProduto() {
		return model.getFkProduto();
	}
	
	public void setProdutoPedidoFkProduto(int fkProduto) {
		model.setFkProduto(fkProduto);;
	}
	
	public String getProdutoPedidoFkPedido() {
		return model.getFkPedido();
	}
	
	public void setProdutoPedidoFkPedido(String fkPedido) {
		model.setFkPedido(fkPedido);
	}
	
	public int getProdutoPedidoQuantidadeProduto() {
		return model.getQuantidadeProduto();
	}
	
	public void setProdutoPedidoQuantidadeProduto(int quantidadeProduto) {
		model.setQuantidadeProduto(quantidadeProduto);
	}
	
	public void updateView() {
		view.imprimir(model.getFkProduto(), model.getFkPedido(), model.getQuantidadeProduto());
	}
	
	
}
