package model;
import java.util.*;
public class SignUp {
	private String UserName;
	private String EmailId;
	private String Password;
	private String EmployeeId;
	private String ContactNumber;
	private String UserType;
    Scanner sc=new Scanner(System.in);
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
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
	public String getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(String employeeId) {
		EmployeeId = employeeId;
	}
	public String getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}
	public String CreateNewUser(SignUp NewUser) {
		System.out.print("Enter your username:");
		NewUser.setUserName(sc.next());
		System.out.print("Enter your emailid:");
		NewUser.setEmailId(sc.next());
		System.out.print("Enter your password:");
		NewUser.setPassword(sc.next());
		System.out.print("Enter your employeeid:");
		NewUser.setEmployeeId(sc.next());
		System.out.print("Enter your contactNo:");
		NewUser.setContactNumber(sc.next());
		System.out.print("Enter your UserType:");
		NewUser.setUserType(sc.next());
		System.out.println("Registration Successful");
		return NewUser.getEmployeeId();
	}
	public String getUserType() {
		return UserType;
	}
	public void setUserType(String userType) {
		UserType = userType;
	}
}
