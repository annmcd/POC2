package com.aib.integration;

/**Ann McDonald April 2017
 * Integration Test Project for CI/CD Process **/

public class CalculatorIntegration {
	
	long x=0;
	long y=0;
		
	
	public CalculatorIntegration(long xval, long yval){
		x=xval;
		y=yval;
	}
	

		
	public long add(){
		
		return x+y;
	}
	
	
	public long subtract(){
		
		return x-y;
		
	}
	
		
	public long multiply(){
		
		return x*y;
		
	}
	
	
	public long divide(){
		
		return x/y;
	}
	
}
