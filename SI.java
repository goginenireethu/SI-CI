package com.vnrvjiet.reethu;
import com.vnrvjiet.reethu.CompoundInterest.CI.CI;
import java.util.*;
public class SI {
	public static void main(String args[])
	{
		double p,r,t,sim;
		Scanner scan=new Scanner(System.in);
		try
		{
		
		System.out.println("Enter the amount");
		//read the input values from keyborad
		p=scan.nextInt();
		System.out.println("Enter the rate of interest ");
		//read the rate of interest
		r=scan.nextInt();
		System.out.println("Enter the no. of years");
		//read the no.years from keyborad
		t=scan.nextInt();
		sim=(p * t * r)/100;
		CI obj=new CI();
		obj.CompIntrst(p,r,t);

		}
		catch(Exception e)
		{
			System.out.println("enter only numbers");
		}
		
		
	}

}
