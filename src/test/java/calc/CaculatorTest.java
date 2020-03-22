package calc;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CaculatorTest {
	private static CalculatorMain calc;
	
	@BeforeClass
	public static void setup(){
		calc = new CalculatorMain();
	}
	
	@Test
	public void testAdd() {
		int a=6;
		int b=4;
		int result=10;

		Assert.assertEquals(result, calc.add(a, b));
	}
	
	@Test
	public void testAdd2() {
		int a=1;
		int b=3;
		int result=4;

		Assert.assertEquals(result, calc.add(a, b));
	}
	
	@Test
	public void testAdd3() {
		int a=2;
		int b=3;
		int result=5;

		Assert.assertEquals(result, calc.add(a, b));
	}
	
	@Test
	public void testSubtract() {
		int a=16;
		int b=4;
		int result=12;
		
		Assert.assertEquals(result, calc.sub(a, b));
	}

	@Test
	public void testMultiply() {
		int a=6;
		int b=4;
		int result=24;
		
		Assert.assertEquals(result, calc.mul(a, b));
	}

	@Test
	public void testDivide() {
		int a=16;
		int b=2;
		int result=8;
		
		Assert.assertEquals(result, calc.div(a, b));
	}
	
}
