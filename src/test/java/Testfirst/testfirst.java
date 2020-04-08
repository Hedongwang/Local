package Testfirst;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import first.first;


public class testfirst {

	@Test		//Óï¾ä¸²¸Ç
	public void test_1() {
		assertEquals((double)-1,new first().commission(0, 1, 1),0.001);
		assertEquals((double)9.8,new first().commission(1, 1, 1),0.001);
		assertEquals((double)119.5,new first().commission(1, 1, 130),0.001);
		assertEquals((double)678,new first().commission(1, 1, 500),0.001);		
	}

	@Test		//ÅÐ¶Ï¸²¸Ç
	public void test_2() {
		assertEquals((double)-1,new first().commission(0, 1, 1),0.001);
		assertEquals((double)9.8,new first().commission(1, 1, 1),0.001);
		assertEquals((double)119.5,new first().commission(1, 1, 130),0.001);
		assertEquals((double)678,new first().commission(1, 1, 500),0.001);		
	}
}
