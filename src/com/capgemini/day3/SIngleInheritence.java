package com.capgemini.day3;

 




//Where we are using the method of parent class in child class
//accessing the member variable of parent class
//parent class
//super class
//base class
class A
{

//Constructor --it will have the same name as class
//it is called automatically when object is created	 
A()
{
System.out.println("A Constrcutor");	
}
//git testing 
	 
	 //git new code
public int a=10;	
public void printA()
{
	System.out.println("I am class A");
}
	
}

//class keyword  extends keyword  class name

//child class
//sub class
class B extends A
{
public int b=20;	
public void printB()
{
System.out.println("i m class B");	
}


B()
{
	//calling the A class Constructor
  //super will be first statement 
super();
System.out.println("B class Constructor");
super.printA();

}
	
}


public class SIngleInheritence {
	
	
	public static void main(String args[])
	{	
		//using the class B
		B b=new B();
		b.printB();
		b.printA();
		System.out.println("B Blongs to A class "+b.a);
		System.out.println("B blongs to B class "+b.b);
		
	}

}
