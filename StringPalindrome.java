/***************************************************************************
 * File          :          StringPalindrome.java
 * Descriptiopn  :          Java program to check whether a string is Palindrome or not.
 * Author        :          Bijal T Benny
 * Version       :          1.0
 * Date          :          29/09/2023
 * *************************************************************************/
import java.util.Scanner;
public class StringPalindrome {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String input = sc.next();
		boolean isPalindrome = check(input);
		if(isPalindrome) {
		System.out.println("String is Palindrome");
		}
		else
			System.out.println("String is not Palindrome");	
/*Function receives a string as input
 * return true if it is palindrome
 * else returns false*/
	}
	static boolean check(String input) {
		char[] charArray = input.toCharArray();
		int length = input.length();
		for(int i=0;i<=length/2;i++)
		{
			if(charArray[i]!=charArray[length-i-1])
			{
				return false;
			}
		}
		return true;
			}
		}
		
