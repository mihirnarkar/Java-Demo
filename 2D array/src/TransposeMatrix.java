
public class TransposeMatrix {

	public static void main(String[] args) {
		int [][] arr = {
				        {1,2,3},
				        {4,5,6}
				       };
		
//		Displaying before transpose
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		int rows = arr.length;
		int cols = arr[0].length;
		
//		Transpose the matrix
		int [][] transposedMatrix = new int[cols][rows];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				transposedMatrix[j][i] = arr[i][j];
			}
		}
		
		System.out.println();
		
//		Display the transpose matrix
		
		for(int i=0;i<transposedMatrix.length;i++) {
			for(int j=0;j<transposedMatrix[i].length;j++) {
				System.out.print(transposedMatrix[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
//		Transpose of matrix
		
	}

}
