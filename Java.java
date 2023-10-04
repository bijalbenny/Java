import java.util.*;
public class Java {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int ROW_SIZE,COL_SIZE;
		System.out.println("Enter the row and column");
		ROW_SIZE = sc.nextInt();
		COL_SIZE = sc.nextInt();
		int [][] matrix = new int[ROW_SIZE][COL_SIZE];
		System.out.println("Enter the elements:");
		for(int i=0;i<ROW_SIZE;i++) {
			for(int j=0;j<COL_SIZE;j++) {
				matrix[i][j]= sc.nextInt();
			}
		}
		for(int i=0;i<ROW_SIZE;i++) {
			for(int j=0;j<COL_SIZE;j++) {
				if(i==j||(i+j)==COL_SIZE-1) {
					matrix[i][j]=0;
				}
			}
		}
		System.out.println("The given matrix is:");
		for(int i=0;i<ROW_SIZE;i++) {
			for(int j=0;j<COL_SIZE;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
				
			}
	}

}
