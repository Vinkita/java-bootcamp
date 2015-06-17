import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import service.ICartService;
import service.CartServiceFactory;
import utils.ProductCatalog;
import utils.Randomizer;


public class LocalCartServiceTest {

	ByteArrayOutputStream output;
	
	@Before
	public void setupOutput(){
		output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
	}
	
	@Test
	public void ServiceCreationTest() {
		ICartService service = CartServiceFactory.getLocalService();
		service.createCart();
		assertEquals("Cart Created\r\n", output.toString());
	}
	
	@Test
	public void AddProductTest() {
		ICartService service = CartServiceFactory.getLocalService();
		service.createCart();
		service.addProduct(ProductCatalog.randomProduct(), Randomizer.getInt(1, 10));
		assertEquals("Cart Created\r\nProduct Added\r\n", output.toString());
	}
	
	@Test
	public void ProcessPaymentTest() {
		ICartService service = CartServiceFactory.getLocalService();
		service.createCart();
		service.addProduct(ProductCatalog.randomProduct(), Randomizer.getInt(1, 10));
		service.processPayment("Card");
		assertEquals("Cart Created\r\n"
				+ "Product Added\r\n"
				+ "Payment Processed\r\n", output.toString());
	}

}
