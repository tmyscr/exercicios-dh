import java.util.List;

public abstract class Lanche {
	
	private double preco;
	private PreparoLanches preparo = new PreparoLanches();

	public abstract List<String> prepararLanche(int opcao);
	
	public abstract String[] getListaItens();
	
	public double calculaTempo(double distancia) {
		return distancia * 10;
	}
	
	public PreparoLanches getPreparo() {
		return preparo;
	}
	
	public void setPrecoPadrao() {
		this.preco = 20.00;
	}
	
	public void setPreco(double preco) {
		this.preco += preco;
	}
	
	public double getPreco() {
		return preco;
	}
	
}
