package com.vnrvjiet.reethu.HouseConstruction_Cost.design;
import java.util.*;
public class MyHouseCost {
	public static void main(String args[])
	{
		
		Scanner scan=new Scanner(System.in);
		try {
			
		int opt;
		float sqrfeet;
		System.out.println("Enter the cost per square feet rate");
		//Scanning the cost per square feet rate 
		sqrfeet=scan.nextInt();
		int s;
		do
        {
		System.out.println(" enter 1 : 1200INR if we use standard materials");
		System.out.println(" enter 2 :1500INR if we use standard material");
		System.out.println(" enter 3 :1800INR if cutomers need high standard material");
		System.out.println(" enter 4 :2500INR if cutomers need high standard material and fully automated home");
		//Scans the user's input and function accordingly
		opt=scan.nextInt();
		
		switch(opt)
		{
		case 1:
			System.out.println("total cost for using  standard material :"+sqrfeet*1200);
			break;
		case 2:
			System.out.println("total cost for using above standard matrial :"+sqrfeet*1500);
			break;
		case 3:
			System.out.println("total cost if cutomers need high standard material :"+sqrfeet*1800);
	        break;	
		case 4:
			System.out.println("total cost if cutomers need high standard material and fully automated home :"+sqrfeet*2500);
		   break;
		case 5:
			System.exit(0);
		}
		
		System.out.println("Continue(1/0)");
		//Scans the input whether to continue or not 
		 s=scan.nextInt();
        }while(s==1);
		
		
		}
		catch(Exception e) {
			System.out.println("only numbers are vaild");
		}

}
}
