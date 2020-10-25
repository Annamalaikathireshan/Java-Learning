package Inheritance;

public class Employee extends Person {

	private int empID;
	private double Salary;
	private int PerformanceRating;

	public Employee() {
		super();
		empID = 1001;
		Salary = 10000;
		PerformanceRating = 4;
	}

	public Employee(int empID, double Salary, int PerformanceRating) {
		super("unna", "malai", 40);
		this.empID = empID;
		this.Salary = Salary;
		this.PerformanceRating = PerformanceRating;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public int getPerformanceRating() {
		return PerformanceRating;
	}

	public void setPerformanceRating(int performanceRating) {
		PerformanceRating = performanceRating;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + PerformanceRating;
		long temp;
		temp = Double.doubleToLongBits(Salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + empID;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (PerformanceRating != other.PerformanceRating)
			return false;
		if (Double.doubleToLongBits(Salary) != Double.doubleToLongBits(other.Salary))
			return false;
		if (empID != other.empID)
			return false;
		return true;
	}

	@Override
	public String getFirstName() {
		return "veera";
	}

	public void PrintEmployeeDetails() {

		System.out.println(this);

	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", Salary=" + Salary + ", PerformanceRating=" + PerformanceRating
				+ ",Person.FirstName()=" + super.getFirstName() + ",Person.LastName()=" + getLastName()
				+ ",Person.Age()=" + getAge() + "]";
	}

}
