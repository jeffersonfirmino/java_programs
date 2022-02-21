package lab3;

import java.util.Scanner;


public class Cadastro {

	
	
	
	
	public void cadastro(){
		

		
		Scanner scanner = new Scanner(system.in);
		
		do{
			
			System.out.println("= = = Cadastro de Produtos = = = ="); 
			
			System.out.print("Digite o nome do produto: ");		 
			String nome = scanner.nextLine();
			
			System.out.println("Digite o preço unitário do produto: "); 
			double valor = scanner.nextDouble();
			scanner.nextLine();
			
			System.out.println("Digite o tipo do produto: "); 
			String tipo = scanner.nextLine();
			
			System.out.println(nome + "cadastrado com sucesso."); 

			System.out.println("Deseja cadastrar outro produto? ");   
			String cadastro_novo = scanner.nextLine();
			
		}while(cadastro_novo.equals("sim")){
			

			System.out.println("= = = Cadastro de Produtos = = = ="); 
			
			System.out.print("Digite o nome do produto: ");		 
			String nome = scanner.nextLine();
			
			System.out.println("Digite o preço unitário do produto: "); 
			double valor = scanner.nextDouble();
			scanner.nextLine();
			
			System.out.println("Digite o tipo do produto: "); 
			String tipo = scanner.nextLine();
			
			System.out.println(nome + "cadastrado com sucesso."); 

			System.out.println("Deseja cadastrar outro produto? ");   
			String cadastro_novo = scanner.nextLine();
		}
		
	
	}
}
