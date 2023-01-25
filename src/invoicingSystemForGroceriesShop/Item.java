package invoicingSystemForGroceriesShop;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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

	public void AddItem() throws IOException {
		System.out.print("Enter item name: ");
		name = sc.next();
		System.out.print("Enter item ID: ");
		ItemsiD = sc.nextInt();
		System.out.print("Enter unit price: ");
		price = sc.nextInt();
		System.out.print("Enter quantity: ");
		qty = sc.nextInt();
		System.out.print("number Of Items: ");
		numberOfItems = sc.nextInt();
		BufferedWriter writer = new BufferedWriter(new FileWriter("Iteminfo.txt"));
		writer.write(name);
		writer.write(ItemsiD);
		writer.write(price);
		writer.write(qty);
		writer.write(numberOfItems);
		writer.close();

	}

}
