package invoicingSystemForGroceriesShop;

public class Invoice {


		private String customerName;
		private String phoneNumber;
		private String invoiceDate;
		private int ItemsiD;
		private double price;
		private int qty;
	    private int numberOfItems;
	    private double totalAmount;
	    private double paidAmount;
	    private double balance;

	    public void setCustomerName(String customerName) {
	        this.customerName = customerName;
	    }

	    public void setPhoneNumber(String phoneNumber) {
	        this.phoneNumber = phoneNumber;
	    }

	    public void setInvoiceDate(String invoiceDate) {
	        this.invoiceDate = invoiceDate;
	    }

		public String getCustomerName() {
			return customerName;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public String getInvoiceDate() {
			return invoiceDate;
		}

		public int getNumberOfItems() {
			return numberOfItems;
		}

		public void setNumberOfItems(int numberOfItems) {
			this.numberOfItems = numberOfItems;
		}

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

		public int getItemsiD() {
			return ItemsiD;
		}

		public void setItemsiD(int itemsiD) {
			ItemsiD = itemsiD;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public int getQty() {
			return qty;
		}

		public void setQty(int qty) {
			this.qty = qty;
		}
		
		
	    
	   
}
