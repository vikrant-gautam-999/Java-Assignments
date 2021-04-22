//2. Write a program to reverse a string
import java.util.Scanner;
public class ReverseString{
	public static void main(String[] args){
		String str, rev = "";
		System.out.print("Enter the string = ");
		Scanner s = new Scanner(System.in);
		str = s.nextLine();
		for(int i = str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.print("Reversed string = ");
		System.out.println(rev);
	}
}