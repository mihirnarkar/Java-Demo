import java.util.Scanner;

public class MultiplyArrayBy5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows: ");
		int row = sc.nextInt();
		System.out.println("Enter columns: ");
		int column = sc.nextInt();
		int [][] arr = new int[row][column]; // 2 3
		
//		Take user input: 
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("Enter number for "+i+","+j+": ");
				int num = sc.nextInt();
				arr[i][j] = num;
			}
			System.out.println();
		}
		
		System.out.println("Your array: ");
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("After multiplying by 5: ");
		
		
//		After multiplying by 5
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				int temp = arr[i][j];
				temp *= 5;
				arr[i][j] = temp;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		

	}

}
