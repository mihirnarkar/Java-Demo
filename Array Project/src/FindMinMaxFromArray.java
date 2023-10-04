import java.util.Scanner;

public class FindMinMaxFromArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[5];
		
//		Stored array
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter num "+(i+1)+": ");
			int num = sc.nextInt();
			arr[i] = num;
		}
		
//		Initializing max and min with first element:
		int max = arr[0];
		int min = arr[0];
				
				
//      Iterating loop for checking condition
	    for(int i=0;i<arr.length;i++) {
	    	if(arr[i]>max) {
	    		max = arr[i];
	    	}
	    	
	    	if(arr[i]<min) {
	    		min = arr[i];
	    	}
	    }
		
		System.out.println("Maximum element from array: "+max);
		System.out.println("Minimum element from array: "+min);
	}

}
