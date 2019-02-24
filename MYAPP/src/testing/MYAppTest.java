package testing;

import static org.junit.Assert.*;

import org.junit.Test;


public class MYAppTest {
	cart ca= new cart();
	@Test
	public void test() {
	
		int count = ca.countt();
		int price = ca.value();
		assertEquals(0,count);
		assertEquals(0,price);
	}

	
	@Test 
	public void test1() {
		ca.addbook("javabook",172);
		int count = ca.countt();
		int price = ca.value();
		assertEquals(1,count);
		assertEquals(172,price);
	}
	
	@Test
	public void test2() {

	    ca.addbook("javabook",172);
		ca.addbook("web design book",100);
		int count2 = ca.countt();
		int price2 = ca.value();
		assertEquals(2,count2);
		assertEquals(272,price2);
					
	}
}
