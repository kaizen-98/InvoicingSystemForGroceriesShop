package ShopSystem;

import java.util.ArrayList;
import java.util.Scanner;

import invoicingSystemForGroceriesShop.Item;



public class Invoice {

	  Scanner sc = new Scanner(System.in);
	  ArrayList<Invoice> Customerlist = new ArrayList<Invoice>();
	  ArrayList<Invoice> Itemlist = new ArrayList<Invoice>();
	  
	 String customerName;
	 int phoneNumber;
	 int invoiceDate;
	 String ItemName;
	 int ItemsiD;
	 int price;
	 int qty;
	 int numberOfItems;
	 int totalAmount;
	 
	 public void AddCustomer() {
		 System.out.print("Enter customer full name: ");
		 customerName = sc.next();
         System.out.print("Enter customer phone number: ");
          phoneNumber = sc.nextInt();
         System.out.print("Enter invoice date: ");
          invoiceDate = sc.nextInt();
        
	 }
	 public void AddItem() {
         System.out.print("Enter item name: ");
         ItemName = sc.next();
         System.out.print("Enter item ID: ");
         ItemsiD = sc.nextInt();
         System.out.print("Enter unit price: ");
         price = sc.nextInt();
         System.out.print("Enter quantity: ");
         qty = sc.nextInt();
       
	 }
	 public void RemoveItem() {
		  System.out.print("Enter item ID to remove: ");
          int a = sc.nextInt();
          Itemlist.get(a);
          Itemlist.remove(a);
        
	 }
}
