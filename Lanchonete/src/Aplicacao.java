import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {
	public static void main(String[] args) {

		int opcao = 0;
		int opcaoSubMenu = -1;
		boolean retorno = false;
		double distancia = 0;

		mensagemInicio();

		while (opcao == 0) {

			menuInicial();
			opcao = lerDados();
			System.out.print(System.lineSeparator());
			if (opcao == 0) {
				break;
			}

			if (opcao == 1) {
				Sanduiche sanduiche = new Sanduiche();
				retorno = menuSanduiches(sanduiche, opcaoSubMenu);
				if (retorno) {
					mostrarItensAdicionados(sanduiche);
					calcularDistancia(distancia, sanduiche);
					mostrarPreco(sanduiche);
					retorno = confirmarPedido(sanduiche);
				}
			} else if (opcao == 2) {
				Massa massa = new Massa();
				opcoesSubMenu(massa);
				retorno = menuMassas(massa);
				if (retorno) {
					calcularDistancia(distancia, massa);
					mostrarPreco(massa);
					retorno = confirmarPedido(massa);
				}
			} else if (opcao == 3) {
				Bolo bolo = new Bolo();
				retorno = menuBolos(bolo, opcaoSubMenu);
				if (retorno) {
					mostrarItensAdicionados(bolo);
					calcularDistancia(distancia, bolo);
					mostrarPreco(bolo);
					retorno = confirmarPedido(bolo);
				}

			}

			if (retorno) {
				System.out.println("PEDIDO REALIZADO COM SUCESSO!");
			} else {
				opcao = 0;
			}
		}
	}

	static void mensagemInicio() {
		System.out.println("Bem Vindo(a)!");
		System.out.println("Escolha uma opção no menu abaixo:" + System.lineSeparator());
	}
	
	static int lerDados() {
		Scanner entradaTeclado = new Scanner(System.in);
		entradaTeclado.useLocale(Locale.ENGLISH);
		return entradaTeclado.nextInt();

	}

	static void menuInicial() {
		System.out.println("|-----CARDÁPIO----|");
		System.out.print(System.lineSeparator());
		System.out.println("[1] Sanduíches");
		System.out.println("[2] Massas");
		System.out.println("[3] Bolos");
		System.out.println("[0] Sair");
		System.out.print(System.lineSeparator());
		System.out.print("Digite o número da opção desejada: ");
	}

	static void opcoesSubMenu(Lanche lanche) {

		String[] itensSubMenu;

		itensSubMenu = lanche.getListaItens();

		for (int i = 0; i < itensSubMenu.length; i++) {
			System.out.println("[" + (i + 1) + "] " + " " + itensSubMenu[i]);
		}

		System.out.println("[0] Voltar para o menu principal" + System.lineSeparator());

	}

	static boolean menuSanduiches(Lanche lanche, int opcaoSubMenu) {

		int contador = 0;
		int tamanhoVetor = lanche.getListaItens().length;

		System.out.println("||-----SANDUÍCHES-----||");
		System.out.println("Escolha de 1 a 10 ingredientes: " + System.lineSeparator());
				
		opcoesSubMenu(lanche);

		while (opcaoSubMenu != 0 && contador < tamanhoVetor) {
			
			System.out.print("Digite o número da opção desejada: ");
			opcaoSubMenu = lerDados();
			System.out.print(System.lineSeparator());

			if (opcaoSubMenu == 0) {
				if(contador == 0) {
					return false;					
				} else {
					return true;
				}
			} 

			if(contador < tamanhoVetor) {
				adicionandoItens(lanche, opcaoSubMenu);
				System.out.println(System.lineSeparator() + "Digite 0 para finalizar o pedido ou");
			}
			contador++;
		}
		
		return true;

	}
	

	static boolean menuMassas(Lanche lanche) {
		
		boolean compraFinalizada = false;
		
		System.out.print("Digite o número da opção desejada: ");
		int opcaoSubMenu = lerDados();
		System.out.print(System.lineSeparator());
		
		if(opcaoSubMenu == 0) return compraFinalizada;
		
		if(opcaoSubMenu == 1) {
			Macarrao macarrao = new Macarrao();
			compraFinalizada = subMenuMassas(macarrao, opcaoSubMenu);
		} else if (opcaoSubMenu == 2) {
			Pizza pizza = new Pizza();
			compraFinalizada = subMenuMassas(pizza, opcaoSubMenu);
		} else {
			Lasanha lasanha = new Lasanha();
			compraFinalizada = subMenuMassas(lasanha, opcaoSubMenu);
		}
		
		return compraFinalizada;
		
	}
	
	static boolean subMenuMassas(Massa massa, int opcaoSubMenu) {
		
		opcoesSubMenu(massa);
		System.out.print("Digite o número da opção desejada: ");
		opcaoSubMenu = lerDados();
		System.out.print(System.lineSeparator());
		
		if(opcaoSubMenu == 0) return false;
		
		adicionandoItens(massa, opcaoSubMenu);
		System.out.print(System.lineSeparator());
		
		if(massa instanceof Pizza) {
			massa.setMolho("molho de tomate");
		} else {
			System.out.print("Digite o molho de sua preferência: ");
			Scanner tecladoTexto = new Scanner(System.in);
			String molho = tecladoTexto.next();
			massa.setMolho(molho);
			System.out.print(System.lineSeparator());
			System.out.println("Molho adicionado: " + molho);
			System.out.print(System.lineSeparator());
		}
		
		return true;
		
	}
		
	static boolean menuBolos(Lanche lanche, int opcaoSubMenu) {

		String[] parteBolo = { "MASSA", "RECHEIO", "COBERTURA" };

		System.out.println("||-----BOLOS-----||");
		for (int i = 0; i < 3; i++) {
			System.out.println("Escolha o sabor do(a) " + parteBolo[i] + " do bolo: " + System.lineSeparator());
			if (i == 0) {
				Bolo b = (Bolo) lanche;
				String[] subMenuMassaBolo = b.getListaItens();
				System.out.println("[" + (i + 1) + "]" + subMenuMassaBolo[0]);
				System.out.println("[" + (i + 2) + "]" + subMenuMassaBolo[1]);
				System.out.println("[0] Voltar para o menu principal" + System.lineSeparator());
			} else {
				opcoesSubMenu(lanche);
			}
			
			System.out.print("Digite o número da opção desejada: ");
			opcaoSubMenu = lerDados();
			
			if(opcaoSubMenu != 0) {
				System.out.print(System.lineSeparator());
				adicionandoItens(lanche, opcaoSubMenu);
				System.out.print(System.lineSeparator());
			} else {
				return false;
			}
			
		}

		return true;
	}
	
	static void adicionandoItens(Lanche lanche, int opcaoSubMenu) {
		List<String> ingredientesAdicionados = lanche.prepararLanche(opcaoSubMenu);
		System.out.println("MONTANDO O PEDIDO...");
		System.out.print("Você adicionou: ");
		System.out.println(ingredientesAdicionados);
	}
	
	static void mostrarItensAdicionados(Lanche lanche) {

		if (lanche instanceof Bolo) {
			String[] parteBolo = { "Massa", "Recheio", "Cobertura" };
			String[] itensEscolhidos = lanche.getPreparo().getItensEscolhidos().toArray(new String[0]);
			System.out.println("DADOS DO PEDIDO: ");
			for (int i = 0; i < parteBolo.length; i++) {
				System.out.println(parteBolo[i] + " : " + itensEscolhidos[i]);
			}
			System.out.print(System.lineSeparator());
		} else {
			System.out.println("O seu pedido é: " + lanche.getPreparo().getItensEscolhidos()
					+ System.lineSeparator());
		}
	}

	static void calcularDistancia(double distancia, Lanche lanche) {

		System.out.print("Informe a distância em km: ");
		distancia = lerDados();
		System.out.print(System.lineSeparator());

		System.out.println("|-----TEMPO DE ENTREGA E VALOR-----|");
		System.out.printf("O tempo estimado de entrega é de %.0f minutos.", lanche.calculaTempo(distancia));
		System.out.print(System.lineSeparator());

	}

	static void mostrarPreco(Lanche lanche) {
		System.out.printf("Preço total: R$ %.2f", lanche.getPreco());
	}

	static boolean confirmarPedido(Lanche lanche) {

		System.out.print(System.lineSeparator());
		System.out.println("Deseja confirmar seu pedido?");
		System.out.println("[1] Sim");
		System.out.println("[2] Não");
		System.out.print("Digite o número da opção desejada: ");
		int confirma = lerDados();
		System.out.print(System.lineSeparator());

		if (confirma == 1) {
			return true;
		}

		return false;
	}
	
}
