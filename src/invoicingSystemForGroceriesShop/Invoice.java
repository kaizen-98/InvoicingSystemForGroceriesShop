package invoicingSystemForGroceriesShop;

public class Invoice {

	CustomeInfo customeInfo = new CustomeInfo();
		private Item[] items;
	    private int numberOfItems;
	    private double totalAmount;
	    private double paidAmount;
	    private double balance;

	    public Invoice() {
	        items = new Item[10];
	    }
	
	    public void addItem(Item item) {
	        items[numberOfItems++] = item;
	        totalAmount += item.getQtyAmount();
	    }

	   
}
