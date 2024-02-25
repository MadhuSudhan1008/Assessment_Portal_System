package Services;

import java.util.Scanner;

import Assessment.Assessment;
import Users.Employee;
import Users.Users;

public class Services {
	Scanner sc = new Scanner(System.in);
	Users u = new Users();
	Assessment a = new Assessment();
	public void login(){
		
		System.out.println("enter your username");
		String name = sc.next();
		System.out.println("enter your password");
		String password = sc.next();
		
	
		Boolean login = checkIfUserExists(name,password);	
		
		if(login) {
			a.displayInformation();
		}
		else{
			System.err.println("You are not a existing user Kindy register to Login ");
			register();
			
		}
	}
	public void register() {
		System.out.println("enter your username");
		String username = sc.next();
		System.out.println("enter your password");
		String regpassword = sc.next();
		System.out.println("enter your fullname");
		String fullname = sc.next();
		u.register(username,regpassword,fullname);
		System.out.println("you Have Registered Successfully");
		System.out.println("Please enter your Login details to Continue");
		login();
	}

	private Boolean checkIfUserExists(String name, String password) {
		// TODO Auto-generated method stub
		for (Employee employee : Users.userlist) {
			if(name.equals(employee.getUserName()) && password.equals(employee.getPassword())){
				return true;
			}
		}
		return false;
	}

}
