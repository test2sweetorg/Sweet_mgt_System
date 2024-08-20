package MyAPP_Sweet_mgt2024;

import java.util.Scanner;
import java.util.logging.Logger;

public class MainCkass {

	public static void main(String[] args) {
		MyApp app = new MyApp();
		StoreOwner Owner;
		User user22;
		final Logger logger = Logger.getLogger(MainCkass.class.getName());
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		logger.info("**********Welcome To Sweet Management System**********");
		logger.info("1-Admin");
		logger.info("2-Store Owner");
		logger.info("3-User");
		logger.info("choose your role:");
		 int choice = scanner.nextInt();
		 boolean  adminExit = false;
		 boolean userExite= false;
		 boolean customerExit =false;
		 switch(choice) {
		 case 1:
			 
			 while(!adminExit) {
				 logger.info("**********Welcome To Sweet Management System**********");
				 logger.info("***********        Admin-dashbord           ************");
				 app.notlogin();
				 if(app.Admin_is_loggedin==true) {
					 while(app.Admin_is_loggedin) {
						 logger.info("1-Add new Stroe owner");
						 logger.info("2-delete Store Owner");
						 logger.info("3-Monitor profits and generate financial reports");
						 logger.info("4-Identify best-selling products in each store");
						 logger.info("5-Gather and display statistics on registered users by City");
						 logger.info("6-Manage the content shared on the system,recipes");
						 logger.info("7-manage feedback");
						 logger.info("8-exit");
						 System.out.print("Enter your chooise please:");
						 int choice2 = scanner.nextInt();
						 scanner.nextLine();
						 switch(choice2) {
						 case 1:
							 Scanner scanner2 = new Scanner(System.in);
							 System.out.print("Enter Store Owner Name: ");
						      String storeOwnerName = scanner2.nextLine();
						       
						        
						        System.out.print("Enter Store Owner Password: ");
						        String storeOwnerPassword = scanner2.nextLine();
						        
						        
						        System.out.print("Enter City: ");
						        String storeCity = scanner2.nextLine();
						       
						        
							 StoreOwner so1 = new StoreOwner(storeOwnerName,storeOwnerPassword,storeCity);
							boolean x= MyApp.systemAdmin.addStoreOwnertoList(so1);
							 
							 break;
							 
							 
					     
						 case 2:
							 Scanner scanner3 = new Scanner(System.in);
							 System.out.print("Enter Store Owner name you want to delete");
							 String storeOwnertoDeleteName =scanner3.nextLine();
							 int index = app.systemAdmin.searchStoreOwner(storeOwnertoDeleteName);
							 MyApp.systemAdmin.deletStoreOwner(index);
							 
							 break;
							 
							 
							 
							 
						 case 3:
							 MyApp.systemAdmin.setMonitorProfit(true);
							 while(MyApp.systemAdmin.isMonitorProfit()) {
								 logger.info("*****  1-display daliy profit  ******");
								 logger.info("*****  2-display monthly profit  ******");
								 logger.info("*****  3-display yearly profit  ******");
								 logger.info("****** 4-Exit                   *******");
								 logger.info("enter your chooies");
								 Scanner scanner4 = new Scanner(System.in);
								 int profits = scanner4.nextInt();
								 switch(profits) {
								 
								 case 1:
									 Scanner scanner5 = new Scanner(System.in);
									 System.out.print("enter year");
									 int yaer = scanner5.nextInt();
									 System.out.print("enter month");
									 int month = scanner5.nextInt();
									 System.out.print("enter day");
									 int day = scanner5.nextInt();
									 MyApp.systemAdmin.printDalyProfit(yaer, month, day);
									 
									 break;
								 case 2:
									 Scanner scanner6 = new Scanner(System.in);
									 System.out.print("enter year");
									 int yaer1 = scanner6.nextInt();
									 System.out.print("enter month");
									 int month1 = scanner6.nextInt();
									 MyApp.systemAdmin.printMonthProfit(yaer1, month1);
									 
									 break;
									 
								 case 3:
									 Scanner scanner7 = new Scanner(System.in);
									 System.out.print("enter year");
									 int yaer2 = scanner7.nextInt();
									 MyApp.systemAdmin.printYearProfit(yaer2);
									 
									 break;
									 
								 case 4:
									 MyApp.systemAdmin.setMonitorProfit(false);
									 break;
								 default:
									 logger.info("invalid input");
									 break;
								 }//switch(profits)
								 
								 
							 }
							 
							 
							 break;
						 case 4:
							 Scanner scanner8 = new Scanner(System.in);
							 logger.info("enter store name : Store[storename]");
							 String storeName = scanner8.nextLine();
							 Product bestSelling = MyApp.systemAdmin.getBestSellingProducts(storeName); 
							 
							 break;
						
						 case 5:
							 app.adduserList(app.Users);
							 MyApp.systemAdmin.showStaistics();
							 
							 break;
					     
						 case 6:
							 MyApp.systemAdmin.showRecipes();
							 Scanner scanner9 = new Scanner(System.in);
							 logger.info("Enter recipe name to manage");
							 String recipeName = scanner9.nextLine();
							 logger.info("1-Accepte recipe");
							 logger.info("2-delete recipe");
							 logger.info("enter your chooise :");
							 int recipeManagechooice= scanner9.nextInt();
							 switch(recipeManagechooice) {
							    case 1:
							    	 boolean x2 =app.systemAdmin.accepteRecipe(recipeName);
							    	break;
							    case 2:
							    	boolean x3 =app.systemAdmin.deleteRecipe(recipeName);
							    	break;
							    	
							    default:
							    	logger.info("enter vaild input");
							    	break;
							 }
							 
							 
							 
							 
							 break;
						 case 7:
							 
							 MyApp.systemAdmin.showFeedBack();
							 break;
						 case 8:
							 //adminExit=false;
							 app.Admin_is_loggedin=false;
							 
							 break;
						
						default:
							logger.info("invalid input");
							break;
						  
						 
						 
						 }
						 //switch(choice2)
						 
					 }
					 
				 }else {
					 
					 adminExit=true;
					 
				 }
				 
				if(app.Admin_is_loggedin==false)
				break;
				 
			 }
             
             break;
         case 2:
        	 while(!userExite) {
				 logger.info("**********Welcome To Sweet Management System**********");
				 logger.info("***********        Store Owner-dashbord           ************");
				 Owner=app.storeOwnernotLogin();
				 if(app.StoreOwner_is_loggedin==true) {
					 while(app.StoreOwner_is_loggedin) {
						 logger.info("1-Product Management");
						 logger.info("2-Communication and Notification");
						 logger.info("3-Account Management");
						 logger.info("4-Order Management");
						 logger.info("5-Exit");
						 System.out.print("Enter your chooise please:");
						 int choiceStoreOwner = scanner.nextInt();
						 scanner.nextLine();
						 switch(choiceStoreOwner) {
						   
						 case 1:
							 boolean productmanagementcheck=true;
							 while(productmanagementcheck) {
								 logger.info("1-add new product");
								 logger.info("2-update a product");
								 logger.info("3-remove a product");
								 logger.info("4-Monitor sales and profits.");
								 logger.info("5-Identify best-selling products");
								 logger.info("6-Implement dynamic discount features");
								 logger.info("7-Exit");
								 System.out.print("Enter your chooise please:");
								 int chooice5 = scanner.nextInt();
								 scanner.nextLine();
								 switch(chooice5) {
								   
								 case 1:
									 Scanner scanner10 = new Scanner(System.in);
									 System.out.print("Enter product name");
									 String prodname= scanner10.nextLine();
									 System.out.print("Enter store name:Store[Storename]");
									 String StoreName = scanner10.nextLine();
									 System.out.print("Enter the price");
									 double price = scanner10.nextDouble();
									 app.makeProductList(MyApp.avalaibleProducts);
									 Owner.addnewProduct(prodname, StoreName, price);
									 
									 break;
									 
									 
								 case 2:
									 Scanner scanner11 = new Scanner(System.in);
									 logger.info("1- update name");
									 logger.info("2-update price");
									 logger.info("Exit");
									 logger.info("enter your chooice: ");
									 int updatechooice = scanner11.nextInt();
									 
									 switch(updatechooice) {
									 
									 case 1:
										 Scanner scanner30 = new Scanner(System.in);
										 System.out.print("enter the old product name");
										 String oldname = scanner30.nextLine();
										 System.out.print("enter the new name");
										 String newname= scanner30.nextLine();
										 app.makeProductList(MyApp.avalaibleProducts);
										 
										int productfountindex =Owner.serchOnAProduct(oldname);
											if(productfountindex == -1) {
												Owner.invalidupdate();
											}else {
												int newnameisalredyexist = Owner.serchOnAProduct(newname);
												if(newnameisalredyexist != -1) {
													Owner.invalidupdate();
												}
												else {
													Owner.updateproductName(productfountindex,newname);
													Owner.validupdateProduct();
												}
												
											}
										 
										 
										 break;
										 
									 case 2:
										 Scanner scanner31 = new Scanner(System.in);
										 System.out.print("enter the product name");
										 String productnametochangeprice = scanner31.nextLine();
										 System.out.print("enter the new price");
										 double newprice= scanner31.nextDouble();
										 app.makeProductList(MyApp.avalaibleProducts);
										 
										 
											int productfountindexpr=Owner.serchOnAProduct(productnametochangeprice);
											if(productfountindexpr == -1) {
												Owner.invalidupdate();
											}else {
												Owner.updateproductPrice(productfountindexpr,newprice);
												Owner.validupdateProduct();
												
											}
										 
										 
										 break;
										 
										 
									 case 3:
										 break;
										 
									default:
										logger.info("invalid input");
										break;
										 
										 
									 }
									 
									 break;
								 case 3:
									 app.makeProductList(MyApp.avalaibleProducts);
									 Scanner scanner12 = new Scanner(System.in);
									 System.out.print("Enter product name to remove");
									 String prodtoremoveName= scanner12.nextLine();
									 boolean indexremove =Owner.deleteProduct(prodtoremoveName);
									 
									 break;
									 
									 
								 case 4:
									 Owner.checkMonitorProfit=true;
									 Scanner scanner13 = new Scanner(System.in);
									 while(Owner.checkMonitorProfit) {
										 logger.info("1-monitor daliy profit");
										 logger.info("2-monitor monthly profit");
										 logger.info("3-monitor yearly profit");
										 logger.info("4-Exit");
										 System.out.print("enter your chooice");
										 int chooiceprofitOwner = scanner13.nextInt();
										 
										 switch(chooiceprofitOwner) {
										 case 1:
											 Scanner scanner14 = new Scanner(System.in);
											 System.out.print("Enter yaer");
											 int year = scanner14.nextInt();
											 System.out.print("Enter month");
											 int month = scanner14.nextInt();
											 System.out.print("Enter day");
											 int day = scanner14.nextInt();
											 Owner.printDailyprofit(year, month, day);
											 
											 break;
											 
										 case 2:
											 Scanner scanner15 = new Scanner(System.in);
											 System.out.print("Enter yaer");
											 int year1 = scanner15.nextInt();
											 System.out.print("Enter month");
											 int month1 = scanner15.nextInt();
											 Owner.printMonthlyprofit(year1, month1);
											 
											 
											 break;
											 
										 case 3:
											 Scanner scanner16 = new Scanner(System.in);
											 System.out.print("Enter yaer");
											 int year12 = scanner16.nextInt();
											 Owner.printYearlyprofit(year12);
											 break;
											 
										 case 4:
											 Owner.checkMonitorProfit=false;
										
											 break;
											 
										default:
											logger.info("enter valid input please");
											 break;
											 
											 
											 
										 
										 }
										  
									 }
									 
									 break;
									 
									 
								 case 5:
									 Scanner scanner17 = new Scanner(System.in);
									 app.makeProductList(MyApp.avalaibleProducts);
									 System.out.print("Enter a Store name to see best selling product: ");
									 String bestproductname = scanner17.nextLine();
									 Product bestsellig =Owner.getBestSellingProducts(bestproductname);
									 if(bestsellig != null) {
										 logger.info(bestsellig.toString());
									 }
									 
									 break;
									 
								 case 6:
									 app.makeProductList(MyApp.avalaibleProducts);
									 Scanner scanner18 = new Scanner(System.in);
									 System.out.print("Enter product name to make discount: ");
									 String dis_productname = scanner18.nextLine();
									 System.out.print("Enter the discount[0...100]: ");
									 int discount = scanner18.nextInt();
									 boolean discountPass = Owner.Discount(dis_productname, discount);
									 
									 break;
									 
								 case 7:
									 productmanagementcheck=false;
									 
									 break;
									 
								 default:
									 logger.info("enter valid input please");
									 break;
									 
									 
								 }
								 
								if(productmanagementcheck == false)
									break;
								 
								 
							 }
							  
							 break;
						   
						 case 2:
							 app.adduserList(MyApp.Users);
							 Scanner scanner19 = new Scanner(System.in);
							 logger.info("1-sent massege to User");
							 logger.info("2- view camunication history");
							 logger.info("3- Exit..");
							 logger.info("Enter your chooice: ");
							 int camuna_chooice = scanner19.nextInt();
							 switch(camuna_chooice) {
							      
							 case 1:
								 System.out.print("Enter User name: ");
								 String userName = scanner19.nextLine();
								 System.out.print("Enter the message: ");
								 String messagetouser = scanner19.nextLine();
								 Owner.sendmassegeToUser(userName, messagetouser);
								
								 break;
								 
								 
							 case 2:
								 Owner.showMessagesStoreOwner();
								 
								 break;
								 
							 case 3:
								 
								 break;
								 
							 default:
								  logger.info("Enter valid input");
								break;
							 
							 }
							 break;
							 
						 case 3:
							 Owner.account_mgt_check= true;
							 Scanner scanner20 = new Scanner(System.in);
							 while(Owner.account_mgt_check) {
								 logger.info("1-update store name");
								 logger.info("2-update store owner name");
								 logger.info("3-update store owner password");
								 logger.info("4- Exit...");
								 logger.info("Enter your chooice: ");
								 int account_mgt_chooice = scanner20.nextInt();
								 
								 switch(account_mgt_chooice) {
								 
								 case 1:
									 app.addStoreOwnerList(MyApp.StoreOwnerList);
									 System.out.print("New Store Name: ");
									 String newStoreName =scanner20.nextLine();
									boolean changeStoreNameCheck= Owner.manageStoreName(newStoreName);
									 break;
									 
								 case 2:
									 app.addStoreOwnerList(MyApp.StoreOwnerList);
									 logger.info("Enter your new name: ");
									 String stOwnerNewName=scanner20.nextLine();
									boolean changeStoreOwnerNameCheck=app.SO1.manageStoreOwnerName(stOwnerNewName); 
	
									 break;
									 
									 
								 case 3:
									 app.addStoreOwnerList(MyApp.StoreOwnerList);
									 logger.info("Enter your new name: ");
									 String stOwnerNewPassword=scanner20.nextLine();
									boolean changeStoreOwnerPasswordCheck = app.SO1.manegeStroeOwnerPassword(stOwnerNewPassword);
									 
									 break;
									 
								 case 4:
									 Owner.account_mgt_check=false;
									 break;
								default:
									logger.info("enter valid input");
									break;
								 
                      								 
								 
								 }
								 
								 
							 }
							 
							 break;
							 
						 case 4:
							 app.SO1.makeOrderList(app.SO1.userOrders);
							 app.addStoreOwnerList(MyApp.StoreOwnerList);
							 boolean order_mgt=true;
							 Scanner scanner21 = new Scanner(System.in);
							 while(order_mgt) {
								 logger.info("1-View Orders");
								 logger.info("2-change statuse of order");
								 logger.info("3-Delete Orders");
								 logger.info("4-Exit");
								 System.out.print("Enter your chooice: ");
								 int order_chooice = scanner21.nextInt();
								 switch(order_chooice) {
								  
								 case 1:
									 
									 boolean viewOrdercheck = Owner.viewOrders();
									 
									 break;
									 
								 case 2:
									 System.out.print("Enter order id");
									 int orderid = scanner21.nextInt();
									boolean changeOrderStatusCheck = Owner.changeOrderStatus(orderid);
									 break;
									 
								 case 3:
									 System.out.print("Enter order id");
									 int orderidde = scanner21.nextInt();
									 boolean deleteOrderCheck = Owner.deleteOrder(orderidde); 
									 
									 break;
									 
								 case 4:
									 order_mgt=false;
									 break;
									 
								 default:
									 logger.info("enter valid input");
									 break;
								 }
								  
							 }
							 
							 break;
							 
						 case 5:
							 app.StoreOwner_is_loggedin=false;
							 break;
						 
						 default:
							 logger.info("enter valid input please");
						 }
						 
					 }
					 
				 }else {
					 userExite=true;
				 }
				 
				 if(app.StoreOwner_is_loggedin == false)
					 break;
				 
        	 }// while(!userExite)
        	
             break;
             
         case 3:
        	 app.adduserList(MyApp.Users);
        	 app.makeProductList(MyApp.avalaibleProducts);
        	 app.addStoreOwnerList(MyApp.StoreOwnerList);
        	 app.addrecipe(MyApp.recipess);
        	 while(!customerExit) {
        	 logger.info("**********Welcome To Sweet Management System**********");
			 logger.info("***********        Store Owner-dashbord           ************");
			 logger.info("1-login");
			 logger.info("2-sign up");
			 logger.info("3-Exit");
			 Scanner scanner25 = new Scanner(System.in);
			 System.out.print("Enter your role: ");
			 int useraccesschooice = scanner25.nextInt();
			 switch(useraccesschooice){
			 case 1:
				 Scanner scanner26 = new Scanner(System.in);
				 app.adduserList(MyApp.Users);
				 System.out.print("Enter the user name: ");
				 String user22name =scanner26.nextLine();
				 logger.info("Enter the user password: ");
				 String user22password = scanner26.nextLine();
				 user22=app.UserloginPage(user22name, user22password);
				 if(app.user_sign_in_check == true) {
					 while(app.user_sign_in_check) {
						
						 logger.info("1-Manage personal accounts.");
						 logger.info("2-Post and share personal dessert creations.");
						 logger.info("3-Browse and search for dessert recipes.");
						 logger.info("4-Filter recipes based on suger degree");
						 logger.info("5-Purchase desserts directly from store owners.");
						 logger.info("6-Directly communicate with store owners for inquiries or assistance.");
						 logger.info("7-Provide feedback");
						 logger.info("8-Exit..");
						 Scanner scanner27 = new Scanner(System.in);
						 System.out.print("Enter your chooice: ");
						 int userfeaturechooice = scanner27.nextInt();
						 
						 switch(userfeaturechooice) {
						    
						 case 1:
							 Scanner scanner28 = new Scanner(System.in);
							 boolean checkUserMgtInfo=user22.checkUserManagmentInfo();
							 while(checkUserMgtInfo) {
								 logger.info("1-Edit user name");
								 logger.info("2-Edit User password");
								 logger.info("3- Edit User city");
								 logger.info("4-Exit ..");
								 System.out.print("Enter your modify role: ");
								 int modifyUserChooice = scanner28.nextInt();
								 switch(modifyUserChooice) {
								 case 1:
									 Scanner scanner29 = new Scanner(System.in);
									 System.out.print("Enter new Name: ");
									 String newuserName =scanner29.nextLine();
									 boolean checkEditUserName = user22.updateUserName(newuserName);
									 break;
									 
								 case 2:
									 
									 Scanner scanner30 = new Scanner(System.in);
									 System.out.print("Enter new Password: ");
									 String newuserPssword =scanner30.nextLine();
									 boolean checkEditUserPassword = user22.UpdateUserPassword(newuserPssword);
									 
									 break;
									 
								 case 3:
									 Scanner scanner31 = new Scanner(System.in);
									 System.out.print("Enter new City: ");
									 String newuserCity =scanner31.nextLine();
									 boolean checkEditUserCity = user22.UpdateUserCity(newuserCity);
									 
									 break;
									 
								 case 4:
									 checkUserMgtInfo= false;
									 break;
									 
								default:
									logger.info("Enter valid input!!");
									break;
								 
								 }
								 
							 }
							 
							 break;
							 
						 case 2:
							 Scanner scanner32 = new Scanner(System.in);
							 System.out.print("Enter recipe Name: ");
							 String recipename = scanner32.nextLine();
							 System.out.print("Enter recipe discription: ");
							 String recipeDiscription = scanner32.nextLine();
							boolean checkaddRecipes=user22.addrecipes(recipename,recipeDiscription);
							 break;
							 
						 case 3:
							boolean browesDessertCheck=app.browesDessert();
							Scanner scanner33 = new Scanner(System.in);
							logger.info("are you want to search on i product??");
							logger.info("1-yes");
							logger.info("1-no");
							System.out.print("yes/no ?");
							int searchchooice= scanner33.nextInt();
							switch(searchchooice) {
							
							case 1:
								Scanner scanner34 = new Scanner(System.in);
								System.out.print("Enter product name: ");
								String prodsearchname =scanner34.nextLine();
								Product p1 = app.SearchonProduct(prodsearchname);
								logger.info(p1.toString());
								
								break;
							case 2:
								
								break;
								
							default:
								logger.info("enter valid input");
							}
							 break;
							 
						 case 4:
							 Scanner scanner35 = new Scanner(System.in);
							 System.out.print("Enter suger degree 1 2 3: ");
							 int sugerdegree = scanner35.nextInt();
							 boolean checkfilterDessert= app.filterSugar(sugerdegree);
							 
							 break;
							 
						 case 5:
							 boolean UserShoppingbutton = user22.checkShoppingButton();
							 while(UserShoppingbutton) {
								 logger.info("1-addproducttoShoppingcard");
								 logger.info("2-deleteProductFromShoppingCard");
								 logger.info("3-Veiw shopping card");
								 logger.info("4-buy");
								 logger.info("5-Exit..");
								 Scanner scanner36 = new Scanner(System.in);
								 System.out.print("Enter your chooice: ");
								 int buychooice = scanner36.nextInt();
								 switch(buychooice) {
								 
								 case 1:
									 Scanner scanner37 = new Scanner(System.in);
									 System.out.print("product name: ");
									 String puyproductname = scanner37.nextLine();
									Product puyproduct = app.SearchonProduct(puyproductname);
									boolean	checkproductaddtoshoppingcard = user22.addproducttoShoppingcard(puyproduct);
									 break;
									 
								 case 2:
									 Scanner scanner38 = new Scanner(System.in);
									 System.out.print("product name to remove: ");
									 String reomverproductname = scanner38.nextLine();
									Product p11 = user22.searchOnProductFromShoppingCard(reomverproductname);
									if(p11 !=null) {
									 boolean checkproductdeletedfromshoppingcard = user22.deleteProductFromShoppingCard(p11);
									}
										
									 break;
									 
								 case 3:
									 user22.viewShoppingCard();
									 break;
									 
								 case 4:
									boolean checkconfirmpayment = user22.buy();
									 break;
									 
								 case 5:
									 UserShoppingbutton=false;
									 break;
									 
								 default:
									 logger.info("Enter a valid input please!!");
								 
								 }
							 }
							 
							 
							 break;
							 
						 case 6:
							 boolean camuncationwithOwner =true;
							 while(camuncationwithOwner) {
							logger.info("1-comunicate with store owner");
							logger.info("veiw camunication history");
							logger.info("3-Exit..");
							 Scanner scanner39 = new Scanner(System.in);
							System.out.print("Enter your role: ");
							int camunicateChooice = scanner39.nextInt();
							switch(camunicateChooice) {
							case 1:
								Scanner scanner40 = new Scanner(System.in);
								System.out.print("Enter store Owner name: ");
								String storeOwnername =scanner40.nextLine();
								System.out.print("Enter Message: ");
								String messageTostoreOwner =scanner40.nextLine();
								user22.sendmassegeToStoreOwner(storeOwnername, messageTostoreOwner );
								break;
								
							case 2:
							    boolean	viewMessageHistory=user22.showMessagesUser();
								break;
								
							case 3:
								camuncationwithOwner=false;
								break;
								
							default:
								logger.info("please enter valid input");
								break;
							
							}
							
							 }
							 break;
							 
						 case 7:
							 Scanner scanner41 = new Scanner(System.in);
							 System.out.print("give us your feedback of the System: ");
							 String feedbackuser = scanner41.nextLine();
							boolean UserFeedbackCheck = app.shaheen.addFeedback(feedbackuser);
							
							 break;
							 
						 case 8:
							 app.user_sign_in_check= false;
							 break;
							 
						 default:
							 logger.info("please enter a valid input!!");
							 break;
						   
						 
						 }
						 
						 
					 }
					  
				 }
				 
				 break;
				 
				 
			 case 2:
				boolean usersignupsuccessfully = false;
				Scanner scanner27 = new Scanner(System.in);
				 app.adduserList(MyApp.Users);
				 while(!usersignupsuccessfully) {
					 System.out.print("Enter User name: ");
					 String Uname = scanner27.nextLine();
					 System.out.print("Enter user password: ");
					 String Upassword = scanner27.nextLine();
					 System.out.print("Enter user Email: ");
					 String UEmail = scanner27.nextLine();
					 System.out.print("Enter user city: ");
					 String UCity = scanner27.nextLine();
					 boolean checkuserSignUp =app.SignupUser(Uname,Upassword,UEmail,UCity);
					 if(checkuserSignUp == true) {
						 usersignupsuccessfully=true;
					 }else {
						 logger.info("invalid user sign up try agin please");
					 }
					 
				 }
				 
				 break;
				 
			 case 3:
				 customerExit=true;
				 break;
				 
			 default:
				 logger.info("please enter a valid input");
				 break;
				 
			 }
        	 }
        	 
        	 
            
             break;
         case 4:
             logger.info("Exiting...");
             break;
         default:
             logger.info("Invalid choice. Please try again.\n");
             break;
		 
		 
		 
		 }//switch(choice) 
		
		}//while(true) {	

	}//public static void main(String[] args)

}
