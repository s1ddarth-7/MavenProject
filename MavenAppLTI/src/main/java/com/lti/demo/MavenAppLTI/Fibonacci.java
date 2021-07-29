package com.lti.demo.MavenAppLTI;

class InvalidLimitException extends Exception
{
	public InvalidLimitException(String mssg)
	{
		super(mssg);
	}
}

public class Fibonacci 
{
	int findFibo(int limit) throws InvalidLimitException
	{		
		if (limit<0)
			throw new InvalidLimitException("Invalid Limit");
		else if (limit>99)
			return -2;
		else if (limit==1)
			return -1;
		else
		{
			int a=0;
			int b=1;
			int c=0;
			
			for(int i=2;i<limit;i++)
			{
				c=a+b;
				a=b;
				b=c;
			}
			return c;
		}
		
	}
	
}