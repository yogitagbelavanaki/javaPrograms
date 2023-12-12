package program;

public class EmployeeClassWith_toStringAnd_equals {
	
	String employeeName;
	String employeeID;
	int salary;
	
	public EmployeeClassWith_toStringAnd_equals(String employeeName, String employeeID, int salary) {
		this.employeeID=employeeID;
		this.employeeName=employeeName;
		this.salary=salary; 
	}
	
	public void toString(EmployeeClassWith_toStringAnd_equals variable) {
		System.out.println(variable.employeeID);
		System.out.println(variable.employeeName);
		System.out.println(variable.salary);
	}
	
	public boolean equals(Object object1, Object object2) {
		boolean flag=object1.equals(object2);
		return flag;
	}
	
	public static void main(String[] args) {
		Object one=30;
		Object two=30;
		EmployeeClassWith_toStringAnd_equals classVariable=new 
				EmployeeClassWith_toStringAnd_equals("Sandeep", "TYPFEDUP12", 5000);
		classVariable.toString(classVariable);
		if(classVariable.equals(one, two)) {
			System.out.println("Objects are equal");
		}
	}

}
