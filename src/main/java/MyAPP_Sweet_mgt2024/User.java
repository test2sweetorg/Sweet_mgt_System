package MyAPP_Sweet_mgt2024;

import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
	
	 private static final Pattern NUMBER_PATTERN = Pattern.compile(".*\\d.*");
	
	private String userName;
	private String passord;
	private String city;
	private String feedback;
	private String Email;
	public ArrayList<String>messages = new ArrayList<String>();
	private  ArrayList<Product> Shoppingcard = new ArrayList<Product>();
	
	public boolean massegeSentToStoreOwner;
	
	
	
	
	
	
	
	

	


	public User(String userName, String passord, String city, String email) {
		
		this.userName = userName;
		this.passord = passord;
		this.city = city;
		Email = email;
		feedback="";
	}


	public User(String userName, String passord,String city) {
		
		this.userName = userName;
		this.passord = passord;
	
		this.city = city;
		feedback="";
	}
	
	public ArrayList<Product> getShoppingcard() {
		return Shoppingcard;
	}
	
	public void addtoshoppinglist(Product p2) {
		
		this.Shoppingcard.add(p2); 
		
	}
	
	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassord() {
		return passord;
	}

	public void setPassord(String passord) {
		this.passord = passord;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}


	public boolean checkUserManagmentInfo() {
		// TODO Auto-generated method stub
		return true;
	}


	public boolean updateUserName(String newUserName) {
		if(newUserName == null || newUserName.isEmpty() || newUserName.matches("\\d+") == true ) {
			System.out.println("please enter valid new name");
			return false;
		}
		
		for(User u1 : MyApp.Users) {
			if(u1.getUserName().equals(newUserName)) {
				System.out.println("This name is already exist");
				return false;
			}
		}
		
		this.setUserName(newUserName);
		return true;
	}


	public boolean UpdateUserPassword(String newPssword) {
		if(newPssword == null || newPssword.isEmpty()|| newPssword.length()<8) {
			System.out.println("please enter valid password");
			return false;
		}
		 this.setPassord(newPssword);
		 return true;
	}


	public boolean UpdateUserCity(String newCity) {
		
		if(newCity == null) {
			System.out.println("please enter valid new city");
			return false;
		}
		Matcher matcher = NUMBER_PATTERN.matcher(newCity);
		if(newCity.isEmpty() || matcher.matches() == true ) {
			System.out.println("please enter valid new city");
			return false;
		}
		
		this.setCity(newCity);
		return true;
	}


	public boolean addrecipes(String recipeName, String discription) {
		if(recipeName == null || recipeName.isEmpty()) {
			System.out.println("please enter a valid recipe name");
			return false;
			
		}
		if(discription == null || discription.isEmpty()) {
			System.out.println("please enter a valid recipe discription");
			return false;
		}
		recipes recipe1 = new recipes(recipeName,discription);
		MyApp.recipess.add(recipe1);
		return true;
	}


	public boolean checkShoppingButton() {
		// TODO Auto-generated method stub
		return true;
	}


	public boolean addproducttoShoppingcard(Product p1) {
		
		if(p1 == null)
		return false;
		
		this.addtoshoppinglist(p1);
		return true;
	}


	public Product searchOnProductFromShoppingCard(String productName) {
		if(productName == null || productName.isEmpty() || productName.matches("\\d+") == true ) {
			System.out.println("please enter valid productName!");
			return null;
		}
		
		for(Product p1 : this.Shoppingcard) {
			
			if(p1.getProductName().equals(productName)) {
				
				return p1;
				
			}
			
		}
		
		System.out.println("productName Not Found!");
		return null;
	}


	public boolean deleteProductFromShoppingCard(Product p1) {
		
		if(p1==null)
		return false;
		
		this.Shoppingcard.remove(p1);
		return true;
	}


	public boolean buy() {
		if(this.Shoppingcard.isEmpty())
		return false;
		
		
		Orders or1;
		Random random = new Random();
		int randomInt;
		
		for(Product p1 : this.Shoppingcard) {
			randomInt = random.nextInt();
			or1= new Orders(randomInt,p1,this);
			StoreOwner.userOrders.add(or1);
			
			
		}
		return true;
	}
	
	
	public int searchofStoreOwner(String StoreOwnerName) {
		int index =0;
		for(StoreOwner u1 : MyApp.StoreOwnerList) {
			if(u1.getStoreOwner_name().equals(StoreOwnerName)) {
				return index;
			}
			index++;
		}
		
		return -1;
	}


	public void sendmassegeToStoreOwner(String storeOwnerName, String message) {
		
		int index =searchofStoreOwner(storeOwnerName);
		if(index == -1) {
			massegeSentToStoreOwner= false;
		}
		else {
			String sentMessage ="From :"+ this.getUserName()+"TO :"+storeOwnerName+":"+ message;
			MyApp.StoreOwnerList.get(index).userMessage.add(sentMessage);
			this.messages.add(sentMessage);
			
			massegeSentToStoreOwner= true;
			
		}
		
	}


	public boolean showMessagesUser() {
		if(this.messages.isEmpty())
			return false;
		for(String s1 : this.messages ) {
			System.out.println(s1);
			
		}
		return true;
	}


	public boolean addFeedback(String feedback2) {
		if(feedback2 == null || feedback2.isEmpty())
			return false;
		
		this.setFeedback(feedback2);
		return true;
		
		
	}


	public void viewShoppingCard() {
		for(Product p1: this.Shoppingcard) {
			System.out.println(p1.toString());
		}
		
	}
	
	
	
	
	
	
	
	
	
	

}
