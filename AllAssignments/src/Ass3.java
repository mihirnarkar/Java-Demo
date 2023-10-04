
/*
3.Write a program to accept and display 3 by 3 matrix. Use enhanced for loop for display.
a.Find the transpose of a matrix and print the transpose. 
b.Accept another matrix of same dimensions.  Find the addition of two matrices and print the resultant matrix. 
 */

import java.util.Scanner;

public class Ass3 {

	public static void main(String[] args) {
//		3
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number of rows and columns");
//		System.out.print("Number of rows: ");
//		int rows = sc.nextInt();
//		
//		System.out.print("Number of columns: ");
//		int cols = sc.nextInt();
//		
//		int [][] arr = new int[rows][cols];
//		
////		Storing value
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print("Enter value of ["+i+"]["+j+"] : ");
//				int userNum = sc.nextInt();
//				arr[i][j] = userNum;
//			}
//		}
//		
////		Displaying value using enhanced for loop:-
//		for(int [] row:arr) {
//			for(int val: row) {
//				System.out.print(val+" ");
//			}
//			System.out.println();
//		}
		
//		-------------------------------------------------------------------------
		
//		3.b
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns for matrix 1");
		System.out.print("Number of rows: ");
		int rows = sc.nextInt();
		
		System.out.print("Number of columns: ");
		int cols = sc.nextInt();
		
		int [][] arr = new int[rows][cols];
		
//		Storing value for matrix 1
		for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print("Enter value of ["+i+"]["+j+"] : ");
			int userNum = sc.nextInt();
			arr[i][j] = userNum;
		  }
	    }
		
//		Displaying value for matrix 1
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("---------------------------------------------");
		
		System.out.println("Enter the number of rows and columns for matrix 2");
		System.out.print("Number of rows: ");
		int rows1 = sc.nextInt();
		
		System.out.print("Number of columns: ");
		int cols1 = sc.nextInt();
		
		int [][] arr1 = new int[rows1][cols1];
		
//		Storing value for matrix 2
		for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr1[i].length;j++) {
			System.out.print("Enter value of ["+i+"]["+j+"] : ");
			int userNum = sc.nextInt();
			arr1[i][j] = userNum;
		  }
	    }
		
//		Displaying value for matrix 2
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------");
		
		System.out.println("Addition of two matrix: ");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr[i][j]+arr1[i][j]+" ");
			}
			System.out.println();
		}
		*/
		
		
//		------------------------------------------------------------
		
		
//		3.a
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns for matrix ");
		System.out.print("Number of rows: ");
		int rows = sc.nextInt();
		
		System.out.print("Number of columns: ");
		int cols = sc.nextInt();
		
		int [][] arr = new int[rows][cols];
		
//		Storing value for matrix 1
		for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print("Enter value of ["+i+"]["+j+"] : ");
			int userNum = sc.nextInt();
			arr[i][j] = userNum;
		  }
	    }
		
//		Displaying value for matrix 1
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------");
		System.out.println("Transpose of a matrix");
		int [][] transposeArr = new int[cols][rows];

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				transposeArr[j][i] = arr[i][j];
			}
		}
		
		for(int i=0;i<transposeArr.length;i++) {
			for(int j=0;j<transposeArr[i].length;j++) {
				System.out.print(transposeArr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
