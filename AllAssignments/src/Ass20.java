/*
20.Create two different threads t1 and t2.
   t1 ==> prints next 10 incremented values of user entered number 
   t2 ==> prints multiplication table of the user entered number
 */

import java.util.Scanner;

class T1 extends Thread{
	private int num;
	
	public T1(int num) {
		this.num = num;
	}
	
	public void run() {
		int common=1;
		for(int i=this.num;i<this.num+10;i++) {
			System.out.println(i+"+"+common+"="+(i+1));
		}
	}
}

class T2 extends Thread{
	public int num;
	
	public T2(int num) {
		this.num = num;
	}
	
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(this.num+"X"+i+"="+this.num*i);
		}
	}
}

public class Ass20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to get next 10 numbers: ");
		int num = sc.nextInt();
		System.out.println("Enter number to generate table: ");
		int newNum = sc.nextInt();
		T1 t = new T1(num);
		t.start();
		T2 tnew = new T2(newNum);
		tnew.start();
	

	}

}
