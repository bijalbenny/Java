import java.util.Scanner;
import java.util.StringTokenizer;
public class StringTokensDemo {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Integers");
		String LineOfIntegers = sc.nextLine();
		StringTokenizer str = new StringTokenizer(LineOfIntegers);
		int sum=0;
		while(str.hasMoreTokens()) {
			int num= Integer.parseInt(str.nextToken());	
			System.out.println(num);
			sum+=num;
		}
		System.out.println("Sum is : "+sum);
		
	}
}
