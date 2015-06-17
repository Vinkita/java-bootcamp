package service;

import CartModel.Product;

public interface ICartService {
	public void createCart();
	public void addProduct(Product product, int quant);
	public void showDetails();
	public void processPayment();
	public void processPayment(String payment);	
}
