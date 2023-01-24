package invoicingSystemForGroceriesShop;

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {


	Scanner sc = new Scanner(System.in);
	   int totalAmount;
	   int a;
	   int b;
	   public void calculate() {
		   System.out.println("Enter frist price  ");
		   a=sc.nextInt();
		   System.out.println("Enter second price  ");
		   b=sc.nextInt();
		   totalAmount = a+b;
		   System.out.println("  totalAmount  "+totalAmount);
	   }
	  

	
		
		
	    
	   
}
