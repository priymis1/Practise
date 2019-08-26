package comm.example;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class TestComputeClass extends TestCase{
	
	

	public TestComputeClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TestComputeClass(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public void setUp() throws Exception {
		
		super.setUp();
		System.out.println("Initialize method");
		int x=7;
		int y=5;
	}

	@Override
	public void tearDown() throws Exception {
		super.tearDown();
		System.out.println("Clear method");
		int x=0;
		int y=0;
	}

	@Test
	public void testAdd() {
		int x=10;
		int y=20;
		ComputeClass c = new ComputeClass();
		int result = c.add(x,y);
		assertEquals(30,result);
		//fail("Not yet implemented");
	}

	@Test
	public void testMultiply() {
		int x=10;
		int y=20;
		ComputeClass c = new ComputeClass();
		int result = c.multiply(x,y);
		assertEquals(200,result);
		//fail("Not yet implemented");
	}

	@Test
	public void testSubtract() {
		int x=10;
		int y=20;
		ComputeClass c = new ComputeClass();
		int result = c.subtract(x,y);
		assertEquals(-10,result);
		//fail("Not yet implemented");
	}
	
	public static TestSuite createTestSuite()
	{
		TestSuite testSuite = new TestSuite("Alltests");
		testSuite.addTest(new TestComputeClass("testAdd"));
		testSuite.addTest(new TestComputeClass("testMultiply"));
		testSuite.addTest(new TestComputeClass("testSubtract"));
		testSuite.addTest(new TestMyClass());
		return testSuite;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Running the test through TestSuite...");
		//junit.textui.TestRunner.run(createTestSuite());
		TestRunner.run(createTestSuite());
	}

}
