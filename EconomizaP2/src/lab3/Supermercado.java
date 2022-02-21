package lab3;

import java.util.Scanner;

public class Supermercado {

	Estoque estoque = new Estoque();
	Scanner scanner = new Scanner(System.in);


	public void cadastro(){

		String cadastro_novo = "sim";


		do{

			System.out.print("Digite o nome do produto: ");         
			String nome = scanner.nextLine();

			System.out.println("Digite o preço unitário do produto: "); 
			double valor = scanner.nextDouble();
			scanner.nextLine();

			System.out.println("Digite o tipo do produto: "); 
			String tipo = scanner.nextLine();

			System.out.println(nome + " cadastrado com sucesso."); 

			System.out.println("Digite a quantidade no estoque: ");
			int quantidade = scanner.nextInt();
			scanner.nextLine();

			Produtos produto = new Produtos(nome,tipo,valor,quantidade);

			estoque.produtos[estoque.cadastro] = produto;

			System.out.println(quantidade + "''"+ estoque.produtos[estoque.cadastro].getNome() + "''" + "cadastrado(s) com sucesso." );
			
			estoque.cadastro += 1;
			
			if(estoque.cadastro == estoque.produtos.length ){
				
				estoque.dobra_array(estoque.produtos);
			}
			
			

			System.out.println("Deseja cadastrar outro produto? ");   
			cadastro_novo = scanner.nextLine();


		}


		while(cadastro_novo.equalsIgnoreCase("Sim"));


	}


	public void venda_produtos(){


		System.out.println("Digite o nome do produto: ");
		String nome_produto = scanner.nextLine();

		estoque.buscaNome(nome_produto);

		System.out.print("\nDeseja vender outro produto? "); 

		String escolha = scanner.nextLine();


		if(escolha.equalsIgnoreCase("sim")){

			venda_produtos();



		}

	}







public void imprimeBalanco(){
	
	
	
	System.out.println("= = = = Impressao de Balanco = = = ="); 
	System.out.println("Produtos cadastrados:"); 
	
	for(int i =0; i < estoque.produtos.length; i++){
		
	}
	System.out.println(i+1")" + );	 
		2) Lata de Leite Ninho (Alimento). R$11.20 Restante: 100 
		 
		Total arrecadado em vendas: R$ 59.80 
		Total que pode ser arrecadado: R$ 1359.20 
	
}

}