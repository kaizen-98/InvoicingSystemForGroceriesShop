package invoicingSystemForGroceriesShop;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Invoice implements Serializable {

	Scanner sc = new Scanner(System.in);
	int totalAmount;
	int a;
	int b;

	public void calculate() {
		System.out.println("Enter frist price  ");
		a = sc.nextInt();
		System.out.println("Enter second price  ");
		b = sc.nextInt();
		totalAmount = a + b;
		System.out.println("  Total Amount you spent is: " + totalAmount);
	}

}
