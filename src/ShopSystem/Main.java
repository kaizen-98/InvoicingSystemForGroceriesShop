package ShopSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

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
				invoice.AddCustomer();
				invoice.Customerlist.add(invoice);
				break;
			case 2:
				invoice.AddItem();
				invoice.Itemlist.add(invoice);
				break;
			case 3:
				invoice.RemoveItem();
				break;
			case 4:

				break;
			case 5:
				// invoice.printInvoice();
				break;
			case 6:
				return;
			}
			invoiceList.add(invoice);

			// item.add(invoice);
		}

	}

}
