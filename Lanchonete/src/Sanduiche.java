import java.util.List;

public class Sanduiche extends Lanche {
	
	private String[] ingredientes = new String[10];
	
	public Sanduiche() {
		super.setPrecoPadrao();
		ingredientes[0] = "Hamburger";
		ingredientes[1] = "Presunto";
		ingredientes[2] = "Calabresa";
		ingredientes[3] = "Bacon";
		ingredientes[4] = "Mussarela";
		ingredientes[5] = "Cheddar";
		ingredientes[6] = "Alface";
		ingredientes[7] = "Tomate";
		ingredientes[8] = "Ovo";
		ingredientes[9] = "Picles";
	}
	
	@Override
	public List<String> prepararLanche(int indice) {
		super.setPreco(1.5);
		return super.getPreparo().escolherItens(indice, this.ingredientes);
	}
	
	@Override
	public double calculaTempo(double distancia) {
		return super.calculaTempo(distancia) + 15;
	}

	@Override
	public String[] getListaItens() {
		return ingredientes;
	}	
	
}
