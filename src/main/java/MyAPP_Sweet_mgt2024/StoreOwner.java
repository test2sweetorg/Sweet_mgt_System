package MyAPP_Sweet_mgt2024;

import java.time.LocalDate;
import java.util.ArrayList;

public class StoreOwner {
	
	public String StoreOwner_name;
	public String StoreOwner_password;
	public String StoreCity;
	public String StoreName;
	
	public boolean addproductsuccessfuly;
	public boolean updateproductseccessfully;
	
	public boolean checkMonitorProfit;
	public boolean checkMonitorProfit_daliy;
    public boolean checkMonitorProfit_monthly;
    public boolean checkMonitorProfit_Yearly;
    
    public boolean ShowBestSelling;
    
    ArrayList<String>userMessage=new ArrayList<String>();
    
    public boolean massegeSentToUser;
    public boolean massegeSentToSupplier;
    public boolean veiwMassegesHistory;
    
    
    public boolean account_mgt_check;
    

	public StoreOwner(String storeOwner_name, String storeOwner_password,String storecity) {
		this.StoreOwner_name=storeOwner_name;
		this.StoreOwner_password=storeOwner_password;
		this.StoreCity=storecity;
		
	}
	
	public StoreOwner(String storeOwner_name, String storeOwner_password) {
		this.StoreOwner_name=storeOwner_name;
		this.StoreOwner_password=storeOwner_password;
	}

	
	public String getStoreOwner_name() {
		return StoreOwner_name;
	}

	public void setStoreOwner_name(String storeOwner_name) {
		StoreOwner_name = storeOwner_name;
	}

	public String getStoreOwner_password() {
		return StoreOwner_password;
	}

	public void setStoreOwner_password(String storeOwner_password) {
		StoreOwner_password = storeOwner_password;
	}
	
	public void setStoreCity(String storeCity) {
		StoreCity = storeCity;
	}
	
	public String getStoreCity() {
		return StoreCity;
	}
	
	

	public String getStoreName() {
		return StoreName;
	}

	public void setStoreName(String storeName) {
		StoreName = storeName;
	}

	public void invaildproduct() {
	   addproductsuccessfuly = false;
		
	}

	public void addnewProduct(Product prod1) {
		addproductsuccessfuly=true;
		MyApp.avalaibleProducts.add(prod1);
		
	}

	public boolean deleteProduct(String productName) {
		
		
		int index=0;
		
		for(Product p1 : MyApp.avalaibleProducts) {
		
			if(p1.getProductName().equals(productName)) {
				
				MyApp.avalaibleProducts.remove(index);
				return true;
					
			}
			index++;
		}
		
		return false;
	}

	public int serchOnAProduct(String oldname) {
		int index =0;
		
		for(Product p1 : MyApp.avalaibleProducts) {
			if(p1.getProductName().equals(oldname)) {
				return index;
			}
			index++;
		}
		return -1;
		
		
	}

	public void invalidupdate() {
		updateproductseccessfully =false;
		
	}

	public void validupdateProduct() {
		updateproductseccessfully =true;
		
	}

	public void updateproductName(int productfountindex, String newname) {
		MyApp.avalaibleProducts.get(productfountindex).setProductName(newname);
		
	}

	public void updateproductPrice(int productfountindex, double price1) {
		MyApp.avalaibleProducts.get(productfountindex).setPrice(price1);
		
	}

	public void monitorSelesCheck() {
		
		checkMonitorProfit=true;
		
	}

	public void moitordailyProfitCheck() {
		checkMonitorProfit_daliy= true;
		
	}

	public void printDailyprofit(int year, int month , int day) {
		System.out.println("ProductName | StoreName | price | profit");
		for( Product p1 : MyApp.salledProduct) {
			if(p1.getSaleDate().getYear() == year && p1.getSaleDate().getMonthValue()==month && p1.getSaleDate().getDayOfMonth()==day &&p1.getStoreNmae().equals(this.StoreName)) {
				System.out.println(p1.getProductName()+" | "+p1.getStoreNmae()+" | "+p1.getPrice()+" | "+(p1.getPrice()-p1.getCostPrice()));
			}
		}
		
	}

	public void moitorMonthlyProfitCheck() {
		checkMonitorProfit_monthly= true;
		
	}

	public void printMonthlyprofit(int year, int month) {
		
		System.out.println("ProductName | StoreName | price | profit");
		for( Product p1 : MyApp.salledProduct) {
			if(p1.getSaleDate().getYear() == year && p1.getSaleDate().getMonthValue()==month &&p1.getStoreNmae().equals(this.StoreName)) {
				System.out.println(p1.getProductName()+" | "+p1.getStoreNmae()+" | "+p1.getPrice()+" | "+(p1.getPrice()-p1.getCostPrice()));
			}
		}
		
		
	}

	public void moitorYearlyProfitCheck() {
		checkMonitorProfit_Yearly= true;
		
	}

	public void printYearlyprofit(int year) {
		
		System.out.println("ProductName | StoreName | price | profit");
		for( Product p1 : MyApp.salledProduct) {
			if(p1.getSaleDate().getYear() == year &&p1.getStoreNmae().equals(this.StoreName)) {
				System.out.println(p1.getProductName()+" | "+p1.getStoreNmae()+" | "+p1.getPrice()+" | "+(p1.getPrice()-p1.getCostPrice()));
			}
		}
		
	}

	public void ShowBestSellingCheck() {
		ShowBestSelling= true;
		
	}

	public Product getBestSellingProducts(String StoreName) {
		 Product bestProduct = null;
		 

		    for (Product p : MyApp.avalaibleProducts) {
		        if (p.getStoreNmae().equals(StoreName)) {
		            if (bestProduct == null|| p.getNumberOfSalling() > bestProduct.getNumberOfSalling()) {
		                bestProduct = p;
		                
		            }
		        }
		    }

		    return bestProduct;
	}

	public boolean Discount(String productName, double discount) {
		int index = -1;
		
		index = serchOnAProduct(productName);
		if(index == -1)
		return false;
		else {
			MyApp.avalaibleProducts.get(index).setDiscount(discount);
			return true;
		}
	}
	
	public int searchofUser(String userName) {
		int index =0;
		for(User u1 : MyApp.Users) {
			if(u1.getUserName().equals(userName)) {
				return index;
			}
			index++;
		}
		
		return -1;
	}

	public void sendmassegeToUser(String userName, String message) {
		int index =searchofUser(userName);
		if(index == -1) {
			massegeSentToUser= false;
		}
		else {
			String sentMessage ="From :"+ this.getStoreOwner_name()+"TO :"+userName+", message";
			MyApp.Users.get(index).messages.add(sentMessage);
			this.userMessage.add(sentMessage);
			
			massegeSentToUser= true;
			
		}
		
		
	}
	
	public int searchofSupplier(String supplierName ) {
		int index =0;
		
		for(Supplier s1: MyApp.SupplierList) {
			if(s1.getSupplierName().equals(supplierName)) {
				return index;
			}
			index++;
		}
		
		return -1;
	}

	public void sendmessageToSupplier(String supplierName, String message) {
		int index = searchofSupplier(supplierName);
		
		if(index == -1) {
			
			massegeSentToSupplier=false;
			
		}
		
		else {
			
			String sentMessage ="From :"+ this.getStoreOwner_name()+"TO :"+supplierName+", message";
			MyApp.SupplierList.get(index).messages.add(sentMessage);
			this.userMessage.add(sentMessage);
			
			massegeSentToSupplier=true;
			
		}
		
	}

	public void showMessagesStoreOwner() {
		veiwMassegesHistory=true;
		for(String s1 : this.userMessage ) {
			System.out.println(s1);
			
		}
		
		
	}

	public void accountMangementCheck() {
		account_mgt_check= true;
		
	}

	public boolean manageStoreName(String newStoreName) {
		if(newStoreName.equals(null)) {
			System.out.println("please Enter valid new name ");
			return false;
		}else {
		for(StoreOwner s1 : MyApp.StoreOwnerList) {
			if(s1.getStoreName().equals(newStoreName)) {
				System.out.println("this name exist in the Stores list");
				return false;
				
			}
			
		}
		
		this.setStoreName(newStoreName);
		return true;
	}
		
  }
	

	
	
	

	public boolean manageStoreOwnerName(String newStoreOwnerName) {
		if(newStoreOwnerName==null) {
			System.out.println("invalid new Stroe Owner Name");
			return false;
		}else {
			this.setStoreOwner_name(newStoreOwnerName);
			return true;
			
			
		}
			
	}

	public boolean manegeStroeOwnerPassword(String newPassword) {
		if(newPassword==null) {
			System.out.println("invalid new Stroe Owner password");
			return false;
		}else {
			
			this.setStoreOwner_password(newPassword);
			return true;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
