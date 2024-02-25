package Users;

public class Employee {
	
	private String userName;
	private String password;
	private String employeeFullName;
	public Employee(String userName, String password, String employeeFullName) {
		super();
		this.userName = userName;
		this.password = password;
//		this.assessmentMark = assessmentMark;
		this.employeeFullName = employeeFullName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmployeeFullName() {
		return employeeFullName;
	}
	public void setEmployeeFullName(String employeeFullName) {
		this.employeeFullName = employeeFullName;
	}

}
	
	

