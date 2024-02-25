package Users;

import java.util.ArrayList;
import java.util.LinkedList;


public class Users {
	
	public static LinkedList<Employee> userlist;
	static {
		userlist = new LinkedList<>();
		userlist.add(new Employee("sudhan","sudhan123","madhusudhan"));
	}
	
	public boolean checkIfUserExists(String name , String password){
		for (Employee employee : userlist) {
			if(name.equals(employee.getUserName()) && password.equals(employee.getPassword())) {
				return true;
			}
		}
		return false;
	}
	
	public void register(String username , String password , String fullname) {
		userlist.add(new Employee(username,password,fullname));
		
	}
}
