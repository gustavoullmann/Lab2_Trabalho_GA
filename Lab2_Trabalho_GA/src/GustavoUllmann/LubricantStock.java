package GustavoUllmann;

public class LubricantStock {
	
	private Lubricant[] lubStock;
	private int total;
	
	public LubricantStock(int length) {
		this.lubStock = new Lubricant[length];
		total = 0;
	}
	
	public Lubricant[] getLubStock() {
		return lubStock;
	}

	public int getTotal() {
		return total;
	}

    public void insert(Lubricant lub) {
        
        lubStock[total] = lub;
        total++;
    }

    public void printStock() {
      
        for (int i = 0; i < total; i++) { 
        	System.out.println("Código de barra: " + lubStock[i].getBarCode()+ "\n" +
								"País de origem: " + lubStock[i].getOriginCoutry() + "\n" +
								"Quantidade em estoque: " + lubStock[i].getQuantity() + "\n" +
								"Data de inclusão: " + lubStock[i].getTimeStampInclusion() + "\n" +
								"Fabricante: " + lubStock[i].getBrand()+ "\n" +
								"Viscosidade: " + lubStock[i].getViscosity() + "\n" +
								"Quantidade (ml): " + lubStock[i].getQuantityMilliliters());
        }
    }


}


