package invoicingSystemForGroceriesShop;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Item implements Serializable {

	String name;
	int ItemsiD;
	int price;
	int qty;
	int numberOfItems;
	Scanner sc = new Scanner(System.in);
	ArrayList<Invoice> invoiceList = new ArrayList<Invoice>();
	Invoice invoice = new Invoice();

	public void AddItem() {
		System.out.print("Enter item name: ");
		name = sc.next();
		System.out.print("Enter item ID: ");
		ItemsiD = sc.nextInt();
		System.out.print("Enter unit price: ");
		price = sc.nextInt();
		System.out.print("Enter quantity: ");
		qty = sc.nextInt();

	}

}
