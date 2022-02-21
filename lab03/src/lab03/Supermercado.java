package lab03;

import java.util.Scanner;

public class Supermercado {

	
	public Produtos[] produtos = new Produtos[5];

public void cadastro(){

	
	
	Scanner scanner = new Scanner(System.in);
	
	
	String cadastro_novo = "sim";
	
	
	int i = 0;
	

	 do{
         
         
		 
		 System.out.println("= = = Cadastro de Produtos = = = ="); 
         
         System.out.print("Digite o nome do produto: ");         
         String nome = scanner.nextLine();
         
         System.out.println("Digite o preço unitário do produto: "); 
         double valor = scanner.nextDouble();
         scanner.nextLine();
         
         System.out.println("Digite o tipo do produto: "); 
         String tipo = scanner.nextLine();
         
         System.out.println(nome + " cadastrado com sucesso."); 

         
         Produtos produto = new Produtos(nome,tipo,valor);
    	 
         this.produtos[i] = produto;
         
         System.out.println("Deseja cadastrar outro produto? ");   
         cadastro_novo = scanner.nextLine();
         
         i++;
	 }
	 
	 
	 while(cadastro_novo.equalsIgnoreCase("Sim"));
	
	
	 }




public void venda_produtos(){

	Scanner scanner = new Scanner(System.in);

	System.out.println("= = = = Venda de Produtos = = = =");

	String escolha = "sim";

	
	
	int i = 0;
	
	while(escolha.equalsIgnoreCase("Sim")){
			
		System.out.print("Digite o nome do produto: ");
		String nome_produto = scanner.nextLine();

		if(nome_produto.equalsIgnoreCase(this.produtos[i].getNome())){
			System.out.println("==> " + this.produtos[i].getNome() + " (" + this.produtos[i].getTipo() + ")");
			System.out.print("Digite a quantidade que deseja vender: ");
			int qtd = scanner.nextInt();
			scanner.nextLine();

			System.out.print("==> Total arrecadado: " + (this.produtos[i].getValor() * qtd)); 

			System.out.print("Deseja vender outro produto? "); 

			escolha = scanner.nextLine();
			i++;
		}
		else{


			System.out.println("==> " + nome_produto + "nao cadastrado no sistema");
			System.out.print("Deseja vender outro produto? "); 

			escolha = scanner.nextLine();
		
			i++;
		}

	}


}

}
			
			
			
			


