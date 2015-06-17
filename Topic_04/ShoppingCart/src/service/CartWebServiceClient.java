package service;

import CartModel.Product;

public class CartWebServiceClient implements ICartService {

	ICartService webService;
	
	 public CartWebServiceClient() {  
	        webService = CartWebService.getService();  
	    } 
	
	@Override
	public void createCart() {
		webService.createCart();
	}

	@Override
	public void addProduct(Product product, int quant) {
		webService.addProduct(product, quant);
	}

	@Override
	public void showDetails() {
		webService.showDetails();
	}

	@Override
	public void processPayment() {
		processPayment(null);
	}

	@Override
	public void processPayment(String payment) {
		webService.processPayment(null);
	}

}
