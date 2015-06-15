import static org.junit.Assert.*;

import java.text.DecimalFormat;

import org.junit.Before;
import org.junit.Test;

import CartModel.Product;


public class ProductTest {
	Product product;

	@Before
	public void createProduct(){
		product = new Product();
	}
	
	@Test
	public void productNotNullTest() {
		assertFalse(product == null);
	}
	
	@Test
	public void genericProduct(){
		assertTrue(!product.getName().equals(""));
		assertTrue(!product.getDescription().equals(""));
		assertTrue(product.getPrice() > 0);
		
		StringBuilder builder = new StringBuilder("**");
		builder.append("Some name--");
		builder.append("Some description--");
		builder.append("$ ");
		builder.append(new DecimalFormat("#.##").format(product.getPrice()) + "**");
		
		assertEquals(builder.toString(), product.toString());
	}

	@Test
	public void customProduct(){
		product = new Product("Botas", "de Jesus", 40);
		assertTrue(product.getName().equals("Botas"));
		assertTrue(product.getDescription().equals("de Jesus"));
		assertTrue(product.getPrice() == 40);
		
		StringBuilder builder = new StringBuilder("**");
		builder.append("Botas--");
		builder.append("de Jesus--");
		builder.append("$ ");
		builder.append(new DecimalFormat("#.##").format(product.getPrice()) + "**");
		
		assertEquals(builder.toString(), product.toString());
	}
}
