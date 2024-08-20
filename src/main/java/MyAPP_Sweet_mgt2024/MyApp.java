package MyAPP_Sweet_mgt2024;



import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyApp {
	
	Scanner scanner = new Scanner(System.in);
	
	private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
	
	public boolean Admin_is_loggedin;
	public boolean StoreOwner_is_loggedin;
	public boolean user_sign_up_check;
	public boolean user_sign_in_check;

	
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
	
	public User shaheen = new User("shaheen","54545454","tullkarm");
	public User hanaal = new User("hanaal","6666","nablus");
	
	
	public static ArrayList<recipes> recipess = new ArrayList<recipes>(); 
	
	recipes re1 = new recipes("dessert","bla bla");
	recipes re2 = new recipes("meat","protin");
	
	public void addrecipe(ArrayList<recipes> recipess) {
		
		recipess.add(re1);
		recipess.add(re2);
		
	}
	
	
	
	
	
	public void notlogin() {
		
		Admin_is_loggedin=false;
		
		
		System.out.print("User Name:");
		 String username = scanner.nextLine();
		 System.out.print("Enter your password: ");
		 String password = scanner.nextLine();
		 
		 if(username.equals(systemAdmin.getAdmin_name()) && password.equals(systemAdmin.getAdmin_password())) {
			 
			 this.loginAsAdmin();
			 
		 }
		 else {
			 System.out.println("invalid user name or password");
			 
			 return;
		 }
	}
	

	public void loginAdmin() {
	   
		//main log in function*********************************
		
		
		
	}



	public void invaldloginMessage() {
		System.out.println("invalid Admin user Name OR Password");
		
	}
	
	
	public  void makeProductList(ArrayList<Product> arr1) {
		
		prod1.setNumberOfSalling(5);
		prod2.setNumberOfSalling(4);
		prod3.setNumberOfSalling(8);
		
		prod1.setSugarDegree(3);
		prod2.setSugarDegree(3);
		prod3.setSugarDegree(1);
		
		
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
		shaheen.setEmail("shaheen@example.com");
		
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


	public StoreOwner storeOwnernotLogin() {
		StoreOwner storeownerr = null;
		StoreOwner_is_loggedin=false;
		this.addStoreOwnerList(this.StoreOwnerList);
		Scanner scanner2 = new Scanner(System.in);
		System.out.print("User Name:");
		String username = scanner2.nextLine();
		System.out.print("Enter your password: ");
		String password = scanner2.nextLine();
		int counter =0;
		for(StoreOwner so1 : this.StoreOwnerList) {
			if(so1.getStoreOwner_name().equals(username) && so1.getStoreOwner_password().equals(password)) {
				storeownerr = so1;
				this.loginAsStoreOwner();
				
				
			}
			
		}
		
		if(counter == this.StoreOwnerList.size()) {
			System.out.println("invalid store owner name or password");
			
		}
		
		return storeownerr;
		
		
		
		
	}


	public void loginAsStoreOwner() {
		StoreOwner_is_loggedin=true;
		
		
	}


	public boolean usernotSignUp() {
		
		user_sign_up_check=false;
		return false;
		
	}


	public boolean SignupUser(String userName, String password, String userEmal, String city) {
		if(userName==null || userName.matches("\\d+") == true ) {
			System.out.println("please enter vaild user name!");
			return false;
		}
		if(password == null || password.length()<8 ) {
			System.out.println("please enter vaild password");
			return false;
		}
		
		for(User u1 : Users) {
			if(userEmal.equals(u1.getEmail())) {
				System.out.println("this email address is already exist");
				return false;
			}
		}
		
		Pattern pattern = Pattern.compile(EMAIL_REGEX);
		Matcher matcher = pattern.matcher(userEmal);
		
		if(matcher.matches()== false) {
			System.out.println("please enter vaild email format");
			return false;
		}
		
		User newUser = new User(userName,password,city,userEmal);
		Users.add(newUser);
		return true;
	}


	public boolean checkUsernotlogin() {
		user_sign_in_check = false;
		return user_sign_in_check;
	}


	public User UserloginPage(String userName, String password) {
		User u1 =null;
		if(userName == null || userName.isEmpty() || userName.matches("\\d+") == true ) {
			System.out.println("please enter vaild user name!");
			user_sign_in_check=false;
			return u1;
		}
		for(User u2 :Users) {
		if(userName.equals(u2.getUserName())) {
		if(password == null || password.length()<8 || password.isEmpty() ||!(u2.getPassord().equals(password))) {
			System.out.println("please enter vaild password");
			user_sign_in_check=false;
			return u1;
		}
		}
		}
		
		for(User u2 : Users) {
			if(u2.getUserName().equals(userName) && u2.getPassord().equals(password)) {
				user_sign_in_check = true;
				u1=u2;
				return u1;
			}
			
		}
		
		System.out.println("this account is not found, please Sign-Up!");
		user_sign_in_check=false;
		return u1;
	}


	public boolean CheckUserLOgIn() {
		// TODO Auto-generated method stub
		return true;
	}





	public boolean browesDessert() {
		System.out.println("DessertName | price | StoreName | numberofsalling | discount");
		for(Product p1 : avalaibleProducts ) {
			System.out.println(p1.getProductName()+"  | "+p1.getPrice()+" | "+p1.getStoreNmae()+" | "+p1.getNumberOfSalling()+" | "+p1.getDiscount());
			
		}
		return true;
	}





	public boolean filterSugar(Integer sugerpercent) {
		if(sugerpercent>=1 && sugerpercent<=3) {
			System.out.println("DessertName | price | StoreName | numberofsalling | discount");
			for(Product p1 : avalaibleProducts ) {
				if(p1.getSugarDegree()==sugerpercent) {
				System.out.println(p1.getProductName()+"  | "+p1.getPrice()+" | "+p1.getStoreNmae()+" | "+p1.getNumberOfSalling()+" | "+p1.getDiscount());
				}
			}
			
			return true;
			
		}
		else {
		return false;
		}
	}





	public Product SearchonProduct(String productName) {
		if(productName == null || productName.isEmpty() || productName.matches("\\d+") == true ) {
			System.out.println("please enter valid productName!");
			return null;
		}
		
		for(Product p1 : this.avalaibleProducts) {
			
			if(p1.getProductName().equals(productName)) {
				
				return p1;
				
			}
			
		}
		
		System.out.println("productName Not Found!");
		return null;
	}



	




	
	
	


   
	
	
	

}
