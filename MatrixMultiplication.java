
/***************************************************************************
 * File          :          MatrixMultiplication.java
 * Descriptiopn  :          Java program to multiply two matrix.
 * Author        :          Bijal T Benny
 * Version       :          1.0
 * Date          :          06/10/2023
 * *************************************************************************/
import java.util.Scanner;
public class MatrixMultiplication {

	public static void main(String[] args) {
		int i,j,k,ROW1,COL1,ROW2,COL2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row and column of the first matrix:");
		ROW1=sc.nextInt();
		COL1=sc.nextInt();
		System.out.println("Enter the row and column of the second matrix:");
		ROW2=sc.nextInt();
		COL2=sc.nextInt();
		int[][]firstMatrix=new int[ROW1][COL1];
		int[][]secondMatrix=new int[ROW2][COL2];
		int [][]resultantMatrix=new int[ROW1][COL2];
		 if (COL1==ROW2) {
			System.out.println("Matrix multiplication is possible.");
			System.out.println("Enter the elements of the first matrix: ");
			for(i=0;i<ROW1;i++) {
				for(j=0;j<COL1;j++) {
					firstMatrix[i][j]=sc.nextInt();
				}	
		    }
			System.out.println("Enter the elements of the second matrix: ");
			for(i=0;i<ROW2;i++) {
				for(j=0;j<COL2;j++) {
					secondMatrix[i][j]=sc.nextInt();
				}	
		    }
			//Matrix Multiplication
			for(i=0;i<ROW1;i++) {
				for(j=0;j<COL2;j++) {
					resultantMatrix[i][j]=0;
					for(k=0;k<ROW2;k++) {
						resultantMatrix[i][j]=resultantMatrix[i][j]+firstMatrix[i][k]*secondMatrix[k][j];
					}	
				}
			}
			System.out.println("The resultant matrix is : ");
			for(i=0;i<ROW1;i++) {
				for(j=0;j<COL2;j++) {
					System.out.print(resultantMatrix[i][j]+" ");
				}
				System.out.println("\n");
			}
		 }
		 else {
			System.out.println("Matrix multiplication is not possible");
		}			
	}
}
