package MyAPP_Sweet_mgt2024;

import java.util.Scanner;

public class MainCkass {

	public static void main(String[] args) {
		MyApp app = new MyApp();
		StoreOwner Owner;
		User user22;
		 
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		System.out.println("**********Welcome To Sweet Management System**********");
		System.out.println("1-Admin");
		System.out.println("2-Store Owner");
		System.out.println("3-User");
		System.out.println("choose your role:");
		 int choice = scanner.nextInt();
		 boolean  adminExit = false;
		 boolean userExite= false;
		 boolean customerExit =false;
		 switch(choice) {
		 case 1:
			 
			 while(!adminExit) {
				 System.out.println("**********Welcome To Sweet Management System**********");
				 System.out.println("***********        Admin-dashbord           ************");
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
							boolean x= app.systemAdmin.addStoreOwnertoList(so1);
							 
							 break;
							 
							 
					     
						 case 2:
							 Scanner scanner3 = new Scanner(System.in);
							 System.out.print("Enter Store Owner name you want to delete");
							 String storeOwnertoDeleteName =scanner3.nextLine();
							 int index = app.systemAdmin.searchStoreOwner(storeOwnertoDeleteName);
							 app.systemAdmin.deletStoreOwner(index);
							 
							 break;
							 
							 
							 
							 
						 case 3:
							 app.systemAdmin.monitorProfit = true;
							 while(app.systemAdmin.monitorProfit) {
								 System.out.println("*****  1-display daliy profit  ******");
								 System.out.println("*****  2-display monthly profit  ******");
								 System.out.println("*****  3-display yearly profit  ******");
								 System.out.println("****** 4-Exit                   *******");
								 System.out.println("enter your chooies");
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
									 app.systemAdmin.printDalyProfit(yaer, month, day);
									 
									 break;
								 case 2:
									 Scanner scanner6 = new Scanner(System.in);
									 System.out.print("enter year");
									 int yaer1 = scanner6.nextInt();
									 System.out.print("enter month");
									 int month1 = scanner6.nextInt();
									 app.systemAdmin.printMonthProfit(yaer1, month1);
									 
									 break;
									 
								 case 3:
									 Scanner scanner7 = new Scanner(System.in);
									 System.out.print("enter year");
									 int yaer2 = scanner7.nextInt();
									 app.systemAdmin.printYearProfit(yaer2);
									 
									 break;
									 
								 case 4:
									 app.systemAdmin.monitorProfit=false;
									 break;
								 default:
									 System.out.println("invalid input");
									 break;
								 }//switch(profits)
								 
								 
							 }
							 
							 
							 break;
						 case 4:
							 Scanner scanner8 = new Scanner(System.in);
							 System.out.println("enter store name : Store[storename]");
							 String storeName = scanner8.nextLine();
							 Product bestSelling = app.systemAdmin.getBestSellingProducts(storeName); 
							 
							 break;
						
						 case 5:
							 app.adduserList(app.Users);
							 app.systemAdmin.showStaistics();
							 
							 break;
					     
						 case 6:
							 app.systemAdmin.showRecipes();
							 Scanner scanner9 = new Scanner(System.in);
							 System.out.println("Enter recipe name to manage");
							 String recipeName = scanner9.nextLine();
							 System.out.println("1-Accepte recipe");
							 System.out.println("2-delete recipe");
							 System.out.println("enter your chooise :");
							 int recipeManagechooice= scanner9.nextInt();
							 switch(recipeManagechooice) {
							    case 1:
							    	 boolean x2 =app.systemAdmin.accepteRecipe(recipeName);
							    	break;
							    case 2:
							    	boolean x3 =app.systemAdmin.deleteRecipe(recipeName);
							    	break;
							    	
							    default:
							    	System.out.println("enter vaild input");
							    	break;
							 }
							 
							 
							 
							 
							 break;
						 case 7:
							 
							 app.systemAdmin.showFeedBack();
							 break;
						 case 8:
							 //adminExit=false;
							 app.Admin_is_loggedin=false;
							 
							 break;
						
						default:
							System.out.println("invalid input");
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
				 System.out.println("**********Welcome To Sweet Management System**********");
				 System.out.println("***********        Store Owner-dashbord           ************");
				 Owner=app.storeOwnernotLogin();
				 if(app.StoreOwner_is_loggedin==true) {
					 while(app.StoreOwner_is_loggedin) {
						 System.out.println("1-Product Management");
						 System.out.println("2-Communication and Notification");
						 System.out.println("3-Account Management");
						 System.out.println("4-Order Management");
						 System.out.println("5-Exit");
						 System.out.print("Enter your chooise please:");
						 int choiceStoreOwner = scanner.nextInt();
						 scanner.nextLine();
						 switch(choiceStoreOwner) {
						   
						 case 1:
							 boolean productmanagementcheck=true;
							 while(productmanagementcheck) {
								 System.out.println("1-add new product");
								 System.out.println("2-update a product");
								 System.out.println("3-remove a product");
								 System.out.println("4-Monitor sales and profits.");
								 System.out.println("5-Identify best-selling products");
								 System.out.println("6-Implement dynamic discount features");
								 System.out.println("7-Exit");
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
									 app.makeProductList(app.avalaibleProducts);
									 Owner.addnewProduct(prodname, StoreName, price);
									 
									 break;
									 
									 
								 case 2:
									 Scanner scanner11 = new Scanner(System.in);
									 System.out.println("1- update name");
									 System.out.println("2-update price");
									 System.out.println("Exit");
									 System.out.println("enter your chooice: ");
									 int updatechooice = scanner11.nextInt();
									 
									 switch(updatechooice) {
									 
									 case 1:
										 Scanner scanner30 = new Scanner(System.in);
										 System.out.print("enter the old product name");
										 String oldname = scanner30.nextLine();
										 System.out.print("enter the new name");
										 String newname= scanner30.nextLine();
										 app.makeProductList(app.avalaibleProducts);
										 
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
										 app.makeProductList(app.avalaibleProducts);
										 
										 
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
										System.out.println("invalid input");
										break;
										 
										 
									 }
									 
									 break;
								 case 3:
									 app.makeProductList(app.avalaibleProducts);
									 Scanner scanner12 = new Scanner(System.in);
									 System.out.print("Enter product name to remove");
									 String prodtoremoveName= scanner12.nextLine();
									 boolean indexremove =Owner.deleteProduct(prodtoremoveName);
									 
									 break;
									 
									 
								 case 4:
									 Owner.checkMonitorProfit=true;
									 Scanner scanner13 = new Scanner(System.in);
									 while(Owner.checkMonitorProfit) {
										 System.out.println("1-monitor daliy profit");
										 System.out.println("2-monitor monthly profit");
										 System.out.println("3-monitor yearly profit");
										 System.out.println("4-Exit");
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
											System.out.println("enter valid input please");
											 break;
											 
											 
											 
										 
										 }
										  
									 }
									 
									 break;
									 
									 
								 case 5:
									 Scanner scanner17 = new Scanner(System.in);
									 app.makeProductList(app.avalaibleProducts);
									 System.out.print("Enter a Store name to see best selling product: ");
									 String bestproductname = scanner17.nextLine();
									 Product bestsellig =Owner.getBestSellingProducts(bestproductname);
									 if(bestsellig != null) {
										 System.out.println(bestsellig.toString());
									 }
									 
									 break;
									 
								 case 6:
									 app.makeProductList(app.avalaibleProducts);
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
									 System.out.println("enter valid input please");
									 break;
									 
									 
								 }
								 
								if(productmanagementcheck == false)
									break;
								 
								 
							 }
							  
							 break;
						   
						 case 2:
							 app.adduserList(app.Users);
							 Scanner scanner19 = new Scanner(System.in);
							 System.out.println("1-sent massege to User");
							 System.out.println("2- view camunication history");
							 System.out.println("3- Exit..");
							 System.out.println("Enter your chooice: ");
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
								  System.out.println("Enter valid input");
								break;
							 
							 }
							 break;
							 
						 case 3:
							 Owner.account_mgt_check= true;
							 Scanner scanner20 = new Scanner(System.in);
							 while(Owner.account_mgt_check) {
								 System.out.println("1-update store name");
								 System.out.println("2-update store owner name");
								 System.out.println("3-update store owner password");
								 System.out.println("4- Exit...");
								 System.out.println("Enter your chooice: ");
								 int account_mgt_chooice = scanner20.nextInt();
								 
								 switch(account_mgt_chooice) {
								 
								 case 1:
									 app.addStoreOwnerList(app.StoreOwnerList);
									 System.out.print("New Store Name: ");
									 String newStoreName =scanner20.nextLine();
									boolean changeStoreNameCheck= Owner.manageStoreName(newStoreName);
									 break;
									 
								 case 2:
									 app.addStoreOwnerList(app.StoreOwnerList);
									 System.out.println("Enter your new name: ");
									 String stOwnerNewName=scanner20.nextLine();
									boolean changeStoreOwnerNameCheck=app.SO1.manageStoreOwnerName(stOwnerNewName); 
	
									 break;
									 
									 
								 case 3:
									 app.addStoreOwnerList(app.StoreOwnerList);
									 System.out.println("Enter your new name: ");
									 String stOwnerNewPassword=scanner20.nextLine();
									boolean changeStoreOwnerPasswordCheck = app.SO1.manegeStroeOwnerPassword(stOwnerNewPassword);
									 
									 break;
									 
								 case 4:
									 Owner.account_mgt_check=false;
									 break;
								default:
									System.out.println("enter valid input");
									break;
								 
                      								 
								 
								 }
								 
								 
							 }
							 
							 break;
							 
						 case 4:
							 app.SO1.makeOrderList(app.SO1.userOrders);
							 app.addStoreOwnerList(app.StoreOwnerList);
							 boolean order_mgt=true;
							 Scanner scanner21 = new Scanner(System.in);
							 while(order_mgt) {
								 System.out.println("1-View Orders");
								 System.out.println("2-change statuse of order");
								 System.out.println("3-Delete Orders");
								 System.out.println("4-Exit");
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
									 System.out.println("enter valid input");
									 break;
								 }
								  
							 }
							 
							 break;
							 
						 case 5:
							 app.StoreOwner_is_loggedin=false;
							 break;
						 
						 default:
							 System.out.println("enter valid input please");
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
        	 app.adduserList(app.Users);
        	 app.makeProductList(app.avalaibleProducts);
        	 app.addStoreOwnerList(app.StoreOwnerList);
        	 app.addrecipe(app.recipess);
        	 while(!customerExit) {
        	 System.out.println("**********Welcome To Sweet Management System**********");
			 System.out.println("***********        Store Owner-dashbord           ************");
			 System.out.println("1-login");
			 System.out.println("2-sign up");
			 System.out.println("3-Exit");
			 Scanner scanner25 = new Scanner(System.in);
			 System.out.print("Enter your role: ");
			 int useraccesschooice = scanner25.nextInt();
			 switch(useraccesschooice){
			 case 1:
				 Scanner scanner26 = new Scanner(System.in);
				 app.adduserList(app.Users);
				 System.out.print("Enter the user name: ");
				 String user22name =scanner26.nextLine();
				 System.out.println("Enter the user password: ");
				 String user22password = scanner26.nextLine();
				 user22=app.UserloginPage(user22name, user22password);
				 if(app.user_sign_in_check == true) {
					 while(app.user_sign_in_check) {
						
						 System.out.println("1-Manage personal accounts.");
						 System.out.println("2-Post and share personal dessert creations.");
						 System.out.println("3-Browse and search for dessert recipes.");
						 System.out.println("4-Filter recipes based on suger degree");
						 System.out.println("5-Purchase desserts directly from store owners.");
						 System.out.println("6-Directly communicate with store owners for inquiries or assistance.");
						 System.out.println("7-Provide feedback");
						 System.out.println("8-Exit..");
						 Scanner scanner27 = new Scanner(System.in);
						 System.out.print("Enter your chooice: ");
						 int userfeaturechooice = scanner27.nextInt();
						 
						 switch(userfeaturechooice) {
						    
						 case 1:
							 Scanner scanner28 = new Scanner(System.in);
							 boolean checkUserMgtInfo=user22.checkUserManagmentInfo();
							 while(checkUserMgtInfo) {
								 System.out.println("1-Edit user name");
								 System.out.println("2-Edit User password");
								 System.out.println("3- Edit User city");
								 System.out.println("4-Exit ..");
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
									System.out.println("Enter valid input!!");
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
							System.out.println("are you want to search on i product??");
							System.out.println("1-yes");
							System.out.println("1-no");
							System.out.print("yes/no ?");
							int searchchooice= scanner33.nextInt();
							switch(searchchooice) {
							
							case 1:
								Scanner scanner34 = new Scanner(System.in);
								System.out.print("Enter product name: ");
								String prodsearchname =scanner34.nextLine();
								Product p1 = app.SearchonProduct(prodsearchname);
								System.out.println(p1.toString());
								
								break;
							case 2:
								
								break;
								
							default:
								System.out.println("enter valid input");
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
								 System.out.println("1-addproducttoShoppingcard");
								 System.out.println("2-deleteProductFromShoppingCard");
								 System.out.println("3-Veiw shopping card");
								 System.out.println("4-buy");
								 System.out.println("5-Exit..");
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
									 System.out.println("Enter a valid input please!!");
								 
								 }
							 }
							 
							 
							 break;
							 
						 case 6:
							 boolean camuncationwithOwner =true;
							 while(camuncationwithOwner) {
							System.out.println("1-comunicate with store owner");
							System.out.println("veiw camunication history");
							System.out.println("3-Exit..");
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
								System.out.println("please enter valid input");
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
							 System.out.println("please enter a valid input!!");
							 break;
						   
						 
						 }
						 
						 
					 }
					  
				 }
				 
				 break;
				 
				 
			 case 2:
				boolean usersignupsuccessfully = false;
				Scanner scanner27 = new Scanner(System.in);
				 app.adduserList(app.Users);
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
						 System.out.println("invalid user sign up try agin please");
					 }
					 
				 }
				 
				 break;
				 
			 case 3:
				 customerExit=true;
				 break;
				 
			 default:
				 System.out.println("please enter a valid input");
				 break;
				 
			 }
        	 }
        	 
        	 
            
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
