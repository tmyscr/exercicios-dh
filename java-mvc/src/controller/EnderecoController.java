package controller;

import model.Endereco;
import view.EnderecoView;

public class EnderecoController {
	private Endereco model;
	private EnderecoView view;
	
	public EnderecoController(Endereco model, EnderecoView view) {
		this.model = model;
		this.view = view;
	}
	
	public int getEnderecoNumero() {
		return model.getNumero();
	}
	
	public void setEnderecoNumero(int numero) {
		model.setNumero(numero);
	}
	
	public String getEnderecoRua() {
		return model.getRua();
	}
	
	public void setEnderecoRua(String rua) {
		model.setRua(rua);
	}
	
	
	public String getEnderecoBairro() {
		return model.getBairro();
	}
	
	public void setEnderecoBairro(String bairro) {
		model.setBairro(bairro);
	}
	
	public String getEnderecoComplemento() {
		return model.getComplemento();
	}
	
	public void setEnderecoComplemento(String complemento) {
		model.setComplemento(complemento);
	}
	
	public String getEnderecoCidade() {
		return model.getCidade();
	}
	
	public void setEnderecoCidade(String cidade) {
		model.setCidade(cidade);
	}
	
	public String getEnderecoUf() {
		return model.getUf();
	}
	
	public void setEnderecoUf(String uf) {
		model.setUf(uf);
	}

	public String getEnderecoCep() {
		return model.getCep();
	}
	
	public void setEnderecoCep(String cep) {
		model.setCep(cep);
	}
	
	public int getEnderecoFkCliente() {
		return model.getFkCliente();
	}
	
	public void setEnderecoFkCliente(int fkCliente) {
		model.setFkCliente(fkCliente);
	}
	
	public void updateView() {
		view.imprimir(model.getNumero(), model.getRua(), model.getBairro(), model.getComplemento(), model.getCidade(), model.getUf(), model.getCep(), model.getFkCliente());
	}
}
