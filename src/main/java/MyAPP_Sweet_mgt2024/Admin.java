package MyAPP_Sweet_mgt2024;

import java.util.ArrayList;
import java.util.logging.Logger;





public class Admin {
	
	private static final Logger logger = Logger.getLogger(Admin.class.getName());
	private String adminName;
	private String adminPassword;
	private boolean addSuppliervariable;
	public boolean isAddSupplier() {
		return addSuppliervariable;
	}

	public void setAddSupplier(boolean addSupplier) {
		this.addSuppliervariable = addSupplier;
	}




	private boolean deleteSupplier;
	
	public boolean isDeleteSupplier() {
		return deleteSupplier;
	}

	public void setDeleteSupplier(boolean deleteSupplier) {
		this.deleteSupplier = deleteSupplier;
	}




	private static boolean storeOwnerFound;
	public static boolean isStoreOwnerFound() {
		return storeOwnerFound;
	}

	public static void setStoreOwnerFound(boolean storeOwnerFound) {
		Admin.storeOwnerFound = storeOwnerFound;
	}




	private static boolean supplierFound;
	public static boolean isSupplierFound() {
		return supplierFound;
	}

	public static void setSupplierFound(boolean supplierFound) {
		Admin.supplierFound = supplierFound;
	}




	private static boolean addstoreOwner;
	public static boolean isAddstoreOwner() {
		return addstoreOwner;
	}

	public static void setAddstoreOwner(boolean addstoreOwner) {
		Admin.addstoreOwner = addstoreOwner;
	}




	private static boolean deleteStoreOwner;
	public static boolean isDeleteStoreOwner() {
		return deleteStoreOwner;
	}

	public static void setDeleteStoreOwner(boolean deleteStoreOwner) {
		Admin.deleteStoreOwner = deleteStoreOwner;
	}




	private static boolean editStoreOwner;
	public static boolean isEditStoreOwner() {
		return editStoreOwner;
	}

	public static void setEditStoreOwner(boolean editStoreOwner) {
		Admin.editStoreOwner = editStoreOwner;
	}




	private static boolean editName;
	private static boolean editPassword;
	
	//***************************************
	private static boolean monitorProfit;
	public boolean isMonitorProfit() {
		return monitorProfit;
	}

	public void setMonitorProfit(boolean monitorProfit) {
		Admin.monitorProfit = monitorProfit;
	}




	private boolean daliyProfitSelect;
	public boolean isDaliyProfitSelect() {
		return daliyProfitSelect;
	}

	public void setDaliyProfitSelect(boolean daliyProfitSelect) {
		this.daliyProfitSelect = daliyProfitSelect;
	}




	private boolean monthProfitSelect;
	public boolean isMonthProfitSelect() {
		return monthProfitSelect;
	}

	public void setMonthProfitSelect(boolean monthProfitSelect) {
		this.monthProfitSelect = monthProfitSelect;
	}




	private boolean yearProfitSelect;
	
	public boolean isYearProfitSelect() {
		return yearProfitSelect;
	}

	public void setYearProfitSelect(boolean yearProfitSelect) {
		this.yearProfitSelect = yearProfitSelect;
	}




	//******************************************
	private boolean showBestSellingBroduct;
	
	
	//*******************
	private boolean showStatisticsUser;
	
	public boolean isShowStatisticsUser() {
		return showStatisticsUser;
	}

	public void setShowStatisticsUser(boolean showStatisticsUser) {
		this.showStatisticsUser = showStatisticsUser;
	}




	///*************
	private boolean showfeedbacks;
    
	
	
	
	
	
	
	
	
	public boolean isShowfeedbacks() {
		return showfeedbacks;
	}

	public void setShowfeedbacks(boolean showfeedbacks) {
		this.showfeedbacks = showfeedbacks;
	}

	public Admin(String username, String password) {
		adminName=username;
		adminPassword=password;
		
		
		//*******************************
		
		
	}

	public String getAdminname() {
		return adminName;
	}

	public void setAdminname(String adminname) {
		this.adminName = adminname;
	}

	public String getAdminpassword() {
		return adminPassword;
	}

	public void setAdminpassword(String adminpassword) {
		this.adminPassword = adminpassword;
	}

	public void showdashbord() {
		// TODO Auto-generated method stub
		
	}

	public void createstoreOwner(StoreOwner so1 ) {
		// to add new store owner
		MyApp.StoreOwnerList.add(so1);
		
	}

	public void showConfirmationMessage() {
		logger.info("storeOwner account created successfuly"); 
		
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
		if(index == -1) {
			logger.info("the store Owner you search to delete is not found");
			deleteStoreOwner=false;
		}
		else {
		
			MyApp.StoreOwnerList.remove(index);
			logger.info("deleted successfully");
			deleteStoreOwner=true;
		}
		
	}

	public void deleteStoreOwnerMessage() {
		
		if(storeOwnerFound) {
			logger.info("this Account was deleted successfully");
		} 
			
		
		
	}

	public void deleteStoreOwnerFaildMessage() {
		
		if(!storeOwnerFound) {
		logger.info("this Account is not found");
		}
		
	}

	public void updateStoreOwnerName(String newname,int index) {


		
		MyApp.StoreOwnerList.get(index).setStoreOwner_name(newname);
		
	}

	public void ShowUpdateStoreOwnerNameMessage() {
		logger.info("the store owner name updated successfully");
		
	}

	public void invalidUpdateStoreOwnerMessage() {
		logger.info("Store Owner  update faild");
		
	}

	public void deleteStoreOwnerFunction() {
		
		deleteStoreOwner=true;
		
	}

	public boolean addStoreOwnertoList(StoreOwner so1) {
		if(so1.getStoreOwner_name()==null || so1.getStoreOwner_name().isEmpty() || so1.getStoreOwner_password().isEmpty() || so1.getStoreCity()==null ||so1.getStoreCity().isEmpty() ) {
			logger.info("invalid store owner");
			return false;
		}
		MyApp.StoreOwnerList.add(so1);
		return true;
		
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
		
		logger.info("this account not found");
		
		
	}
	
	//*****************************************

	public void printDalyProfit(int year , int month , int day) {
		
		logger.info("ProductName | price | profit");
		for( Product p1 : MyApp.salledProduct) {
			if(p1.getSaleDate().getYear() == year && p1.getSaleDate().getMonthValue()==month && p1.getSaleDate().getDayOfMonth()==day) {
				logger.info(p1.getProductName()+" | "+p1.getPrice()+" | "+(p1.getPrice()-p1.getCostPrice()));
			}
		}
		
	}

	public void printMonthProfit(int year,int month) {
		
		logger.info("ProductName | price | profit");
		for( Product p1 : MyApp.salledProduct) {
			if(p1.getSaleDate().getYear() == year && p1.getSaleDate().getMonthValue()==month) {
				logger.info(p1.getProductName()+" | "+p1.getPrice()+" | "+(p1.getPrice()-p1.getCostPrice()));
			}
		}
	
		
	}

	public void printYearProfit(int year) {
		logger.info("ProductName | price | profit");
		for( Product p1 : MyApp.salledProduct) {
			if(p1.getSaleDate().getYear() == year) {
				logger.info(p1.getProductName()+" | "+p1.getPrice()+" | "+(p1.getPrice()-p1.getCostPrice()));
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
		    
		    if(bestProduct != null)
		    	logger.info(bestProduct.toString());
		    return bestProduct;
	}

	public void showbestSelling() {
		showBestSellingBroduct =true;
		
	}

	public void showStatisticsCheck() {
		showStatisticsUser= true;
		
	}

	public void showStaistics() {
		for(User u1: MyApp.Users) {
			logger.info("User Name:"+u1.getUserName()+"City:"+u1.getCity());
			
		}
		
	}

	public void showFeedBack() {
		ArrayList<User> users =MyApp.Users;
		
		for(User u1 : users) {
			if(!u1.getFeedback().equals("")) {
				
			    logger.info(u1.getUserName()+":"+u1.getFeedback());
			    showfeedbacks=true;
			 
			}
			
		}
		
	}

	public boolean checkManageRecipes() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public void showRecipes() {
		
		for(recipes re1 : MyApp.recipess) {
			logger.info(re1.toString());
			
		}
		
	}

	public boolean accepteRecipe(String recipeName) {
		if(recipeName == null || recipeName.isEmpty()) {
			logger.info("enter valid recipe name");
			return false;
		}
		
		for(recipes re1 : MyApp.recipess) {
			if(re1.getRecipeName().equals(recipeName)) {
				re1.setRecipeStatus(true);
				return true;
			}
		}
		
		logger.info("this recipe not fount in the list");
		return false;
	}
	
	
	

	public boolean deleteRecipe(String recipeName) {
		if(recipeName == null || recipeName.isEmpty()) {
			logger.info("enter valid recipe name");
			return false;
		}
		
		for(recipes re1 : MyApp.recipess) {
			if(re1.getRecipeName().equals(recipeName)) {
				MyApp.recipess.remove(re1);
				return true;
			}
		}
		
		logger.info("this recipe not fount in the list");
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
