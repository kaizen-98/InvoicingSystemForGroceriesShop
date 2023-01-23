package invoicingSystemForGroceriesShop;

import java.util.ArrayList;
import java.util.Scanner;



public class GroceriesShop {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  ArrayList<Invoice> invoiceList = new ArrayList<Invoice>();
	        Invoice invoice = new Invoice();

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
	                	CustomerInfo customerInfo = new CustomerInfo();
	                    System.out.print("Enter customer full name: ");
	                    String name = sc.next();
	                    customerInfo.setCustomerName(name);
	                    System.out.print("Enter customer phone number: ");
	                    int phonenu = sc.nextInt();
	                    customerInfo.setPhoneNumber(phonenu);
	                    System.out.print("Enter invoice date: ");
	                    int datenu = sc.nextInt();
	                    customerInfo.setInvoiceDate(datenu);
	                    invoice.CustomerList.add(customerInfo);
	                    break;
	                case 2:
	                	Item item = new Item();
	                    System.out.print("Enter item ID: ");
	                    int id = sc.nextInt();
	                    item.setItemsiD(id);
	                    System.out.print("Enter item name: ");
	                    String nameitem = sc.next();
	                    item.setName(nameitem);
	                    System.out.print("Enter unit price: ");
	                    double price = sc.nextDouble();
	                    item.setPrice(price);
	                    System.out.print("Enter quantity: ");
	                    int qty = sc.nextInt();
	                    item.setQty(qty);
	                    invoice.customerInfo.itemlist.add(item);
	                    break;
	                case 3:
	                    System.out.print("Enter item ID to remove: ");
	                    int a = sc.nextInt();
	                    invoice.customerInfo.removeItem(a);
	                    break;
	                case 4:
	                    System.out.print("Enter item ID to update: ");
	               //     id = sc.nextLine();
	                    System.out.print("Enter new quantity: ");
	                    qty = sc.nextInt();
	                //    invoice.updateItem(id, qty);
	                    break;
	                case 5:
	               //     invoice.printInvoice();
	                    break;
	                case 6:
	                    return;
	            }
	           // item.add(invoice);
	        }
		
		
		

	}

}
