package produto;

public class ProdutoView {
	
	public void imprimir(int idProduto, String nomeProduto, String descricao, int estoque, double preco) {
		System.out.println("PRODUTO");
		System.out.println("C�digo do produto: " + idProduto);
		System.out.println("Nome do produto: " + nomeProduto);
		System.out.println("Descri��o: " + descricao);
		System.out.println("Quantidade em estoque: " + estoque);
		System.out.println("Pre�o: " + preco);
		System.out.print(System.lineSeparator());
	}
	 
}
