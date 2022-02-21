package sp2fy;

import java.util.ArrayList;



public class Album {

String artista;
String titulo;
int ano;

ArrayList<Musica> musicas = new ArrayList<Musica>();
	
	public Album(String artista, String titulo, int ano) throws Exception{
	
		if (this.artista.equals("") || (this.artista == null)){
		
			throw new Exception ("Artista do album nao pode ser nulo ou vazio.");
		}
		
		else{this.artista = artista;}
		
		if (this.titulo.equals("") || (this.titulo == null)){
			
			throw new Exception ("Titulo do album nao pode ser nulo ou vazio.");
		}
		
		else{this.titulo = titulo;}
		
		if (this.ano < 1900) {
			
			throw new Exception ("Ano de lancamento do album nao pode ser inferior a 1900.");
		}
	
		else{this.ano = ano;}
	}

	
	public String getArtista(){
		return this.artista;
	}


	public Object quantidadeFaixas() {
		
		return null;
	}


	public void adicionaMusica(Musica sentimentoLouco) {
	
		
	}


	public void removeMusica(int i) {
		
		
	}


	public Object getDuracaoTotal() {
		
		return null;
	}
	
}
