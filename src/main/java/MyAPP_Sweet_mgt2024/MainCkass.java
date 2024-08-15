package MyAPP_Sweet_mgt2024;

import java.util.Scanner;

public class MainCkass {

	public static void main(String[] args) {
		MyApp app = new MyApp();
		Scanner scanner = new Scanner(System.in);
		boolean adminExit = false;
		while(true) {
		System.out.println("**********Welcome To Sweet Management System**********");
		System.out.println("1-Admin");
		System.out.println("2-Store Owner");
		System.out.println("3-User");
		System.out.println("choose your role:");
		 int choice = scanner.nextInt();
         
		 switch(choice) {
		 case 1:
			 while(!adminExit) {
				 System.out.println("**********Welcome To Sweet Management System**********");
				 System.out.println("********Welcome To Sweet Management System-Admin********");
				 app.notlogin();
				 if(app.Admin_is_loggedin==true) {
					 while(app.Admin_is_loggedin) {
						 System.out.println("1-Add new Stroe owner");
						 System.out.println("2-delete Store Owner");
						 System.out.println("3-Monitor profits and generate financial reports");
						 System.out.println("4-Identify best-selling products in each store");
						 System.out.println("5-Gather and display statistics on registered users by City");
						 System.out.println("6-Manage the content shared on the system,recipes");
						 System.out.println("7-manage feedback");
						 System.out.println("8-exit");
						 System.out.print("Enter your chooise please:");
						 int choice2 = scanner.nextInt();
						 switch(choice2) {
						 case 1:
							 System.out.print("Enter Store Owner Name: ");
						        String storeOwnerName = scanner.nextLine();
						        
						        System.out.print("Enter Store Owner Password: ");
						        String storeOwnerPassword = scanner.nextLine();
						        
						        System.out.print("Enter City: ");
						        String storeCity = scanner.nextLine();
							 StoreOwner so1 = new StoreOwner(storeOwnerName,storeOwnerPassword,storeCity);
							 app.systemAdmin.addStoreOwnertoList(so1);
							 
							 break;
					     
						 case 2:
							 break;
						 case 3:
							 break;
						 case 4:
							 break;
						
						 case 5:
							 
							 break;
					     
						 case 6:
							 break;
						 case 7:
							 break;
						 case 8:
							 break;
						
						default:
							break;
						  
						 
						 
						 }//switch(choice2)
						 
					 }
					 
				 }
				 
				 
			 }
             
             break;
         case 2:
             
             break;
         case 3:
            
             break;
         case 4:
             System.out.println("Exiting...");
             break;
         default:
             System.out.println("Invalid choice. Please try again.\n");
             break;
		 
		 
		 
		 }//switch(choice) 
		
		}//while(true) {	

	}//public static void main(String[] args)

}
