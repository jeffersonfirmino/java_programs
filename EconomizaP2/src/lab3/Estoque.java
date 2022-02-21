package lab3;

import java.util.Scanner;

public class Estoque {

	
	Scanner scanner = new Scanner(System.in);
	public int cadastro = 0;
	Produtos[] produtos = new Produtos[5];


	public void dobra_array(Produtos[] produtos){



		Produtos[] temp = new Produtos[produtos.length*2];

		System.arraycopy(produtos, 0, produtos.length, 0, produtos.length);

		produtos = temp;



	}

	public void buscaNome(String nome){


		for (int i = 0; i < produtos.length;i++){

			if(produtos[i] == null){
				
				System.out.println("==> " + nome + "nao cadastrado no sistema");
				break;

				
			}
			if(produtos[i].getNome().equals(nome)){


				System.out.println("==> " + produtos[i].getNome() + " (" + produtos[i].getTipo() + ")");
				System.out.print("Digite a quantidade que deseja vender: ");
				int qtd = scanner.nextInt();
				scanner.nextLine();
				
				if(produtos[i].getQtd() >= qtd){
				
					produtos[i].setQtd(qtd);
				
					System.out.print("==> Total arrecadado: " + (produtos[i].getValor() * qtd)); 

					break;
					
				}
				
				else{
					
					System.out.println("Não é possível vender pois não há " + produtos[i].getNome() + "suficiente.");
					break;
				}

				

			}

}

	}

}


	