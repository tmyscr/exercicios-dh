import java.util.List;

public class Pizza extends Massa{
	private String[] saboresPizza = new String[5];
	
	public Pizza() {
		saboresPizza[0] = "Mussarela";
		saboresPizza[1] = "Calabresa";
		saboresPizza[2] = "Portuguesa";
		saboresPizza[3] = "Toscana";
		saboresPizza[4] = "Frango com catupiry";
	}
	
	@Override
	public List<String> prepararLanche(int indice) {
		super.setPreco(10);		
		return super.getPreparo().escolherItens(indice, saboresPizza);
	}

	@Override
	public String[] getListaItens() {
		return saboresPizza;
	}
}
