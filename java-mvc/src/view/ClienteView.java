package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ClienteView {
	
	public void imprimir(int idCliente, String nome, String cpf, String rg, String email, LocalDate dataNascimento) {
		System.out.println("CLIENTE");
		System.out.println("Código Cliente: " + idCliente);
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);		
		System.out.println("RG: " + rg);
		System.out.println("E-mail: " + email);
		System.out.println("Data de Nascimento: " + dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.print(System.lineSeparator());
	}
	
}
