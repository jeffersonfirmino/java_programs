package lab3;

public class Produtos {

	private String nome;
	private String tipo;
	private double valor;
	private int qtd;

	public Produtos(String nome, String tipo, double valor, int qtd) {
		
		this.nome = nome;
		this.tipo = tipo;
		this.valor = valor;
		this.qtd = qtd;
		
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

	
	public int getQtd(){
		
		return qtd;
		
	}

	public void setQtd(int quantia){
		this.qtd -= quantia;
		
		
	}


	
	
}