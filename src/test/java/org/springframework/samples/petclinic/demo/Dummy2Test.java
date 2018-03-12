package devops.demo;
import org.springframework.samples.petclinic.demo.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;
import java.lang.AssertionError;

@SuppressWarnings({ "unused", "deprecation" })
public class Dummy2Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	
		Dummy2 d2 =new Dummy2();
		
		Assert.assertNotNull(d2);
		
	}

}
