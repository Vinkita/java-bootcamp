import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import utils.ProductCatalog;
import CartModel.OrderLine;
import CartModel.Product;
import CartModel.ShoppingCart;


public class CartTest {

	ShoppingCart cart;
	
	@Before
	public void setup(){
		cart = new ShoppingCart();
	}
	
	@Test
	public void creationTest() {
		assertNotNull(cart);
		assertTrue(cart.getOrderLines().isEmpty());
		assertTrue(cart.getPayment() != null);
		assertEquals(cart.getShipDate(), "");
		assertEquals(cart.getStatus(), "");
		assertFalse(cart.isComplete());
	}
	
	@Test
	public void addOrderTest() {
		Product p = ProductCatalog.randomProduct();		
		cart.addOrder(new OrderLine(p, 5));
		
		assertFalse(cart.getOrderLines().isEmpty());
		
		p = cart.getOrderLines().get(0).getProduct();
		assertNotNull(p);
		assertTrue(ProductCatalog.containsProduct(p));
	}
	
	private void prepareCart(){
		cart = new ShoppingCart();
		
		Product prod;
		OrderLine orderLine;
		int quantity = 0;
		
		prod = new Product("A", "A", 1);
		quantity = 1;
		orderLine = new OrderLine(prod, quantity);
		cart.addOrder(orderLine);
		
		prod = new Product("B", "B", 3);
		quantity = 3;
		orderLine = new OrderLine(prod, quantity);
		cart.addOrder(orderLine);
	}
	
	@Test
	public void calcTotal(){
		prepareCart();
		double total = cart.getTotal();
		assertTrue(total == 10);
	}
	

}
