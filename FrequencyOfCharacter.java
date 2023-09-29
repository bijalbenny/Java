/***************************************************************************
 * File          :          FrequencyofCharacter.java
 * Descriptiopn  :          Java program to find the frequency of a character.
 * Author        :          Bijal T Benny
 * Version       :          1.0
 * Date          :          29/09/2023
 * *************************************************************************/
import java.util.Scanner;
public class FrequencyOfCharacter {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String:");
	//input string
	String input = sc.nextLine();
	//Input a Character
	System.out.println("Enter a Character:");
	char checkMe = sc.next().charAt(0);
	 int charCount=checkFreq(input,checkMe);
	System.out.println("The number of occurences of given character is "+charCount);
}
	/*function that returns the count of the character in the string*/  
	static int checkFreq(String input,char checkMe) {
		char[] charArray = input.toCharArray();
		int charCount = 0;
		for(int i=0;i<input.length();i++) {
			if(charArray[i]==checkMe) {
				charCount++;
		}
	}
		return charCount;
	}
}