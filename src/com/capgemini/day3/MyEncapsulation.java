package com.capgemini.day3;

 

//Data hiding 
//make the variable private
//it can be accessed by only method

class Employee
{
	public Employee(int empID, String name, float salary) {
		this.empID = empID;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	private int empID;
	private String name;
	private float salary;
	
}

public class MyEncapsulation{
	public static void main(String args[])
	{
		Employee employee=new Employee(1001, "Yash", 10000);
		System.out.println(employee.getEmpID()); //their name , id , salary
  //		employee.empID; //it is visible
		//not allowing private variable directly
	}

}