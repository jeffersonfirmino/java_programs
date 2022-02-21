package lab03;

public class Produtos {

	private String nome;
	private String tipo;
	private double valor;


	public Produtos(String nome, String tipo, double valor) {
		
		this.nome = nome;
		this.tipo = tipo;
		this.valor = valor;
		
		
	}

	
	public String getNome(){
		
		return nome;
	}
	

	public String getTipo(){
		
		return tipo;
	}
	
	

	public Double getValor(){
		
		return valor;
	}


	


	
	
}
