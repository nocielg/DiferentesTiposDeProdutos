
public class Produto {

	private String nome;
	private int codigo;
	private int preco;
	
	//Contrutor da classe
	public Produto(String nome, int codigo, int preco){
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
	}
	public int preco(){
		return preco;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public int getCodigo(){
		return this.codigo;
	}
	
	
	//sobrescrevendo o método hashCode da classe Object
	//Retornando o valor do hash code para o objeto
	@Override
	public int hashCode(){
		return codigo;
	}
	
	//sobrescrevendo o método equals da classe Object
	@Override
	public boolean equals(Object o){
		if ((o instanceof Produto) && ((Produto) o).getNome().equals(this.getNome())){
				
			return true;
		}
		else{
			return false;
		}
	}

}
