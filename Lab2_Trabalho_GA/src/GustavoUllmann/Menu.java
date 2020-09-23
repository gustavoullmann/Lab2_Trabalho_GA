package GustavoUllmann;

import java.util.Scanner;

public class Menu {
	
	static Scanner input = new Scanner(System.in);

	public static void menu() {
		
		int option = 0;
				
		System.out.println("Escolha a opção desejada no menu abaixo:" + "\n");
		
		System.out.println("\t" + "1 - Para cadastrar um novo produto");
		System.out.println("\t" + "2 - Para listar os produtos cadastrados");
		System.out.println("\t" + "3 - Para remover um produto cadastrado");
		System.out.println("\t" + "4 - Para atualizar as informações de um produto cadastrado");
		System.out.println("\t" + "5 - Para consultar o produto na internet pelo código");
		System.out.println("\t" + "6 - Para configurar diretório dos arquivos de registro");
		System.out.println("\t"	+ "7 - Para salvar as modificações e encerrar o programa" + "\n");
		
		System.out.println("Digite o número da opção desejada: ");
		
		try {
			option = input.nextInt();
			
			if(option < 1 || option >= 8) {
				
				System.out.println("Opção inválida! Digite um número entre 1 e 7!");
				menu();
				
			} else if(option == 1) {	
				subMenu1();
				
			} else if(option == 2) {
				
			} else if(option == 3) {
				
			} else if(option == 4) {
				
			} else if(option == 5) {
				
			} else if(option == 6) {	
				subMenu6();
				
			} else {
				System.out.println("O programa foi finalizado!");
				System.exit(0);
			}
			
		} catch(java.util.InputMismatchException e) {	
			System.out.println("Não são aceitas letras ou caracteres especiais!");
			System.out.println("O programa foi finalizado!");
			System.exit(0);
		}	
	}
	
	public static void subMenu1() {
		
		int option = 0;
			
			System.out.println("Escolha o tipo de produto que deseja cadastrar:" + "\n");
			
			System.out.println("\t" + "1 - Óleo Lubrificante");
			System.out.println("\t" + "2 - Filtros");
			System.out.println("\t" + "3 - Pastilhas de freio");
			System.out.println("\t" + "4 - Voltar ao menu principal" + "\n");
			
			System.out.println("Digite o número da opção desejada: ");
				
			try {
				
				option = input.nextInt();	
				
				if(option < 1 || option >= 5) {
					
					System.out.println("Opção inválida! Digite um número entre 1 e 4!");
			
				} else if(option == 1) {
					
					
			
				} else if(option == 2) {
					
				} else if(option == 3) {
					
				} else {
					menu();
				}	
			
			} catch(java.util.InputMismatchException e) {
				System.out.println("Não são aceitas letras ou caracteres especiais!");
				System.out.println("O programa foi finalizado!");
				System.exit(0);					
			} 
		}

	public static void subMenu6() {
		
		int option = 0;
			
		System.out.println("Escolha o tipo de produto que deseja cadastrar:" + "\n");
		
		System.out.println("\t" + "1 - Definir o diretório para salvar os arquivos de estoque de produtos");
		System.out.println("\t" + "2 - Voltar ao menu principal" + "\n");
		
		System.out.println("Digite o número da opção desejada: ");
			
		try {
			option = input.nextInt();
			
			if(option < 1 || option >= 3) {	
				System.out.println("Opção inválida! Digite um número entre 1 e 2!");
				subMenu6();
		
			} else if(option == 1) {	
				System.out.println("Informe o path do diretório onde deseja salvar os arquivos: ");
				String path = input.next();
				Files mainPath = new Files(path);
				Files.createStockFiles(mainPath.getFilePath());
			
			} else {
				menu();
			}
		
		} catch(java.util.InputMismatchException e) {
			System.out.println("Não são aceitas letras ou caracteres especiais!");
			System.out.println("O programa foi finalizado!");
			System.exit(0);	
							
		} 
	}
}

