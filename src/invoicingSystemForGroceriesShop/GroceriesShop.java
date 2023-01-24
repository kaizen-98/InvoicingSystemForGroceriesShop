package invoicingSystemForGroceriesShop;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceriesShop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Shop shop = new Shop();
		CustomerInfo customerInfo = new CustomerInfo();
		while (true) {
			System.out.println("1. Enter Shop information");
			System.out.println("2. Enter customer information");
			System.out.println("3. Add item to invoice");
			System.out.println("4. Remove item from invoice");
			System.out.println("5. Update item price");
			System.out.println("6. calculate price");
			System.out.println("7. Print invoice");
			System.out.println("8. Exit");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:

				shop.AddShop();
				break;
			case 2:

				customerInfo.AddCustomer();
				shop.CustomerList.add(customerInfo);
				break;
			case 3:
				Item item = new Item();
				item.AddItem();
				shop.customerInfo.itemlist.add(item);
				break;
			case 4:
				shop.customerInfo.RemoveItem();
				break;
			case 5:
				System.out.print("Enter item ID to update: ");
				int b = sc.nextInt();
				shop.customerInfo.Update();
				shop.CustomerList.add(customerInfo);
				break;
			case 6:
				shop.printCustomer();
				shop.customerInfo.printItem();
				break;
			case 7:
				return;
			}

		}

	}

}
