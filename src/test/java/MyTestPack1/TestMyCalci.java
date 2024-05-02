package MyTestPack1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import MyPack1.MyCalci;

public class TestMyCalci {
	
	

	@Test
	public void Test1()
	{
		MyCalci mc =new MyCalci();
		assertEquals(30,mc.sum(10,20));
		
	}
	
	@Test
	public void Test2()
	{
		MyCalci mc =new MyCalci();
		assertEquals(200,mc.mul(10,20));
		
	}
}
