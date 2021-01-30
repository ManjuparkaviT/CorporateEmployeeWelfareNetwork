package controller;
import model.Login;
import model.SignUp;
import service.Employee;
import service.Employer;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String,String> logins =new HashMap<String,String>();
	    HashMap<String,String> Welfare=new HashMap<String,String>();
		ArrayList<ArrayList<String>> userDetails=new ArrayList<ArrayList<String>>();
		while(true) {
			
			System.out.println("Do you want to enter the site(y/n)?");
			
			if(sc.next().equals("y")){
				
				System.out.print("Login/SignUp:");
				sc.nextLine();
				
				if(sc.nextLine().equals("Login")) {//if we want to login
					
					System.out.print("Enter EmployeeId:");
					String EmployeeId=sc.nextLine();
					
					System.out.print("Enter your email-id,password,the type of user(Employee/Employer):");//Details to be entered
					Login user=new Login(sc.next(),sc.next(),sc.next(),EmployeeId);
					
					if(!logins.get(user.getEmailId()).equals(user.getPassword())) {//Checking whether the emailId and password matches
						
						System.out.print("Invalid EmailId/Password");
					}
					
					else {
						if(user.getUserType().equals("Employee")) {//checking whether the indicated person is an employee or employer
							Employee staff = new Employee();
							
							System.out.print("Do you want modify your details(y/n):");
							sc.nextLine();
							
							if(sc.next().equals("y")) {//To modify their own information
								
								staff.ModifyUserDetails(staff);
							    userDetails.add(new ArrayList<String>(Arrays.asList(staff.getInnovativeThoughts(),staff.getEvents(),
							    		staff.getProperty(),staff.getWorkExperience(),staff.getDOB(),staff.getEmployeeId())));
							    
							}
							
							System.out.print("Do you want view your details(y/n):");
							sc.nextLine();
							
							if(sc.next().equals("y")){
								
								staff.ViewUserdetails(userDetails,EmployeeId);//To view their information
							}
							
							System.out.print("Do you want to view your Welfare status(y/n):");
							sc.nextLine();
							if(sc.next().equals("y")) {
								
								staff.ViewWelfareStatus(Welfare,EmployeeId);//to view their welfare status
							}
							
							
						}
						else {
							
							Employer admin =new Employer();
							admin.viewEmployeedetails(userDetails,Welfare);
							
						}
					}
					
				}
				else {//for signingUp
					
					SignUp NewUser=new SignUp();
				    String Id=	NewUser.CreateNewUser(NewUser);
				    
				    
					if(NewUser.getUserType().equals("Employer")) {
						
						logins.put(NewUser.getEmailId(),NewUser.getPassword()+"Emp");
					}
					else {
						
						logins.put(NewUser.getEmailId(),NewUser.getPassword());
						Welfare.put(Id, null);
					}
					
				}		
			}
			
		    else{
		    	
				break;
			}
		}sc.close();

	}
	
}


