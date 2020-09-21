package GustavoUllmann;

public class Lubricant extends Product{
	
	private String brand;
	private String viscosity;  
	private int quantityMilliliters;
	
	public Lubricant(int barCode, String country, String brand, String viscosity, int quantityMilliliters) {
		super(barCode, country);
		this.brand = brand;
		this.viscosity = viscosity;
		this.quantityMilliliters = quantityMilliliters;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getViscosity() {
		return viscosity;
	}

	public void setViscosity(String viscosity) {
		this.viscosity = viscosity;
	}

	public int getQuantityMilliliters() {
		return quantityMilliliters;
	}

	public void setQuantityMilliliters(int quantityMilliliters) {
		this.quantityMilliliters = quantityMilliliters;
	}

	@Override
	public String toString() {
		return "Código de barra: " + super.getBarCode() + "\n" +
				"País de origem: " + super.getOriginCoutry() + "\n" +
				"Data de inclusão: " + super.getTimeStampInclusion() + "\n" +
				"Fabricante: " + brand + "\n" +
				"Viscosidade: " + viscosity + "\n" +
				"Quantidade (ml): " + quantityMilliliters;
	}
}
