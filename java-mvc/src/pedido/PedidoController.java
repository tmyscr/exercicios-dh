package pedido;

import java.time.LocalDate;

public class PedidoController {
	private Pedido model;
	private PedidoView view;
	
	public PedidoController(Pedido model, PedidoView view) {
		this.model = model;
		this.view = view;
	}
	
	public String getPedidoNfe() {
		return model.getNfe();
	}
	
	public void setPedidoNfe(String nfe) {
		model.setNfe(nfe);
	}
	
	public LocalDate getPedidoDataEmissao() {
		return model.getDataEmissao();
	}
	
	public void setPedidoDataEmissao(LocalDate dataEmissao) {
		model.setDataEmissao(dataEmissao);
	}
	
	public double getValorTotal() {
		return model.getValorTotal();
	}
	
	public void setValorTotal(double valorTotal) {
		model.setValorTotal(valorTotal);
	}
	
	public String getPedidoStatusPedido() {
		return model.getStatusPedido();
	}
	
	public void setPedidoStatusPedido(String statusPedido) {
		model.setStatusPedido(statusPedido);
	}
	
	public int getPedidoFkCliente() {
		return model.getFkCliente();
	}
	
	public void setPedidoFkCliente(int fkCliente) {
		model.setFkCliente(fkCliente);
	}
	
	public void updateView() {
		view.imprimir(model.getNfe(), model.getDataEmissao(), model.getValorTotal(), model.getStatusPedido(), model.getFkCliente());
	}
	
}
