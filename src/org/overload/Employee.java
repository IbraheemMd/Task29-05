package org.overload;

public class Employee {
	public void empId(String name) {
		System.out.println(name);
		
	}
	//method
 public void empId(int regno) {
	 System.out.println(regno);
 }
 //arguments
	public void empId(long phno,String email,String gender) {
		System.out.println(phno + email + gender);

	}
	//order
	public void empId(String project,String Manager) {
		System.out.println(project + Manager);

	}
	public void empId(float salary,String doj) {
	System.out.println(salary +  doj);

	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.empId("123");
		e.empId("Chaitu");
		e.empId(9876544443l, "-123@gmail.com-", "-Male");
		e.empId("abc-", "-efewwf");
		e.empId("1lakh-", "-30-05-1993");
	}
	
}
