package GustavoUllmann;

import java.io.*;
import java.util.Scanner;

public class Files {
	
	private String filePath;

 	public Files(String filePath) {
		this.filePath = filePath;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public static void createStockFiles(String filePath) {
		
		createFile(filePath, "Lubricants");
		createFile(filePath, "Filters");
		createFile(filePath, "BrakePads");		
	}
	
	public static void createFile(String filePath, String fileName) {
		
		try {
		   	
		File file = new File(filePath + "/" + fileName + ".txt");
		 
			if (file.createNewFile()) {
				System.out.println("Arquivo criado: " + file.getName());
			} else {
				System.out.println("O arquivo " + file.getName() + " já existe!");
			}
		} catch (IOException e) {
			System.out.println("Um erro ocorreu!");
		}
	}
	
	public static void fileWriter(String fileName, String text) {
		
//		try {
//			FileWriter fr = new FileWriter(fileName, true);
//			fr.write(text);
//			fr.close();
//		}
		
		try {
			BufferedWriter fr = new BufferedWriter(new FileWriter(fileName, true));
			fr.write(text);
			fr.newLine();
			fr.flush();
			fr.close();
		}

		catch (FileNotFoundException e) {
			System.out.println("Arquivo \"" + fileName + "\" não existe.");

		} catch (IOException e) {
			System.out.println("Erro na leitura de " + fileName + ".");
		}		
	}	
}
