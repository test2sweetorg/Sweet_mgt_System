package MyAPP_Sweet_mgt2024;

public class StoreOwner {
	
	public String StoreOwner_name;
	public String StoreOwner_password;
	public String StoreCity;

	public StoreOwner(String storeOwner_name, String storeOwner_password,String storecity) {
		this.StoreOwner_name=storeOwner_name;
		this.StoreOwner_password=storeOwner_password;
		this.StoreCity=storecity;
		
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
	
	
	
	
	
	

}
