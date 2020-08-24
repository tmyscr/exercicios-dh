import java.util.List;

public class Macarrao extends Massa{
	private String[] tipoDeMacarrao = new String[5];
	
	public Macarrao() {
		tipoDeMacarrao[0] = "Espaguete";
		tipoDeMacarrao[1] = "Parafuso";
		tipoDeMacarrao[2] = "Penne";
		tipoDeMacarrao[3] = "Talharim";
		tipoDeMacarrao[4] = "Capeletti";
	}
	
	@Override
	public List<String> prepararLanche(int indice) {
		super.setPreco(10);		
		return super.getPreparo().escolherItens(indice, tipoDeMacarrao);
	}

	@Override
	public String[] getListaItens() {
		return tipoDeMacarrao;
	}
	
}

