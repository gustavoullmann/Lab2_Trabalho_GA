package GustavoUllmann;

public class BrakePad extends Product {
	
	private String brand;
	private String material;
	private String axis;  
	private String partNumber;

	public BrakePad(int barCode, String country, int quantity, String brand, String material, String axis, String partNumber) {
		super(barCode, country, quantity);
		this.brand = brand;
		this.material = material;
		this.axis = axis;
		this.partNumber = partNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getAxis() {
		return axis;
	}

	public void setAxis(String axis) {
		this.axis = axis;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	
	public String brakePadInfoWriter() {
		
		String brakePadInfo = super.getBarCode() + ";" +
								super.getOriginCoutry() + ";" +
								super.getQuantity() + ";" +
								super.getTimeStampInclusion() + ";" +
								brand + ";" +
								material + ";" +
								axis + ";" +
								partNumber;
		return brakePadInfo;
	}

	@Override
	public String toString() {
		return "Código de barra: " + super.getBarCode() + "\n" +
				"País de origem: " + super.getOriginCoutry() + "\n" +
				"Quantidade em estoque: " + super.getQuantity() + "\n" +
				"Data de inclusão: " + super.getTimeStampInclusion() + "\n" +
				"Marca: " + brand + "\n" +
				"Material: " + material + "\n" +
				"Eixo de aplicação: " + axis + "\n" +
				"Part Number: " + partNumber;
	}
}
