package MyAPP_Sweet_mgt2024;

public class User {
	
	private String userName;
	private String passord;
	private String city;
	private String feedback;
	
	public User(String userName, String passord, String city) {
		
		this.userName = userName;
		this.passord = passord;
		this.city = city;
		feedback="";
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
	
	
	
	
	
	
	
	
	

}
