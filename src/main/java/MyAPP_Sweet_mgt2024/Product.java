package MyAPP_Sweet_mgt2024;

public class Product {
	
	public String productName;
	public String StoreNmae;
	public int numberOfSalling;
	public double price;
	public Product(String productName, String storeNmae,double price) {
		
		this.productName = productName;
		StoreNmae = storeNmae;
		this.numberOfSalling=0;
		this.price=price;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getStoreNmae() {
		return StoreNmae;
	}
	public void setStoreNmae(String storeNmae) {
		StoreNmae = storeNmae;
	}
	public int getNumberOfSalling() {
		return numberOfSalling;
	}
	public void setNumberOfSalling(int numberOfSalling) {
		this.numberOfSalling = numberOfSalling;
	}
	
	

}
