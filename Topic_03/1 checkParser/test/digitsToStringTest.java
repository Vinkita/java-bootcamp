import static org.junit.Assert.*;
import main.CheckParser;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class digitsToStringTest {

	@Test
	public void canParseZerotTest() {
		CheckParser parser = new CheckParser(); 
		assertEquals(parser.parseAmount(0), "zero dollars");
	}
	
	@Test
	public void canParseSingleDigitsTest() {
		CheckParser parser = new CheckParser(); 
		assertEquals("one dollars",parser.parseAmount(1));
		assertEquals("two dollars",parser.parseAmount(2));
		assertEquals("three dollars",parser.parseAmount(3));
		assertEquals("four dollars",parser.parseAmount(4));
		assertEquals("five dollars",parser.parseAmount(5));
		assertEquals("six dollars",parser.parseAmount(6));
		assertEquals("seven dollars",parser.parseAmount(7));
		assertEquals("eight dollars",parser.parseAmount(8));
		assertEquals("nine dollars",parser.parseAmount(9));
	}
	
	@Test
	public void canParseTwoDigitsTest(){
		CheckParser parser = new CheckParser(); 
		assertEquals("ten dollars", parser.parseAmount(10));
		assertEquals("eleven dollars", parser.parseAmount(11));
		assertEquals("twelve dollars", parser.parseAmount(12));
		assertEquals("thirteen dollars", parser.parseAmount(13));
		assertEquals("fourteen dollars", parser.parseAmount(14));
		assertEquals("fifteen dollars", parser.parseAmount(15));
		assertEquals("sixteen dollars", parser.parseAmount(16));
		assertEquals("seventeen dollars", parser.parseAmount(17));
		assertEquals("eighteen dollars", parser.parseAmount(18));
		assertEquals("nineteen dollars", parser.parseAmount(19));
		assertEquals("twenty dollars", parser.parseAmount(20));
		assertEquals("twenty five dollars", parser.parseAmount(25));
		assertEquals("thirty dollars", parser.parseAmount(30));
		assertEquals("thirty five dollars", parser.parseAmount(35));
		assertEquals("forty dollars", parser.parseAmount(40));
		assertEquals("forty five dollars", parser.parseAmount(45));
		assertEquals("fifty dollars", parser.parseAmount(50));
		assertEquals("fifty five dollars", parser.parseAmount(55));
		assertEquals("sixty dollars", parser.parseAmount(60));
		assertEquals("sixty five dollars", parser.parseAmount(65));
		assertEquals("seventy dollars", parser.parseAmount(70));
		assertEquals("seventy five dollars", parser.parseAmount(75));
		assertEquals("eighty dollars", parser.parseAmount(80));
		assertEquals("eighty five dollars", parser.parseAmount(85));
		assertEquals("ninety dollars", parser.parseAmount(90));
		assertEquals("ninety five dollars", parser.parseAmount(95));
	}
	
	@Test
	public void canParseThreeDigitsTest(){
		CheckParser parser = new CheckParser();
		assertEquals("eight hundred seventy six dollars", parser.parseAmount(876));
	}
	
	@Test
	public void canParseFourDigitsTest(){
		CheckParser parser = new CheckParser();
		assertEquals("four thousand eight hundred seventy six dollars", parser.parseAmount(4876));
	}
	
	@Test
	public void canParseFiveDigitsTest(){
		CheckParser parser = new CheckParser();
		assertEquals("fifteen thousand eight hundred seventy six dollars", parser.parseAmount(15876));
		assertEquals("seventy thousand eight hundred seventy six dollars", parser.parseAmount(70876));
	}
	
	@Test
	public void canParseSixDigitsTest(){
		CheckParser parser = new CheckParser();
		assertEquals("seven hundred forty eight thousand five hundred thirty nine dollars", parser.parseAmount(748539));
	}

	@Test
	public void canParseCentsTest(){
		CheckParser parser = new CheckParser();
		assertEquals("56/100 dollars", parser.parseAmount(0.56));
		assertEquals("04/100 dollars", parser.parseAmount(0.04));
	} 
	
	@Test
	public void canParseCombinedTest(){
		CheckParser parser = new CheckParser();
		assertEquals("fifteen thousand eight hundred seventy six and 56/100 dollars", parser.parseAmount(15876.56));
		assertEquals("seventy thousand eight hundred seventy six and 04/100 dollars", parser.parseAmount(70876.04));
	}
}
