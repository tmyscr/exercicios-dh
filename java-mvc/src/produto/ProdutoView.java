package produto;

public class ProdutoView {
	
	public void imprimir(int idProduto, String nomeProduto, String descricao, int estoque, double preco) {
		System.out.println("PRODUTO");
		System.out.println("Código do produto: " + idProduto);
		System.out.println("Nome do produto: " + nomeProduto);
		System.out.println("Descrição: " + descricao);
		System.out.println("Quantidade em estoque: " + estoque);
		System.out.println("Preço: " + preco);
		System.out.print(System.lineSeparator());
	}
	 
}
