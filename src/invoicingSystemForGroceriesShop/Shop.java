package invoicingSystemForGroceriesShop;

import java.util.ArrayList;

public class Shop {

	String ShopName;
	int adress;
	CustomerInfo customerInfo = new CustomerInfo();
	ArrayList<CustomerInfo> CustomerList = new ArrayList<CustomerInfo>();
	
	
	 public void printCustomer() {
		 for (CustomerInfo i : CustomerList) {
			 System.out.println(i.customerName);
			 System.out.println(i.phoneNumber);
			 System.out.println(i.invoiceDate);
			
		 }
	 }
}
