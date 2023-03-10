package invoicingSystemForGroceriesShop;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerInfo implements Serializable {

	String customerName;
	int phoneNumber;
	int invoiceDate;
	Scanner sc = new Scanner(System.in);
	Item item = new Item();
	ArrayList<Item> itemlist = new ArrayList<Item>();

	public void AddCustomer() throws IOException {
		System.out.print("Enter customer full name: ");
		customerName = sc.next();
		System.out.print("Enter customer phone number: ");
		phoneNumber = sc.nextInt();
		System.out.print("Enter invoice date: ");
		invoiceDate = sc.nextInt();
		BufferedWriter writer = new BufferedWriter(new FileWriter("Customerinfo.txt"));
		writer.write(customerName);
		writer.write(phoneNumber);
		writer.write(invoiceDate);
		writer.close();

	}

	public void RemoveItem() {
		System.out.print("Enter item ID to remove !!: ");
		int a = sc.nextInt();

		for (Item i : itemlist) {
			if (i.equals(a)) {
				itemlist.remove(a);
			}
		}
		System.out.print(" Removed:Successfuly\n ");

	}

	public void Update() {

		System.out.print("Enter the id that want change the price!");
		int b = sc.nextInt();
		item = itemlist.get(b);
		for (Item i : itemlist) {
			if (i.equals(item)) {
				System.out.print("The old price: " + i.price);
				System.out.print("Enter the new price: ");
				b = sc.nextInt();
				item.price = b;
				itemlist.set(b, item);
			}
		}

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
