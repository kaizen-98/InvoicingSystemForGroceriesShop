package invoicingSystemForGroceriesShop;

import java.util.ArrayList;
import java.util.Scanner;



public class GroceriesShop {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  Shop shop = new Shop();
		  CustomerInfo customerInfo = new CustomerInfo();
	        while (true) {
	            System.out.println("1. Enter customer information");
	            System.out.println("2. Add item to invoice");
	            System.out.println("3. Remove item from invoice");
	            System.out.println("4. Update item quantity");
	            System.out.println("5. Print invoice");
	            System.out.println("6. Exit");

	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                	
	                	customerInfo.AddCustomer();
	                	shop.CustomerList.add(customerInfo);
	                    break;
	                case 2:
	                	Item item = new Item();
	                	item.AddItem();
	                	shop.customerInfo.itemlist.add(item);
	                    break;
	                case 3:
	                	shop.customerInfo.RemoveItem();
	                    break;
	                case 4:
	                	shop.customerInfo.Update( p, o);
	                	shop.CustomerList.add(customerInfo);
	                    break;
	                case 5:
	                	shop.printCustomer();
	                	shop.customerInfo.printItem();
	                    break;
	                case 6:
	                    return;
	            }
	           
	        }
		
		
		

	}

}
