package endereco;

public class EnderecoView {
	
	public void imprimir(int numero, String rua, String bairro, String complemento, String cidade, String uf, String cep, int fkCliente) {
		System.out.println("ENDERE�O");
		System.out.println("N�mero: " + numero);
		System.out.println("Rua: " + rua);
		System.out.println("Bairro: " + bairro);
		System.out.println("Complemento: " + complemento);
		System.out.println("Cidade: " + cidade);
		System.out.println("UF: " + uf);
		System.out.println("CEP: " + cep);
		System.out.println("C�digo Cliente: " + fkCliente);
		System.out.print(System.lineSeparator());
	}
	
}
