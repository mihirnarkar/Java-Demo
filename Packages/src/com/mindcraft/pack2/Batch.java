package com.mindcraft.pack2;

public class Batch {
	String courseName;
	int batchStrength;

	public Batch(String courseName,int batchStrength){
		this.courseName = courseName;
		this.batchStrength = batchStrength;
	}
	
	public void showBatch() {
		System.out.println("Course name: "+this.courseName);
		System.out.println("Batch name: "+this.batchStrength);
	}

}
