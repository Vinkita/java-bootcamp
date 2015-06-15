package CartModel;

import java.text.DecimalFormat;

import utils.Randomizer;

public class Product {
	private String name;
	private String description;
	private double price;
	
	public Product(){
		name = "Some name";
		description = "Some description";
		price = Randomizer.getDouble(300, 600);
	}

	public Product(String name, String desc, int price) {
		this.name = name;
		description = desc;
		this.price = price;
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
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("**");
		builder.append(name + "--");
		builder.append(description + "--");
		builder.append("$ ");
		builder.append(new DecimalFormat("#.##").format(price) + "**");
		return builder.toString();
	}
	
	
}
