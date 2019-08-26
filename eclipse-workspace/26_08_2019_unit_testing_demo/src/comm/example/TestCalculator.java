package comm.example;

import org.junit.Test;

import junit.framework.TestCase;
import junit.textui.TestRunner;

public class TestCalculator extends TestCase{

	@Test
	public void testAddMethod() {
		int x=10;
		int y=20;
		Calculator c = new Calculator(x,y);
		int result = c.addMethod(); 
		assertEquals(30,result);
		//fail("Not yet implemented");
	}
	
	@Test
	public void testSubMethod() {
		int x=10;
		int y=20;
		Calculator c = new Calculator(x,y);
		int result = c.subMethod();
		assertEquals(30,result);
		//fail("Not yet implemented");
	}

	@Test
	public void testFirstGreaterThanSecond()
	{
		int x=20;
		int y=10;
		Calculator c = new Calculator(x,y);
		int result = c.firstGreaterThanSecond();
		assertEquals(1,result);
	}
	
	
	public static void main(String[] args)
	{
		
		
		TestRunner.run(TestCalculator.class);
	}
}
