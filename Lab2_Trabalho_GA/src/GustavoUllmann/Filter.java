package GustavoUllmann;

	public class Filter extends Product {
		
	private String brand;
	private String type;  
	private String partNumber;
	
	public Filter(int barCode, String country, int quantity, String brand, String type, String partNumber) {
		super(barCode, country, quantity);
		this.brand = brand;
		this.type = type;
		this.partNumber = partNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	@Override
	public String toString() {
		return "Código de barra: " + super.getBarCode() + "\n" +
				"País de origem: " + super.getOriginCoutry() + "\n" +
				"Quantidade em estoque: " + super.getQuantity() + "\n" +
				"Data de inclusão: " + super.getTimeStampInclusion() + "\n" +
				"Marca: " + brand + "\n" +
				"Tipo: " + type + "\n" +
				"Part Number: " + partNumber;
	}
	
		
	
}
