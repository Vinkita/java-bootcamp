package service;

import CartModel.Product;

public class CartServiceProxy implements ICartService{

	ICartService implementation;
	
	public CartServiceProxy(ICartService implementation) {
		this.implementation = implementation;
	}

	@Override
	public void createCart() {
		implementation.createCart();
	}

	@Override
	public void addProduct(Product product, int quant) {
		implementation.addProduct(product, quant);
	}

	@Override
	public void showDetails() {
		implementation.showDetails();
	}

	@Override
	public void processPayment() {
		processPayment(null);
	}

	@Override
	public void processPayment(String payment) {
		implementation.processPayment(null);
	}

}
