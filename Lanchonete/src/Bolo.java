import java.util.List;

public class Bolo extends Lanche {
	
	private String massa;
	private String recheio;
	private String cobertura;
	private String[] sabores = new String[9];
	
	public Bolo() {
		super.setPrecoPadrao();
		
		sabores[0] = "Chocolate";
		sabores[1] = "Baunilha";
		sabores[2] = "Morango";
		sabores[3] = "Nozes";
		sabores[4] = "Chocolate Branco";
		sabores[5] = "Doce de leite";
		sabores[6] = "Ninho";
		sabores[7] = "Brigadeiro";
		sabores[8] = "Nutella";
		
	}
	
	@Override
	public List<String> prepararLanche(int indice) {
		super.setPreco(5);
		return super.getPreparo().escolherItens(indice, this.sabores);
	}
	
	@Override
	public double calculaTempo(double distancia) {
		return super.calculaTempo(distancia) + 10;
	}

	@Override
	public String[] getListaItens() {
		return sabores;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}

	public String getMassa() {
		return massa;
	}

	public String getRecheio() {
		return recheio;
	}

	public String getCobertura() {
		return cobertura;
	}
	
	
}
