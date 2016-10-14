package bjartur.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testEmptyString(){
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumbers() {
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
	public void testMultipleNumbers() {
		assertEquals(6, Calculator.add("1,2,3"));
	}

	@Test
	public void testNewLineNumbers() {
		assertEquals(6, Calculator.add("1,2\n3"));
	}
	@Test
	public void testMinusNumbers() {
		try{
			Calculator.add("-1,2,-3");
		}catch(IllegalArgumentException fail){
		assertEquals("Negatives not allowed: -1,-3", fail.getMessage());
		}
	}

}
