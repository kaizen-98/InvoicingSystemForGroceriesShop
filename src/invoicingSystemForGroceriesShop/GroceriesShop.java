package invoicingSystemForGroceriesShop;

import java.util.Scanner;

public class GroceriesShop {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
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
	                    System.out.print("Enter customer full name: ");
	                    invoice.setCustomerName(sc.nextLine());
	                    System.out.print("Enter customer phone number: ");
	                    invoice.setPhoneNumber(sc.nextLine());
	                    System.out.print("Enter invoice date: ");
	                    invoice.setInvoiceDate(sc.nextLine());
	                    break;
	                case 2:
	                    System.out.print("Enter item ID: ");
	                    int id = sc.nextInt();
	                    invoice.setItemsiD(id);
	                    System.out.print("Enter item name: ");
	                    String name = sc.nextLine();
	                    System.out.print("Enter unit price: ");
	                    double price = sc.nextDouble();
	                    System.out.print("Enter quantity: ");
	                    int qty = sc.nextInt();
	                  
	                    break;
	                case 3:
	                    System.out.print("Enter item ID to remove: ");
	                    invoice.removeItem(sc.nextLine());
	                    break;
	                case 4:
	                    System.out.print("Enter item ID to update: ");
	                    id = sc.nextLine();
	                    System.out.print("Enter new quantity: ");
	                    qty = sc.nextInt();
	                    invoice.updateItem(id, qty);
	                    break;
	                case 5:
	                    invoice.printInvoice();
	                    break;
	                case 6:
	                    return;
	            }
	        }
		
		
		

	}

}
