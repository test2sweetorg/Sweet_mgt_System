package MyAPP_Sweet_mgt2024;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import MyAPP_Sweet_mgt2024.StoreOwner;

public class Admin {
	
	public String admin_name;
	public String admin_password;
	public boolean addSupplier;
	public boolean deleteSupplier;
	
	public static boolean storeOwnerFound;
	public static boolean supplierFound;
	public static boolean addstoreOwner;
	public static boolean deleteStoreOwner;
	public static boolean editStoreOwner;
	public static boolean editName;
	public static boolean editPassword;
	
	//***************************************
	public boolean monitorProfit;
	public boolean daliyProfitSelect;
	public boolean monthProfitSelect;
	public boolean yearProfitSelect;
	
	//******************************************
	public boolean showBest_SellingBroduct;
	
	
	//*******************
	public boolean showStatisticsUser;
	
	///*************
	public boolean showfeedbacks;
    
	
	
	
	
	
	
	
	
	public Admin(String username, String password) {
		admin_name=username;
		admin_password=password;
		
		
		//*******************************
		
		
	}

	public String getAdmin_name() {
		return admin_name;
	}

	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}

	public String getAdmin_password() {
		return admin_password;
	}

	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}

	public void show_dashbord() {
		// TODO Auto-generated method stub
		
	}

	public void create_storeOwner(StoreOwner so1 ) {
		// to add new store owner
		MyApp.StoreOwnerList.add(so1);
		
	}

	public void showConfirmationMessage() {
		System.out.println("storeOwner account created successfuly"); 
		
	}

	public int searchStoreOwner(String storeOwnerName) {
	
		for(int i=0;i<MyApp.StoreOwnerList.size();i++) {
			if(MyApp.StoreOwnerList.get(i).getStoreOwner_name().equals(storeOwnerName)) {
				storeOwnerFound=true;
				return i;
			}
			
		}
		return -1;
		
		
	}

	public void deletStoreOwner(int index) {
		
			MyApp.StoreOwnerList.remove(index);
			
		
	}

	public void deleteStoreOwnerMessage() {
		
		if(storeOwnerFound) {
			System.out.println("this Account was deleted successfully");
		} 
			
		
		
	}

	public void deleteStoreOwnerFaildMessage() {
		
		if(!storeOwnerFound) {
		System.out.println("this Account is not found");
		}
		
	}

	public void updateStoreOwnerName(String newname,int index) {


		
		MyApp.StoreOwnerList.get(index).setStoreOwner_name(newname);
		
	}

	public void ShowUpdateStoreOwnerNameMessage() {
		System.out.println("the store owner name updated successfully");
		
	}

	public void invalidUpdateStoreOwnerMessage() {
		System.out.println("Store Owner  update faild");
		
	}

	public void deleteStoreOwnerFunction() {
		
		deleteStoreOwner=true;
		
	}

	public void addStoreOwnertoList(StoreOwner so1) {
		MyApp.StoreOwnerList.add(so1);
		
	}

	public void addSupplier(Supplier s1) {
		MyApp.SupplierList.add(s1);
		
	}

	public void deleteSupplierrFunction() {
		
		deleteSupplier=true;
		
	}

	public int serchSupplier(String suppliername) {
		for(int i=0;i<MyApp.SupplierList.size();i++) {
			if(MyApp.SupplierList.get(i).getSupplierName().equals(suppliername)) {
				supplierFound=true;
				return i;
			}
			
		}
		return -1;
	}

	public void deleteSuppler(int index) {
		// TODO Auto-generated method stub
		
		MyApp.SupplierList.remove(index);
	}

	public void deleteSupplierfaildMessage() {
		
		System.out.println("this account not found");
		
		
	}
	
	//*****************************************

	public void printDalyProfit(int year , int month , int day) {
		System.out.println("ProductName | price | profit");
		for( Product p1 : MyApp.salledProduct) {
			if(p1.getSaleDate().getYear() == year && p1.getSaleDate().getMonthValue()==month && p1.getSaleDate().getDayOfMonth()==day) {
				System.out.println(p1.getProductName()+" | "+p1.getPrice()+" | "+(p1.getPrice()-p1.getCostPrice()));
			}
		}
		
	}

	public void printMonthProfit(int year,int month) {
		
		System.out.println("ProductName | price | profit");
		for( Product p1 : MyApp.salledProduct) {
			if(p1.getSaleDate().getYear() == year && p1.getSaleDate().getMonthValue()==month) {
				System.out.println(p1.getProductName()+" | "+p1.getPrice()+" | "+(p1.getPrice()-p1.getCostPrice()));
			}
		}
	
		
	}

	public void printYearProfit(int year) {
		System.out.println("ProductName | price | profit");
		for( Product p1 : MyApp.salledProduct) {
			if(p1.getSaleDate().getYear() == year) {
				System.out.println(p1.getProductName()+" | "+p1.getPrice()+" | "+(p1.getPrice()-p1.getCostPrice()));
			}
		}
		
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

	public void showbestSelling() {
		showBest_SellingBroduct =true;
		
	}

	public void showStatisticsCheck() {
		showStatisticsUser= true;
		
	}

	public void showStaistics() {
		// TODO Auto-generated method stub
		
	}

	public void showFeedBack() {
		ArrayList<User> users =MyApp.Users;
		
		for(User u1 : users) {
			if(u1.getFeedback()!="") {
				
			    System.out.println(u1.getUserName()+":"+u1.getFeedback());
			    showfeedbacks=true;
			 
			}
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
