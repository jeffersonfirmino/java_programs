package lab3;

import java.util.Scanner;

public class EconomizaP2 {

	
public static void main(String[] args){

		Supermercado supermercado = new Supermercado();

		int escolha = 0 ;

		 Scanner scanner = new Scanner(System.in);


	

		while(escolha != 4){

			System.out.println("= = = = Bem-vindo(a) ao EconomizaP2 = = = =");
			System.out.println("Digite a opção desejada:");		
			System.out.println("1 - Cadastrar um Produto");		
			System.out.println("2 - Vender um Produto");		
			System.out.println("3 - Imprimir Balanço");		
			System.out.println("4 - Sair");		

			System.out.print("Opção:");		

			escolha = scanner.nextInt();
			scanner.nextLine();	

			if(escolha == 1){

				
				System.out.println("= = = Cadastro de Produtos = = = ="); 
				supermercado.cadastro();

			} 



			if(escolha ==2){

				System.out.println("= = = = Venda de Produtos = = = =");
				
				supermercado.venda_produtos();

			}
		
		
		if(escolha == 3){
			
			System.out.println("= = = = Impressao de Balanco = = = ="); 
			
		}
		
		}
		

}
}

	
				
				
	
		

	

