package model;

import java.time.LocalDate;

public class Cliente {
	private int idCliente;
	private String nome;
	private String cpf;
	private String rg;
	private String email;
	private LocalDate dataNascimento;
	
	public int getIdCliente() {
		return idCliente;
	}
	
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
