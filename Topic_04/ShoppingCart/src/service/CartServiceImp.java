package service;

import CartModel.OrderLine;
import CartModel.Payment;
import CartModel.Product;
import CartModel.ShoppingCart;

public class CartServiceImp implements ICartService {
	
	ShoppingCart cart;
	

	@Override
	public void createCart() {
		cart = new ShoppingCart();
		System.out.println("Cart Created");
	}

	@Override
	public void addProduct(Product product, int quant) {
		if(cart == null)
			createCart();
		cart.addOrder(new OrderLine(product, quant));
		System.out.println("Product Added");
	}

	@Override
	public void showDetails() {
		if(cart == null)
			createCart();
		System.out.println(cart.toString());
		System.out.println("Details Shown");
	}

	@Override
	public void processPayment() {
		processPayment(null);
	}

	@Override
	public void processPayment(String payment) {
		if(cart == null)
			createCart();
		Payment pay = cart.getPayment();
		if(!pay.isPaid()){
			pay.setDetails(payment);
			pay.setTotal(cart.getTotal());
			pay.setPaid(true);
		}
		System.out.println("Payment Processed");
	}

}
