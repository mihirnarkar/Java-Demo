/*
4. Write a method “add” to add n number of integers. Use VarArgs
 */

import java.util.Scanner;

public class Ass4 {
	public static int add(int ...a) {
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum += a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Two numbers addition: ");
		System.out.print("Enter num 1: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter num 2: ");
		int num2 = sc.nextInt();
		
		System.out.println("Three numbers addition: ");
		
		System.out.print("Enter num 1: ");
		int num_1 = sc.nextInt();
		
		System.out.print("Enter num 2: ");
		int num_2 = sc.nextInt();
		
		System.out.print("Enter num 3: ");
		int num_3 = sc.nextInt();
		
		System.out.println("------------------------------");
		System.out.println(num1+"+"+num2+"="+add(num1,num2));
		System.out.println(num_1+"+"+num_2+"+"+num_3+"="+add(num_1,num_2,num_3));
		
	}

}
