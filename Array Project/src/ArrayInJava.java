import java.util.Scanner;

public class ArrayInJava {

	public static void main(String[] args) {
    //  One way of declaration:-
//		int [] arr = new int[] {1,2,3,4,5};
		
   //   Another way of declaration:-
//		float [] newarr = {10.1f,20.1f,30.2f,40.4f};
		
		
//		Example 1:
		
		float [] arr = new float[5];
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter 5 floats");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter float "+(i+1)+": ");
			float num = sc.nextFloat();
			arr[i] = num;
		}
		System.out.println("Ordinary loop: "); // Use for both scanning and printing purpose
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Using for each loop: "); // Just for printing purpose
		for(float val : arr) {
			System.out.println(val+1);
		}
		
		
//		WAP to find out max and min element from an array without sorti
		
	}

}
