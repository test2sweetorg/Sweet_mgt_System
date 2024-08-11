package MyAPP_Sweet_mgt2024;

import java.util.ArrayList;

public class MyApp {
	
	public boolean Admin_is_loggedin;
	public boolean StoreOwner_is_loggedin;
	
	public static Admin systemAdmin = new Admin("malik","123456");
	public static ArrayList<StoreOwner> StoreOwnerList = new ArrayList<StoreOwner>();
	
	public StoreOwner SO1= new StoreOwner("tariq","123666","kafarqaddum");
	public StoreOwner SO2= new StoreOwner("sameh","14144","nablus");
	
	
	
	
	
	
	
	public static ArrayList<Supplier> SupplierList = new ArrayList<Supplier>();
	
	public Supplier s1 = new Supplier("kaser","777");
	public Supplier s2 = new Supplier("fathi","6667");
	
	
	
	
	
	
	

	public static ArrayList<Product> avalaibleProducts = new ArrayList<Product>();
	
	public Product prod1 = new Product("prod1","StoreA",20);
	public Product prod2 = new Product("prod2","StoreA",30);
	public Product prod3 = new Product("prod3","StoreA",50);
	
	
	public Product prod4 = new Product("prod1","StoreB",20);
	public Product prod5 = new Product("prod2","StoreB",30);
	public Product prod6 = new Product("prod3","StoreB",50);
	
	public static ArrayList<Product> salledProduct = new ArrayList<Product>();
	
	
	
	
	
	
	public static ArrayList<User> Users=new ArrayList<User>();
	
	public User shaheen = new User("shaheen","5454","tullkarm");
	public User hanaal = new User("hanaal","6666","nablus");
	
	
	
	
	
	public void notlogin() {
		
		Admin_is_loggedin=false;
	}
	

	public void loginAdmin() {
	   
		//main log in function
		
		
		
	}



	public void invaldloginMessage() {
		System.out.println("invalid Admin user Name OR Password");
		
	}
	
	
	public void makeProductList(ArrayList<Product> arr1) {
		
		prod1.setNumberOfSalling(5);
		prod2.setNumberOfSalling(4);
		prod3.setNumberOfSalling(8);
		
		arr1.add(prod1);
		arr1.add(prod2);
		arr1.add(prod3);
		
		prod4.setNumberOfSalling(4);
		prod5.setNumberOfSalling(5);
		prod6.setNumberOfSalling(1);
		
		arr1.add(prod4);
		arr1.add(prod5);
		arr1.add(prod6);
		
		
	}



	public void loginAsAdmin() {
		
		Admin_is_loggedin=true;
		
	}
	
	
	public void adduserList(ArrayList<User> users) {
		shaheen.setFeedback("nice project work");
		hanaal.setFeedback("you are amazing team");
		
		users.add(shaheen);
		users.add(hanaal);
		
	}
	
	public void addStoreOwnerList(ArrayList<StoreOwner> storeOwners) {
		SO1.setStoreName("StoreA");
		SO2.setStoreName("StoreB");
		storeOwners.add(SO1);
		storeOwners.add(SO2);
		
	}
	
	public void addSupplierList(ArrayList<Supplier> Suppliers) {
		Suppliers.add(s1);
		Suppliers.add(s2);
	}
	
	
	//***********StroeOwner


	public void storeOwnernotLogin() {
		StoreOwner_is_loggedin=false;
		
	}


	public void loginAsStoreOwner() {
		StoreOwner_is_loggedin=true;
		
	}



	




	
	
	


   
	
	
	

}
