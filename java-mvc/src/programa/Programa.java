package programa;

import java.time.LocalDate;

import cliente.Cliente;
import cliente.ClienteController;
import cliente.ClienteView;
import endereco.Endereco;
import endereco.EnderecoController;
import endereco.EnderecoView;
import pedido.Pedido;
import pedido.PedidoController;
import pedido.PedidoView;
import produto.Produto;
import produto.ProdutoController;
import produto.ProdutoView;
import produtopedido.ProdutoPedido;
import produtopedido.ProdutoPedidoController;
import produtopedido.ProdutoPedidoView;
import telefone.Telefone;
import telefone.TelefoneController;
import telefone.TelefoneView;

public class Programa {
	
	public static void main(String[] args) {
		
		Cliente modelCliente = BDCliente();
		ClienteView viewCliente = new ClienteView();
		ClienteController controllerCliente = new ClienteController(modelCliente, viewCliente);		
		controllerCliente.updateView();
		
		
		Endereco modelEndereco = BDEndereco();
		EnderecoView viewEndereco = new EnderecoView();
		EnderecoController controllerEndereco = new EnderecoController(modelEndereco, viewEndereco);		
		controllerEndereco.updateView();
		
		
		Pedido modelPedido = BDPedido();
		PedidoView viewPedido= new PedidoView();
		PedidoController controllerPedido= new PedidoController(modelPedido, viewPedido);		
		controllerPedido.updateView();
		
		
		Produto modelProduto= BDProduto();
		ProdutoView viewProduto= new ProdutoView();
		ProdutoController controllerProduto= new ProdutoController(modelProduto, viewProduto);		
		controllerProduto.updateView();
		
		
		ProdutoPedido modelProdutoPedido= BDProdutoPedido();
		ProdutoPedidoView viewProdutoPedido= new ProdutoPedidoView();
		ProdutoPedidoController controllerProdutoPedido= new ProdutoPedidoController(modelProdutoPedido, viewProdutoPedido);		
		controllerProdutoPedido.updateView();
		
		
		Telefone modelTelefone = BDTelefone();
		TelefoneView viewTelefone = new TelefoneView();
		TelefoneController controllerTelefone = new TelefoneController(modelTelefone, viewTelefone);		
		controllerTelefone.updateView();
		
	}

	public static Cliente BDCliente() {
		Cliente cliente = new Cliente();
		
		cliente.setIdCliente(1234567);
		cliente.setNome("José da Silva");
		cliente.setCpf("123.456.789-12");
		cliente.setRg("12.345.678-9");
		cliente.setEmail("josedasilva@email.com");
		cliente.setDataNascimento(LocalDate.of(1995, 01, 01));
		
		return cliente;
	}
	
	public static Endereco BDEndereco() {
		
		Endereco endereco = new Endereco();
		
		endereco.setNumero(95);
		endereco.setRua("Rua A");
		endereco.setBairro("Jardim B");
		endereco.setComplemento("AP 95");
		endereco.setCidade("São Paulo");
		endereco.setUf("São Paulo");
		endereco.setCep("12345-678");
		endereco.setFkCliente(1234567);
		
		return endereco;
	}

	public static Pedido BDPedido() {
		
		Pedido pedido = new Pedido();
		
		pedido.setNfe("987654");
		pedido.setDataEmissao(LocalDate.of(2020, 03, 15));
		pedido.setValorTotal(2000.0);
		pedido.setStatusPedido("concluído");
		pedido.setFkCliente(1234567);
		
		return pedido;
	}
	
	public static Produto BDProduto() {
		
		Produto produto = new Produto();
		
		produto.setIdProduto(5678);
		produto.setNomeProduto("Televisão");
		produto.setDescricao("TV LED 32''");
		produto.setEstoque(15);
		produto.setPreco(1100.0);
		
		return produto;
	}

	public static ProdutoPedido BDProdutoPedido() {
		
		ProdutoPedido produtoPedido = new ProdutoPedido();
		
		produtoPedido.setFkProduto(5678);
		produtoPedido.setFkPedido("123.456");
		produtoPedido.setQuantidadeProduto(1);
		
		return produtoPedido;
	}
	
	public static Telefone BDTelefone() {
		
		Telefone telefone = new Telefone();
		
		telefone.setDdd(11);
		telefone.setNumero("55555-1234");
		telefone.setFkCliente(1234567);
		
		return telefone;
		
	}
	
}