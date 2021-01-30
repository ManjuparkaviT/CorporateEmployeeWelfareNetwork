package service;
import java.util.*;
public class Employer {
	 Scanner sc=new Scanner(System.in);
     public void viewEmployeedetails(ArrayList<ArrayList<String>> UserDetails,HashMap<String,String> Welfare) {
    	 System.out.println(UserDetails);
    	 for(String Id:Welfare.keySet()) {
    		 System.out.println(Id);
    		 System.out.print("Do you want approve welfare for this Employee(y/n):");
    		 if(sc.next().equals("y")) {
    			 Welfare.put(Id,"Approved");
             }
    		 else {
    			 Welfare.put(Id, "Rejected");
    		 }
    	 }
     }
}
