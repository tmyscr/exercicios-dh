package telefone;

public class TelefoneController {
	
	private Telefone model;
	private TelefoneView view;
	
	public TelefoneController(Telefone model, TelefoneView view) {
		this.model = model;
		this.view = view;
	}
	
	public int getTelefoneDdd() {
		return model.getDdd();
	}
	
	public void setTelefoneDdd(int ddd) {
		model.setDdd(ddd);
	}
	
	public String getTelefoneNumero() {
		return model.getNumero();
	}
	
	public void setTelefoneNumero(String numero) {
		model.setNumero(numero);
	}
	
	public int getTelefoneFkCliente() {
		return model.getFkCliente();
	}
	
	public void setTelefoneFkCliente(int fkCliente) {
		model.setFkCliente(fkCliente);
	}
	
	public void updateView() {
		view.imprimir(model.getDdd(), model.getNumero(), model.getFkCliente());
	}

}	
