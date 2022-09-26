package classesWithAttributes;

public class Product {
	
	//constructor
	//Class ile aynı isimde olmalı
	public Product(int id, String name, String description, double price, int StockAmount, String renk) {
		System.out.println("Yapici blok calisti");
		this.id = id;
		this.renk = renk;
		this.name = name;
		this.price = price;
		this.stockAmount = StockAmount;
		this.description = description;
		
	}
	
	//overloading --> detaylı anlatımı methodOverloading paketinde
	public Product() {
		
	}
	
	//attribute | field
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
	
	//getter
	public int getId() {
		return id;
	}
	
	//setter
	public void setId(int id) {
		//this bu classtakini belirtir.
		this.id = id;	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		return this.name.substring(0,1) + id;
	}

	
	
	

	
	
	
	
}
