
public class ProdutoComTamanho extends Produto{

	private String tamanho;
	
	public ProdutoComTamanho(String nome, int codigo, int preco, String tamanho) {
		super(nome, codigo, preco);
		this.tamanho = tamanho;
		// TODO Auto-generated constructor stub
	}
	
	public String getTamanho(){
		return tamanho;
	}

	//sobrescrevendo o método equals da classe Produto
	@Override
	public boolean equals(Object o){
		if ( ((o instanceof ProdutoComTamanho) && ((ProdutoComTamanho) o).getNome().equals(this.getNome())  ) && ((ProdutoComTamanho)o).getTamanho().equals(this.getTamanho())  )  {  
			return true;
		}
		else{
			return false;
		}
	}

	
	

}
