import java.util.List;

public class Lasanha extends Massa{
	private String[] saboresLasanha = new String[3];
	
	public Lasanha() {
		saboresLasanha[0] = "Bolonhesa";
		saboresLasanha[1] = "Presunto e queijo";
		saboresLasanha[2] = "Quatro queijos";
	}
	
	@Override
	public List<String> prepararLanche(int indice) {
		super.setPreco(10);		
		return super.getPreparo().escolherItens(indice, saboresLasanha);
	}

	@Override
	public String[] getListaItens() {
		return saboresLasanha;
	}
}
