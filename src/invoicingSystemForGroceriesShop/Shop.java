package invoicingSystemForGroceriesShop;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Shop implements Serializable{

	Scanner sc = new Scanner(System.in);
	String ShopName;
	int adress;
	String Email;
	CustomerInfo customerInfo = new CustomerInfo();
	ArrayList<CustomerInfo> CustomerList = new ArrayList<CustomerInfo>();
	
	
	
	public void AddShop() {
		 System.out.print("Shop Settings: \n");
		 System.out.print("Enter Shop name: ");
		 ShopName = sc.next();
		 System.out.print("Enter Shop adress: ");
		 adress = sc.nextInt();
		 System.out.print("Enter Shop Email: ");
		 Email = sc.next();
	}
	
	
	public void printShop() {
		System.out.println(ShopName);
		System.out.println(adress);
		System.out.println(Email);
		
	}
	
	 public void printCustomer() {
		 for (CustomerInfo i : CustomerList) {
			 System.out.println(i.customerName);
			 System.out.println(i.phoneNumber);
			 System.out.println(i.invoiceDate);
			
		 }
	 }
}
