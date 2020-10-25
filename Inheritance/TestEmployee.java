package Inheritance;

public class TestEmployee {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.PrintEmployeeDetails();
		Employee employee2 = new Employee(1002,15000,3);
		employee2.PrintEmployeeDetails();
	}
}
