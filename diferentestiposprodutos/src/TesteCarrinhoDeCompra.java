import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TesteCarrinhoDeCompra {

	CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
	
	@Before
	public void testaAdicionandoProdutos() {
		carrinho.adicionaProduto("calça jeans", 1, 4, "2");
		carrinho.adicionaProduto("calça jeans", 2, 4, "2");
		carrinho.adicionaProduto("calça jeans", 3, 4, "4");
		carrinho.adicionaProduto("tênis", 4, 4, "9");
		carrinho.adicionaProduto("copo", 5, 4, "1");
		
		
	}
	
	@Test
	public void testaValorTotalDaCompra(){
		
		carrinho.valorTotalCompra();
		assertEquals(4,carrinho.valorTotalCompra());
	}
	
	@Test
	public void testRemoveProduto(){
		carrinho.removeProduto(1);
	}

}
