package com.lti.demo.MavenAppLTI;

import static org.junit.Assert.*;

import org.junit.Test;


public class FibonacciTestValidation {
	
	
	@Test
	public void test1()
	{
		int res=0;
		Fibonacci usr=new Fibonacci();
		try
		{
		res=usr.findFibo(5);
		assertEquals(3,res);
		}
		catch (InvalidLimitException e)
		{
			e.getMessage();
			fail();
		}
	}
	
	@Test
	public void test2()
	{
		int res=0;
		Fibonacci usr=new Fibonacci();
		try
		{
		res=usr.findFibo(10);
		assertEquals(34,res);
		}
		catch (InvalidLimitException e)
		{
			e.getMessage();
			fail();
		}
	}
	
	@Test
	public void test3()
	{
		int res=0;
		Fibonacci usr=new Fibonacci();
		try
		{
		res=usr.findFibo(-2);
		fail();
		}
		catch (InvalidLimitException e)
		{
			e.getMessage();
			assertEquals("Invalid Limit", e.getMessage());
		}
	}
	
	@Test
	public void test4()
	{
		int res=0;
		Fibonacci usr=new Fibonacci();
		try
		{
		res=usr.findFibo(101);
		assertEquals(-2,res);
		}
		catch (InvalidLimitException e)
		{
			e.getMessage();
			fail();
		}
	}
	
	@Test
	public void test5()
	{
		int res=0;
		Fibonacci usr=new Fibonacci();
		try
		{
		res=usr.findFibo(1);
		assertEquals(-1,res);
		}
		catch (InvalidLimitException e)
		{
			e.getMessage();
			fail();
		}
	}
	
	@Test
	public void test6()
	{
		int res=0;
		Fibonacci usr=new Fibonacci();
		try
		{
		res=usr.findFibo(8);
		assertEquals(13,res);
		}
		catch (InvalidLimitException e)
		{
			e.getMessage();
			fail();
		}
	}
	

}
