package com.Log4j.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	//(retryAnalyzer = com.Log4j.test.RetryListeners.class)
	@Test
	public void testing1()
	{
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void testing2()
	{
		Assert.assertEquals(true, false);
	}

}
