package invoicingSystemForGroceriesShop;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class GroceriesShop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Shop shop = new Shop();
		CustomerInfo customerInfo = new CustomerInfo();
		Item item = new Item();
		while (true) {
			System.out.println("1. Enter Shop information!");
			System.out.println("2. Enter customer information!");
			System.out.println("3. Add item to invoice!");
			System.out.println("4. Remove item from invoice!");
			System.out.println("5. Update item price!");
			System.out.println("6. Calculate price!");
			System.out.println("7. Print  All invoice!");
			System.out.println("8. Exit!");

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
				shop.customerInfo.item.invoice.calculate();

				break;
			case 7:
				System.out.println("1. Shop Details \n ");
				shop.printShop();
				System.out.println("2.Customer Details \n");
				shop.printCustomer();
				System.out.println("3. Item Details \n");
				shop.customerInfo.printItem();
				break;
			case 8:
				System.out.println("Thanks for Using our services");
				return;
			}

		}

	}

}
