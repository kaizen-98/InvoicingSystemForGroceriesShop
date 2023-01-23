package invoicingSystemForGroceriesShop;

import java.util.ArrayList;

public class Invoice {


	
	    private double totalAmount;
	    private double paidAmount;
	    private double balance;
	    CustomerInfo customerInfo = new CustomerInfo();
	    ArrayList<CustomerInfo> CustomerList = new ArrayList<CustomerInfo>();
	    
		public double getTotalAmount() {
			return totalAmount;
		}

		public void setTotalAmount(double totalAmount) {
			this.totalAmount = totalAmount;
		}

		public double getPaidAmount() {
			return paidAmount;
		}

		public void setPaidAmount(double paidAmount) {
			this.paidAmount = paidAmount;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

	
		
		
	    
	   
}
