package invoicingSystemForGroceriesShop;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Shop implements Serializable {

	Scanner sc = new Scanner(System.in);
	String ShopName;
	int adress;
	String Email;
	CustomerInfo customerInfo = new CustomerInfo();
	ArrayList<CustomerInfo> CustomerList = new ArrayList<CustomerInfo>();

	public void AddShop() {
		System.out.print("Shop Settings: \n");
		System.out.print("Enter Shop name: ");
		ShopName = sc.next();
		System.out.print("Enter Shop adress: ");
		adress = sc.nextInt();
		System.out.print("Enter Shop Email: ");
		Email = sc.next();
	}

	public void printShop() {
		System.out.println("ShopName :" + ShopName);
		System.out.println("adress :" + adress);
		System.out.println("Email :" + Email);

	}

	public void printCustomer() {
		for (CustomerInfo i : CustomerList) {
			System.out.println("CustomerName :" + i.customerName);
			System.out.println("PhoneNumber :" + i.phoneNumber);
			System.out.println("invoiceDate :" + i.invoiceDate);

		}
	}
}
