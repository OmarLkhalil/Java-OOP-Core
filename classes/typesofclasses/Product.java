package object_oriented_core.typesofclasses;

public abstract class Product {
	
	private int id; 
	private String name;
	private int winOrderQuantity;
	private boolean isDeliveryAvailable;
	
	public abstract boolean isAvailableInStock();
	
	public int getRemainingAmountInStock() {
		return 100;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWinOrderQuantity() {
		return winOrderQuantity;
	}

	public void setWinOrderQuantity(int winOrderQuantity) {
		this.winOrderQuantity = winOrderQuantity;
	}

	public boolean isDeliveryAvailable() {
		return isDeliveryAvailable;
	}

	public void setDeliveryAvailable(boolean isDeliveryAvailable) {
		this.isDeliveryAvailable = isDeliveryAvailable;
	}
	
	
	
}
