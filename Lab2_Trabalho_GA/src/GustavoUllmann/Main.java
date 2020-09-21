package GustavoUllmann;

import java.awt.Desktop;
import java.net.URI;

public class Main {

	public static void main(String[] args) {
		
		Lubricant A = new Lubricant(1000, "brasil", 100,"Lubrax", "5w20", 250);
		System.out.println(A.toString());	
		
			System.out.println();
		
		Filter B = new Filter(2000, "china", 200, "tecfil", "ar", "PSL2000");
		System.out.println(B.toString());
		
			System.out.println();
		
		BrakePad C = new BrakePad(3000, "EUA", 300, "Bosch", "Carbono", "Dianteiro", "FB20982USA");
		System.out.println(C.toString());
		
		Menu.menu();
		
	}		
}

/*
 * System.out.println(Desktop.isDesktopSupported());
		
		try{
            URI link = new URI("www.google.com");
            Desktop.getDesktop().browse(link);
        }catch(Exception erro){
            System.out.println(erro);
        }	*/