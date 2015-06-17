package utils;

import java.util.ArrayList;

import CartModel.Product;

public class ProductCatalog {
	private static int cap = 11;
	private static ArrayList<Product> catalog = new ArrayList<Product>(cap);
	
	static {
		catalog.add(new Product("Tele", "muchas pulgadas", 3000));
		catalog.add(new Product("Samsung S20", "nuevo", 20000));
		catalog.add(new Product("Nike 6435", "zapatillas", 1000));
		catalog.add(new Product("Bic", "lapicera", 5));
		catalog.add(new Product("Harry Potter 1", "libro", 50));
		catalog.add(new Product("Harry Potter 2", "libro", 100));
		catalog.add(new Product("Harry Potter 3", "libro", 150));
		catalog.add(new Product("Harry Potter 4", "libro", 300));
		catalog.add(new Product("Harry Potter 5", "libro", 600));
		catalog.add(new Product("Harry Potter 6", "libro", 1200));
		catalog.add(new Product("Harry Potter 7", "libro", 2400));
	}
	
	public static Product randomProduct(){
		return catalog.get(Randomizer.getInt(0, cap - 1));
	}
	
	public static boolean containsProduct(Product p){
		return catalog.contains(p);
	}
}
