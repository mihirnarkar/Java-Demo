
public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {{1,2,3},{4,5,6}};
		
		System.out.println("Printing using normal for loop: ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
		}
		System.out.println();

		System.out.println("Printing using for each loop: ");
		for(int []temp: arr) {
			for(int val : temp) {
				System.out.print(val+" ");
			}
		}
	}

}
