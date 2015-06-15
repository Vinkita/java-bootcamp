import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import utils.ProductCatalog;
import CartModel.OrderLine;
import CartModel.Product;


public class OrderTest {

	OrderLine line;
	OrderLine customLine;
	Product p;
	
	@Before
	public void setupLine(){
		p = new Product("A", "A", 10);
		line = new OrderLine();
		customLine = new OrderLine(p, 5);
	}
	
	@Test
	public void notNullTest() {
		assertFalse(line == null);
	}
	
	@Test
	public void genericLineTest(){
		assertTrue(ProductCatalog.containsProduct(line.getProduct()));
		assertTrue(line.getQuant() > 0);
		assertTrue(line.getQuant() < 11);
	}
	
	@Test
	public void customLineTest(){
		assertEquals(p, customLine.getProduct());
		assertTrue(customLine.getQuant() == 5);
	}
	
	@Test
	public void canComputeTotalTest(){
		assertTrue(customLine.getTotal() == 50);
	}

}
