package MyAPP_Sweet_mgt2024;

import java.util.ArrayList;

public class Supplier {
	 public String supplierName;
	 public String supplierPassword;
	 public ArrayList<String>messages = new ArrayList<String>();
	public Supplier(String supplierName, String supplierPassword) {
		super();
		this.supplierName = supplierName;
		this.supplierPassword = supplierPassword;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierPassword() {
		return supplierPassword;
	}

	public void setSupplierPassword(String supplierPassword) {
		this.supplierPassword = supplierPassword;
	}
	
	
	
	
	 
	 
	

}
