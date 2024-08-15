package MyAPP_Sweet_mgt2024;

import java.util.ArrayList;

public class Orders {
	private int orderId;
	private Product product;
	private User u1;
	private boolean statusOfOrder;
	public Orders(int orderId, Product product, User u1) {
		
		this.product = product;
		this.u1 = u1;
		this.orderId = orderId;
		this.statusOfOrder =false;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Product getProduct() {
		return product;
	}
	
	public User getU1() {
		return u1;
	}
	
	public boolean isStatusOfOrder() {
		return statusOfOrder;
	}
	public void setStatusOfOrder(boolean statusOfOrder) {
		this.statusOfOrder = statusOfOrder;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
