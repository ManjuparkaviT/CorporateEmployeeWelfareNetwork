package model;

public class Login {
	private String EmailId;
	private String Password;
	String UserType;
	String EmployeeId;
	public Login(String EmailId,String Password,String UserType,String EmployeeId) {
		this.EmailId=EmailId;
		this.Password=Password;
		this.UserType=UserType;
		this.EmployeeId=EmployeeId;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getUserType() {
		return UserType;
	}
	public void setUserType(String userType) {
		UserType = userType;
	}
}
