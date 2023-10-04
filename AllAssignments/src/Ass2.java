/*
 2.Accept five integers in an array -
a.Find maximum and minimum of the integers. Do not sort the array.
b.Multiply each element of the array by 5 and store it in another array and display it.
 */

import java.util.Scanner;
public class Ass2 {

	public static void main(String[] args) {
//		 Q1(a) -> Solution
		
		/*
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[5];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter num "+(i+1)+": ");
			int userNum = sc.nextInt();
			arr[i] = userNum;
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		System.out.println("Max element from array: "+max);
		System.out.println("Min element from array: "+min);
		*/
		
		
//		Q(2) - b --> solution
//		Now we will create here an 2D array and then we will multiply it by 5
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns");
		System.out.print("Number of rows: ");
		int rows = sc.nextInt();
		
		System.out.print("Number of columns: ");
		int cols = sc.nextInt();
		
		int [][] arr = new int[rows][cols];
		
//		Storing value
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("Enter value of ["+i+"]["+j+"] : ");
				int userNum = sc.nextInt();
				arr[i][j] = userNum;
			}
		}
		
//		Displaying value
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------");
		System.out.println("After multipling by 5");
		
//		Multiplying array by 5
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = arr[i][j] * 5;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
