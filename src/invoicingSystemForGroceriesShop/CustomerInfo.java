package invoicingSystemForGroceriesShop;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerInfo {


	 String customerName;
	 int phoneNumber;
	 int invoiceDate;
	 Scanner sc = new Scanner(System.in);
	 Item item = new Item();
	 ArrayList<Item> itemlist = new ArrayList<Item>();
	  
   
	 public void AddCustomer() {
		 System.out.print("Enter customer full name: ");
		 customerName = sc.next();
         System.out.print("Enter customer phone number: ");
          phoneNumber = sc.nextInt();
         System.out.print("Enter invoice date: ");
          invoiceDate = sc.nextInt();
        
	 }
	 
	 public void RemoveItem() {
		  System.out.print("Enter item ID to remove !!: ");
		  int a = sc.nextInt();
		  for (int i = 0; i < itemlist.size(); i++) {
	            if (itemlist.get(i).equals(a)) {
	            	itemlist.remove(i);
	            }}
//		  for (Item i : itemlist) {
//			  if(i.equals(a)) {
//				  itemlist.remove(a); 
//			  }
//		  }
//		  System.out.print(" Removed:Successfuly\n ");
       
	 }
	 public void Update() {
		
		 
		 
//          item=itemlist.get(b); 
//          for (Item i : itemlist) {
//			  if(i.equals(item)) {
//				  System.out.print("The old price: "+i.price);
//		          System.out.print("Enter the new price: ");
//		          b = sc.nextInt();
//		          item.price=b;
//		          itemlist.set(b, item);
//			  }
//          }
        
	 }
	 public void printItem() {
		 for (Item i : itemlist) {
			 System.out.println(i.name);
			 System.out.println(i.ItemsiD);
			 System.out.println(i.numberOfItems);
			 System.out.println(i.price);
			 System.out.println(i.qty);
		 }
	 }
}
