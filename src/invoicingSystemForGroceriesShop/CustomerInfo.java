package invoicingSystemForGroceriesShop;

import java.util.ArrayList;

public class CustomerInfo {


	private String customerName;
	private int phoneNumber;
	private int invoiceDate;
		Item item = new Item();
	  ArrayList<Item> itemlist = new ArrayList<Item>();
	  
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

	public String getCustomerName() {
		return customerName;
	}

	
	  public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(int invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public void removeItem(int a) {
		  itemlist.remove(a);
		  return;
	  }
	
}
