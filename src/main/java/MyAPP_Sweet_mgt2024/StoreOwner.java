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
    
    public ArrayList<String>userMessage=new ArrayList<String>();
    
    public boolean massegeSentToUser;
    public boolean massegeSentToSupplier;
    public boolean veiwMassegesHistory;
    
    
    public boolean account_mgt_check;
    
    
    public static ArrayList<Orders> userOrders = new ArrayList<Orders>();
    Product p1 =new Product("prd1","StoreA",20.0);
    Product p2 =new Product("prd2","StoreA",25.0);
    User u1 = new User("ahmad","125","jeit");
    Orders ord1 = new Orders(123,p1,u1);
    Orders ord2 = new Orders(1234,p2,u1);
    
    
    
    
    
    

	public StoreOwner(String storeOwner_name, String storeOwner_password,String storecity) {
		this.StoreOwner_name=storeOwner_name;
		this.StoreOwner_password=storeOwner_password;
		this.StoreCity=storecity;
		
	}
	
	public StoreOwner(String storeOwner_name, String storeOwner_password) {
		this.StoreOwner_name=storeOwner_name;
		this.StoreOwner_password=storeOwner_password;
	}
	
	public void makeOrderList(ArrayList<Orders> orderlist) {
		orderlist.add(ord1);
		orderlist.add(ord2);
		
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
		System.out.println("invalid product add");
	   this.addproductsuccessfuly = false;
		
	}

	public void addnewProduct(String productname, String StoreName, double price) {
		
		if(productname == null || productname.isEmpty() || StoreName == null || StoreName.isEmpty() ||price == 0.0 ) {
			this.invaildproduct();
			return;
		}
		
		
		for(Product p1 : MyApp.avalaibleProducts) {
			if(p1.getProductName().equals(productname) && p1.getStoreNmae().equals(StoreName)) {
				this.invaildproduct();
				 return;
				
			}
			
			
		}
		Product pro = new Product(productname,StoreName,price);
			this.addproductsuccessfuly=true;
			MyApp.avalaibleProducts.add(pro);
		
		
	}

	public boolean deleteProduct(String productName) {
		
		if(productName == null || productName.isEmpty()) {
			System.out.println("invalid product name");
			return false;
		}
		
		int index=0;
		
		for(Product p1 : MyApp.avalaibleProducts) {
		
			if(p1.getProductName().equals(productName)) {
				
				MyApp.avalaibleProducts.remove(index);
				return true;
					
			}
			index++;
		}
		System.out.println("the product you need to remove does not exist");
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
		System.out.println("invalid update product");
		updateproductseccessfully =false;
		
	}

	public void validupdateProduct() {
		System.out.println("the  updated successfully");
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
		if(year ==0 || month==0 || day ==0) {
			System.out.println("invalid date");
			return;
		}
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
		if(year ==0 || month==0 ) {
			System.out.println("invalid date");
			return;
		}
		
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
		if(year ==0) {
			System.out.println("invalid date");
			return;
		}
		
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
		    if(StoreName ==null || StoreName.isEmpty()) {
		    	System.out.println("enter valid store name");
		    }

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
		if(index == -1) {
			System.out.println("invalid product name");
		return false;
		}
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
			System.out.println("user name not found in the system");
			massegeSentToUser= false;
		}
		else {
			String sentMessage ="From :"+ this.getStoreOwner_name()+"TO :"+userName+":"+ message;
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
		if(this.userMessage.isEmpty()) {
			veiwMassegesHistory=false;
			System.out.println("the message history is empty");
		}
		else {
		veiwMassegesHistory=true;
		for(String s1 : this.userMessage ) {
			System.out.println(s1);
			
		}
		}
		
	}

	public void accountMangementCheck() {
		account_mgt_check= true;
		
	}

	public boolean manageStoreName(String newStoreName) {
		if(newStoreName==null || newStoreName.isEmpty() ) {
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
		if(newStoreOwnerName==null || newStoreOwnerName.isEmpty()) {
			System.out.println("invalid new Stroe Owner Name");
			return false;
		}else {
			this.setStoreOwner_name(newStoreOwnerName);
			return true;
			
			
		}
			
	}

	public boolean manegeStroeOwnerPassword(String newPassword) {
		if(newPassword==null || newPassword.isEmpty() ) {
			System.out.println("invalid new Stroe Owner password");
			return false;
		}else {
			
			this.setStoreOwner_password(newPassword);
			return true;
		}
		
	}

	public boolean viewOrders() {
		if(this.userOrders.isEmpty()) {
			System.out.println("there is no orders");
			return false;
		}else {
			System.out.println("OrderID | userName | product name | price | statues");
			for (Orders o1 : this.userOrders) {
				if(this.getStoreName().equals(o1.getProduct().getStoreNmae())) {
					System.out.println(o1.getOrderId()+" | "+o1.getU1().getUserName()+" | "+o1.getProduct().getProductName()+" | "+o1.getProduct().getPrice()+" | "+o1.isStatusOfOrder());
				}
			}
		
		
		return true;
		}
	}

	public boolean changeOrderStatus(Integer orderId) {
		if(this.userOrders.isEmpty()) {
			System.out.println("the order list is empty");
			return false;
		}
		for(Orders o2 : this.userOrders) {
			if(o2.getOrderId() == orderId) {
				o2.setStatusOfOrder(true);
				return true;
			}
		}
		System.out.println("this order ID is not found");
		return false;
	}

	public boolean deleteOrder(Integer orderid) {
		if(this.userOrders.isEmpty()) {
			System.out.println("the order list is empty");
			return false;
		}
		for(Orders o2 : this.userOrders) {
			if(o2.getOrderId() == orderid) {
				this.userOrders.remove(o2);
				return true;
			}
		}
		
		
		System.out.println("this order ID is not found");
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
