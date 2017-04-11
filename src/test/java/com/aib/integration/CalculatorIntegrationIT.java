package com.aib.integration;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculatorIntegrationIT {

	CalculatorIntegration calc;
	
	   @Before
	    public void setUp() throws Exception {
	        calc = new CalculatorIntegration(10, 7);
	    }
	    @Test
	    public void testAdd() {
	        Assert.assertEquals(17, calc.add());
	    }
	
	    
	    
	    @Test
	    public void testSubtract() {
	        Assert.assertEquals(3, calc.subtract());
	    }
	    
	    @Test
	    public void testMultiply() {
	        Assert.assertEquals(70, calc.multiply());
	    }
	
	  
	    @Test
	    public void testDivide() {
	    	  calc = new CalculatorIntegration(10, 1);
	    
	        Assert.assertEquals(10, calc.divide());
	    }


}
