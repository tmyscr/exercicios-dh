package controller;

import java.time.LocalDate;

import model.Cliente;
import view.ClienteView;

public class ClienteController {
	private Cliente model;
	private ClienteView view;
	
	public ClienteController(Cliente model, ClienteView view) {
		this.model = model;
		this.view = view;
	}
	
	public int getClienteIdCliente( ) {
		return model.getIdCliente();
	}
	
	public void setClienteIdCliente(int idCliente) {
		model.setIdCliente(idCliente);
	}
	
	public String getClienteNome() {
		return model.getNome();
	}
	
	public void setClienteNome(String nome) {
		model.setNome(nome);
	}
	
	public String getClienteCpf() {
		return model.getCpf();
	}
	
	public void setClienteCpf(String cpf) {
		model.setCpf(cpf);
	}
	
	public String getClienteRg() {
		return model.getRg();
	}
	
	public void setClienteRg(String rg) {
		model.setRg(rg);
	}
	
	public String getClienteEmail() {
		return model.getEmail();
	}
	
	public void setClienteEmail(String email) {
		model.setEmail(email);
	}
	
	public LocalDate getClienteDataNascimento() {
		return model.getDataNascimento();
	}
	
	public void setClienteDataNascimento(LocalDate dataNascimento) {
		model.setDataNascimento(dataNascimento);
	}
	
	public void updateView() {
		view.imprimir(model.getIdCliente(), model.getNome(), model.getCpf(), model.getRg(), model.getEmail(), model.getDataNascimento());
	}
	
}
