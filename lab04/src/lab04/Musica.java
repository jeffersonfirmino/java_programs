package lab04;

public class Musica {

	private String titulo;
	private double duracao;
	private String genero;


	public Musica(String titulo, double duracao, String genero){

		this.titulo = titulo;
		this.duracao = duracao;
		this.genero = genero;

	}

	public void setTitulo(String titulo){

		this.titulo = titulo;

	}

	public String getTitulo(){

		return this.titulo;
	}


	public void setDuracao(double duracao){

		this.duracao = duracao;
	}

	public double getDuracao(){

		return this.duracao;
	}


	public void setGenero(String genero){

		this.genero = genero;
	}


	public String getGenero(){

		return this.genero;
	}
}