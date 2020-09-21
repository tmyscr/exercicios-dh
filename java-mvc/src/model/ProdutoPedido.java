package model;

public class ProdutoPedido {
	
	private int fkProduto;
	private String fkPedido;
	private int quantidadeProduto;
	
	public int getFkProduto() {
		return fkProduto;
	}
	
	public void setFkProduto(int fkProduto) {
		this.fkProduto = fkProduto;
	}
	
	public String getFkPedido() {
		return fkPedido;
	}
	
	public void setFkPedido(String fkPedido) {
		this.fkPedido = fkPedido;
	}	
	
	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}
	
	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	
}
