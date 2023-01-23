package invoicingSystemForGroceriesShop;

public class Item {

	private String name;
	private int ItemsiD;
	private double price;
	private int qty;
    private int numberOfItems;
    
    
    
    
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
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
