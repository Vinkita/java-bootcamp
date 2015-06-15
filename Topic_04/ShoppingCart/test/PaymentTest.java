import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import CartModel.Payment;


public class PaymentTest {
	
	Payment genPay;
	Payment customPay;
	
	@Before
	public void setup(){
		genPay = new Payment();
		customPay = new Payment("Visa", true, 150);
	}
	
	@Test
	public void notNullTest() {
		assertFalse(genPay == null);
	}
	
	@Test
	public void genericPaymentTest(){
		assertTrue(genPay.getTotal() == 0);		
		assertFalse(genPay.isPaid());
		assertEquals("", genPay.getDetails());
	}
	
	@Test
	public void customPaymentTest(){
		assertTrue(customPay.getTotal() == 150);		
		assertTrue(customPay.isPaid());
		assertEquals("Visa", customPay.getDetails());
	}
	
	@Test
	public void changePaid(){
		assertFalse(genPay.isPaid());
		genPay.setPaid(true);
		assertTrue(genPay.isPaid());		
	}
	
	@Test
	public void changeTotal(){
		assertTrue(genPay.getTotal() == 0);		
		genPay.setTotal(100);
		assertTrue(genPay.getTotal() == 100);		
	}
	
	@Test
	public void changeDetails(){
		assertEquals("", genPay.getDetails());
		genPay.setDetails("Cash");
		assertEquals("Cash", genPay.getDetails());
	}

}
