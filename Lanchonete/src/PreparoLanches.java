import java.util.ArrayList;
import java.util.List;

public class PreparoLanches {
	
	private List<String> itensEscolhidos = new ArrayList<>();

	public List<String> escolherItens(int opcao, String [] ingredientes) {
		itensEscolhidos.add(ingredientes[opcao-1]);
		return itensEscolhidos;
	}
	
	public List<String> getItensEscolhidos() {
		return itensEscolhidos;
	}
	
}
