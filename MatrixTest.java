public class MatrixTest{
	static int row, col;
	static int[][] matrix;

	public static void main(String[] args) {
		inputMatrix();
		printMatrix();
	}

	public static void inputMatrix(){
		System.out.println("Input row: ");
		row = new java.util.Scanner(System.in).nextInt();
		System.out.println("Input column: ");
		col = new java.util.Scanner(System.in).nextInt();
		matrix  = new int[row][col];
		for(int i = 0; i < row; i++){
			for(int j = 0; j <col; j++){
				System.out.print("a["+i+"]["+j+"]"+"=");
				matrix[i][j] = new java.util.Scanner(System.in).nextInt();
				System.out.println();
			}
		}
	}

	public static void printMatrix(){
		for(int i = 0; i < row; i++){
			for(int j = 0; j <col; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}