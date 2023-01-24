package invoicingSystemForGroceriesShop;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {

	Scanner sc = new Scanner(System.in);
	String ShopName;
	int adress;
	CustomerInfo customerInfo = new CustomerInfo();
	ArrayList<CustomerInfo> CustomerList = new ArrayList<CustomerInfo>();
	
	
	
	public void AddShop() {
		 System.out.print("Enter Shop name: ");
		 ShopName = sc.next();
		 System.out.print("Enter Shop adress: ");
		 adress = sc.nextInt();
	}
	
	
	public void printShop() {
		System.out.println(ShopName);
		System.out.println(adress);
	}
	
	 public void printCustomer() {
		 for (CustomerInfo i : CustomerList) {
			 System.out.println(i.customerName);
			 System.out.println(i.phoneNumber);
			 System.out.println(i.invoiceDate);
			
		 }
	 }
}
