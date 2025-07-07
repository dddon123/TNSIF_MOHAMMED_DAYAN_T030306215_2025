//Program to demonstrate static variables
package example_employee_details;

public class EmployeeDemo {

	public static void main(String[] args) {
		// Create the first object of the class and pass the two arguments with type
		// string and int.
		//System.out.println(Employee.companyName);
		Employee e = new Employee("Dayan", 124);
		System.out.println(e);
		
		// Similarly, create the second object of the class and pass the two arguments.
		e = new Employee("Adi", 123);
		System.out.println(e);
	}
}