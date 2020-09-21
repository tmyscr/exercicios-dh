package pedido;

import java.time.LocalDate;

public class Pedido {
	
	private String nfe;
	private LocalDate dataEmissao;
	private double valorTotal;
	private String statusPedido;
	private int fkCliente; 
	
	public String getNfe() {
		return nfe;
	}
	
	public void setNfe(String nfe) {
		this.nfe = nfe;
	}
	
	public LocalDate getDataEmissao() {
		return dataEmissao;
	}
	
	public void setDataEmissao(LocalDate dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	
	public double getValorTotal() {
		return valorTotal;
	}
	
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public String getStatusPedido() {
		return statusPedido;
	}
	
	public void setStatusPedido(String statusPedido) {
		this.statusPedido = statusPedido;
	}
	
	public int getFkCliente() {
		return fkCliente;
	}
	
	public void setFkCliente(int fkCliente) {
		this.fkCliente = fkCliente;
	}
	
}
