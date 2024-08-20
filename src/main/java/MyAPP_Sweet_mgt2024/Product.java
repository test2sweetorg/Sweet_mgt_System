package MyAPP_Sweet_mgt2024;

import java.time.LocalDate;

public class Product {
	
	public String productName;
	public String StoreNmae;
	public int numberOfSalling;
	public double price;
	public double costPrice;
	private LocalDate saleDate;
	private double discount;
	private  int sugarDegree;
	
	
	
	
	





	public Product(String productName, String storeNmae, double price) {
		
		this.productName = productName;
		StoreNmae = storeNmae;
		this.numberOfSalling=0;
		this.discount=0.0;
		this.price=price;
		this.sugarDegree=0;
	}
	
	
	
	
	
	public int getSugarDegree() {
		return sugarDegree;
	}





	public void setSugarDegree(int sugarDegree) {
		this.sugarDegree = sugarDegree;
	}





	public Product(String productName, String storeNmae, double price, double costPrice) {
		super();
		this.productName = productName;
		StoreNmae = storeNmae;
		this.price = price;
		this.costPrice = costPrice;
		this.numberOfSalling=0;
		this.discount=0.0;
		
	}
	
	public double getDiscount() {
		return discount;
	}





	public void setDiscount(double discount) {
		this.discount = discount;
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





	public double getCostPrice() {
		return costPrice;
	}





	public void setCostPrice(double costPrice) {
		this.costPrice = costPrice;
	}





	public LocalDate getSaleDate() {
		return saleDate;
	}





	public void setSaleDate(LocalDate saleDate) {
		this.saleDate = saleDate;
	}





	@Override
	public String toString() {
		return "Product [productName=" + productName + ", StoreNmae=" + StoreNmae + ", numberOfSalling="
				+ numberOfSalling + ", price=" + price + "]";
	}
	
	
	
	
	

}
