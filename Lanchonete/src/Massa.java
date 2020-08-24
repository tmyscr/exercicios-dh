import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Massa extends Lanche {
	
	private String molho;
	private static String[] tipoDeMassa = new String[3];
	
	public Massa() {
		super.setPrecoPadrao();
		tipoDeMassa[0] = "Macarrão";
		tipoDeMassa[1] = "Pizza";
		tipoDeMassa[2] = "Lasanha";
	}
	
	@Override
	public List<String> prepararLanche(int indice) {
		super.setPreco(10);		
		return super.getPreparo().escolherItens(indice, tipoDeMassa);
	}
	
	@Override
	public double calculaTempo(double distancia) {
		return super.calculaTempo(distancia) + 30;
	}

	@Override
	public String[] getListaItens() {
		return tipoDeMassa;	
	}
	
	public void setMolho(String molho) {
		this.molho = molho;
	}
}
