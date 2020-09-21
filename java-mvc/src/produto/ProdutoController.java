package produto;

public class ProdutoController {
	private Produto model;
	private ProdutoView view;
	
	public ProdutoController(Produto model, ProdutoView view) {
		this.model = model;
		this.view = view;
	}
	
	public int getIdProduto() {
		return model.getIdProduto();
	}
	
	public void setIdProduto(int idProduto) {
		model.setIdProduto(idProduto);
	}
	
	public String getNome() {
		return model.getNomeProduto();
	}
	
	public void setNome(String nome) {
		model.setNomeProduto(nome);
	}
	
	public String getDescricao() {
		return model.getDescricao();
	}
	
	public void setDescricao(String descricao) {
		model.setDescricao(descricao);
	}
	
	public int getEstoque() {
		return model.getEstoque();
	}
	
	public void setEstoque(int estoque) {
		model.setEstoque(estoque);
	}
	
	public double getPreco() {
		return model.getPreco();
	}
	
	public void setPreco(double preco) {
		model.setPreco(preco);
	}
	
	public void updateView() {
		view.imprimir(model.getIdProduto(), model.getNomeProduto(), model.getDescricao(), model.getEstoque(), model.getPreco());
	}
	
}
