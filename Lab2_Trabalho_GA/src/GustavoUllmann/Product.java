package GustavoUllmann;

import java.util.Date;

public abstract class Product {
	
	private int barCode;
	private String originCoutry;
	private Date dateOfInclusion;
	
	
	public Product(int barCode, String country) {
		
		this.barCode = barCode;
		this.originCoutry = country;
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
				"Data de inclusão: " + dateOfInclusion;
	}	
}
