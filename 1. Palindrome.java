//1. Find out if a given string is palindrome or not
import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args){
		String str, rev = "";
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the string = ");
		str = s.nextLine();
		for(int i = str.length() - 1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println("Yes, String is a palindrome");
		}
		else
		{
			System.out.println("No, String is not a palindrome");
		}
	}
	
}
