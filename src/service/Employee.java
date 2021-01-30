package service;

import java.util.*;

public class Employee {
	private String InnovativeThoughts;
	private String Events;
	private String WorkExperience;
	private String Property;
	private String DOB;
	private String EmployeeId;
	Scanner sc=new Scanner(System.in);
	
	public String getInnovativeThoughts() {
		return InnovativeThoughts;
	}
	public void setInnovativeThoughts(String innovativeThoughts) {
		InnovativeThoughts = innovativeThoughts;
	}
	public String getEvents() {
		return Events;
	}
	public void setEvents(String events) {
		Events = events;
	}
	public String getWorkExperience() {
		return WorkExperience;
	}
	public void setWorkExperience(String workExperience) {
		WorkExperience = workExperience;
	}
	public String getProperty() {
		return Property;
	}
	public void setProperty(String property) {
		Property = property;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	
	public void ModifyUserDetails(Employee staff) {
		System.out.print("Do you need to modify your InnovativeThoughts section:y/n");
		if(sc.next().equals("y")) {
			System.out.print("Enter about your Thoughts:");
			sc.nextLine();
			staff.setInnovativeThoughts(sc.nextLine());
		}
		System.out.print("Do you need to modify your Events section:y/n");
		if(sc.next().equals("y")) {
			System.out.print("Enter about your Events:");
			sc.nextLine();
			staff.setEvents(sc.nextLine());
		}
		System.out.print("Do you need to modify your WorkExperience section:y/n");
		if(sc.next().equals("y")) {
			System.out.print("Enter about your Workexperience:");
			sc.nextLine();
			staff.setWorkExperience(sc.nextLine());
		}
		System.out.print("Do you need to modify your property section:y/n");
		if(sc.next().equals("y")) {
			System.out.print("Enter about your Property:");
			sc.nextLine();
			staff.setProperty(sc.nextLine());
		}
		System.out.print("Do you need to modify your DOB section:y/n");
		if(sc.next().equals("y")) {
			System.out.print("Enter your DOB:");
			sc.nextLine();
			staff.setDOB(sc.nextLine());
		}
		System.out.print("Do you need to modify your EmployeeId:y/n");
		if(sc.next().equals("y")) {
			System.out.print("Enter your EmployeeId:");
			sc.nextLine();
			staff.setEmployeeId(sc.nextLine());
		}
	}
	
	public void ViewUserdetails(ArrayList<ArrayList<String>> userDetails,String EmployeeId) {
		for(String i:userDetails.get(0)) {
			System.out.print(i+" ");
		}
		for(ArrayList <String> row : userDetails) {
			if(row.get(5).equals(EmployeeId)) {
				for(String user:row ) {
					System.out.print(user+" ");
			}
		}
		System.out.println("");
		}
		
	}
	
	public void ViewWelfareStatus(HashMap<String,String> Welfare,String EmployeeId) {
		 System.out.println(Welfare.get(EmployeeId));
	}
	public String getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(String employeeId) {
		EmployeeId = employeeId;
	}
}
