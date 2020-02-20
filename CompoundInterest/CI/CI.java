package com.vnrvjiet.reethu.CompoundInterest.CI;

public class CI {public void CompIntrst(double p, double r, double t)
	
	{
	double com;
	com=p * Math.pow(1.0+r/100.0,t) - p;
	System.out.println("compound interest is"+com);
	}

}
