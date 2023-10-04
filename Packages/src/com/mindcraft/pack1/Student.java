package com.mindcraft.pack1;

public class Student {
	int rollNo;
	String name;

	public Student(int rollNo,String name){
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public void showStudent() {
		System.out.println("Name: "+this.name);
		System.out.println("Roll no: "+this.rollNo);
	}

}
