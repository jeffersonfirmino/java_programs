package lab03;

import java.util.Scanner;

public class EconomizaP2 {
    
private static Scanner scanner;

public static void main(String[] args){
        
        
        scanner = new Scanner(System.in);
        
        int escolha = 0;
        
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
            	
            	Supermercado cadastro = new Supermercado();
            	
            	cadastro.cadastro();
            	
            	
            }
        
            if(escolha == 2){
            	
            	Supermercado vendas = new Supermercado();
            	vendas.venda_produtos();
            }
            	
            
        }
        
        
   
       
    	    
}
}
