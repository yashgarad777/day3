package com.capgemini.day3;
 
//early binding
//Overloading
//it can be done with same class
//we should have same method name with different parameters for this
//it does not consider the return value

class MyShape {

	//line
	public int draw(int a, int b) {
		System.out.println("line drawing ");
		return 0;
	}
	//circle
	public void draw(int a, int b,int c) {
		System.out.println("circle drawing ");
	}
	
	//Sequare
	public void draw(int a, int b,int c,int d) {
		System.out.println("Sequare drawing ");
	}


}

public class MyPolimorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyShape shape=new MyShape();
		shape.draw(1, 1);
		
	}

}