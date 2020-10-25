package Inheritance;

public class Person {
	
	private String firstName;
	private String LastName;
	private int Age;

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Age;
		result = prime * result + ((LastName == null) ? 0 : LastName.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		return result=1000;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (Age != other.Age)
			return false;
		if (LastName == null) {
			if (other.LastName != null)
				return false;
		} else if (!LastName.equals(other.LastName))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		return true;
	}
	
	/*
	 * @Override public String toString() { return "Person [firstName=" + firstName
	 * + ", LastName=" + LastName + ", Age=" + Age + "]"; }
	 */
	public Person() {
		firstName = "Malai";
		LastName = "Anna";
		Age = 22;
		System.out.println("No-argument constructor");
	}
	public Person(String FirstName,String LastName,int Age) {
		this.firstName = FirstName;
		this.LastName = LastName;
		this.Age = Age;
		System.out.println("Parameterized constructor");
	}
	
}
