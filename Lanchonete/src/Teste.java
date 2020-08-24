import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Teste {
	public static void main(String[] args) {
		
		Massa m = new Massa();
		
		Map<String, Massa> tipoDeMassa = new HashMap<>();
		
		tipoDeMassa.put("Macarrao", new Macarrao());
		tipoDeMassa.put("Pizza", new Pizza());
		tipoDeMassa.put("Lasanha", new Lasanha());
		
		Set<String> set = tipoDeMassa.keySet();
		
		System.out.println(set);
		
//		String[] s = m.getListaItens();
//		
//		int tamanho = m.getListaItens().length;
//		
//		System.out.println(tamanho);
//		
	}
}
