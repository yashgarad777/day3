package com.capgemini.day3;


//interface--it is keyword which is used to make he class as abstract
//it method should also be abstract 


//abstract method
//those method which does not have the body or just the defination

//by default class is also abstract
abstract interface Parent1
{
	//by default it is abstract only
	 //unimplemented method
abstract public void printParent1();
}
class Parent2
{
public void printParent2()
{
	System.out.println("Print Parent two");
}
}
//Multiple inheritance is not allowed in java 
//Child class can have only one parent class
//if child class tries to access two parents class which is not possible in java


//abstract interface always will be implemented 
//you have to implements the unimplemented method
class Child3 extends Parent2 implements Parent1
{
	public void printChild()
	{
		System.out.println("Child class");
	}
	//coming from the base child 
  @Override
	public void printParent1()
	{
		System.out.println("this is method from parent 1");
	}
}








public class MultipleIneritance {

	
	public static void main(String args[])
	{
		Child3 child=new Child3();
		child.printChild();
		child.printParent1();
		child.printParent2();
	
	}
}