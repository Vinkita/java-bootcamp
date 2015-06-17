package service;

import CartModel.Product;

public class CartWebService implements ICartService {
	
	ICartService implementation = new CartServiceImp();
	private static CartWebService instance;
	
	public static ICartService getService() {
		System.out.println("Creating WebService");
		if(instance == null)
			instance = new CartWebService();
		return instance;
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
