import java.util.Scanner;
public class ExcHandling {

	public static void main(String[] args) {
		System.out.println("Welcome to registration process\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age and weight of the student\n");
		int age = sc.nextInt();
		int weight = sc.nextInt();
		if(age<18&&weight<40) {
			throw new ArithmeticException("Student is not eligible for registration");
		}
		else
			System.out.println("Student entry is possible...");
    System.out.println("Have a nice day...");
	}

}
