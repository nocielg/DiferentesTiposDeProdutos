import java.util.HashMap;
import java.util.Map;


public class CarrinhoDeCompra {
	
	private int quantidadeProduto = 0;
	private int valorTotalDaCompra = 0;
	public int codigo;
	
	//Criando uma tabela Hash para armazenar os produtos no carrinho· e a quantidade do mesmo
	private Map<ProdutoComTamanho, Integer> produtos = new HashMap<>();
	ProdutoComTamanho produtoInserido; 
	
	//Método para adicionar o produto no carrinho
	public void adicionaProduto(String nome, int codigo, int preco, String tamanho){
		produtoInserido = new ProdutoComTamanho(nome, codigo, preco, tamanho);
		for (ProdutoComTamanho percorreHashMap: produtos.keySet() ){
			if ((percorreHashMap.getCodigo() != produtoInserido.getCodigo()) || (percorreHashMap.getCodigo() == produtoInserido.getCodigo() && (percorreHashMap.getTamanho() != produtoInserido.getTamanho()))){
				produtos.put(produtoInserido, 1);
			}	
			else{
				produtos.put(produtoInserido, quantidadeProduto++);
			}
		}
	}

	//Método para remover produto do carrinho 
	public void removeProduto(int codigo){
		for (ProdutoComTamanho percorreHashMap : produtos.keySet()){
			if (percorreHashMap.getCodigo() == codigo){
				produtos.remove(produtoInserido);
			}
		}
	}
	
	//Método para calcular o valor total da compra. 
	public int valorTotalCompra(){
		for (ProdutoComTamanho percorreHashMap : produtos.keySet()){
			valorTotalDaCompra = valorTotalDaCompra + produtos.get(produtoInserido.preco());
			
			
		}
			return valorTotalDaCompra;
	}
}
