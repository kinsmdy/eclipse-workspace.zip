import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testlogin {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("BC");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AC");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("B");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("T");
	}

	@Test
	public void test() {
		System.out.println("TestLogin1");
	}
	
	@Test
	public void test2() {
		System.out.println("TestLogin2");
	}

}
