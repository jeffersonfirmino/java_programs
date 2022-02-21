package sp2fy;

public class Musica {

	private String titulo;
	private double duracao;
	private String genero;

	
	
public Musica(String titulo, double duracao, String genero) throws Exception{

		if (this.titulo.equals("") || this.titulo == null){
			
			throw new Exception("Titulo não pode ser vazio");
		
		}
		else{this.titulo = titulo;}
		
		
		if (duracao <= 0){
			
			throw new Exception("A duração da música deve ser maior que zero");
		}
		
		
		else{this.duracao = duracao;}
		
		
		if (this.genero.equals("") || this.genero == null){
		
			throw new Exception("Genero não pode ser vazio");
		}
	
		else{
			
			this.genero = genero;
		}
			

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

