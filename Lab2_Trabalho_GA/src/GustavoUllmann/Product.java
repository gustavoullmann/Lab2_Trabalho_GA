package GustavoUllmann;

import java.util.Date;

public abstract class Product {
	
	private int barCode;
	private String originCoutry;
	private int quantity;
	private Date dateOfInclusion;
	
	
	public Product(int barCode, String country, int quantity) {
		
		this.barCode = barCode;
		this.originCoutry = country;
		this.quantity = quantity;
		this.dateOfInclusion = generateTimeStamp();
	}
	
	public int getBarCode() {
		return barCode;
	}

	public void setBarCode(int barCode) {
		this.barCode = barCode;
	}
	
	public String getOriginCoutry() {
		return originCoutry;
	}

	public void setOriginCoutry(String country) {
		this.originCoutry = country;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getTimeStampInclusion( ) {
		return dateOfInclusion;
	}

	public void setTimeStampInclusion() {
		this.dateOfInclusion = generateTimeStamp();
	}

	public static Date generateTimeStamp() {
		
		Date timeStamp = new Date();	
		return timeStamp;
	}

	@Override
	public String toString() {
		return "Código de barra: " + barCode + "\n" +
				"País de origem: " + originCoutry + "\n" +
				"Quantidade em estoque: " + quantity + "\n" +
				"Data de inclusão: " + dateOfInclusion;
	}	
}
