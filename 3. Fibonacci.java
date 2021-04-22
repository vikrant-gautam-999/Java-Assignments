//3. Print Fibonacci series (count should be taken as an input)
import java.util.Scanner;
public class Fibonacci{
	public static void main(String[] args){
	    Scanner s = new Scanner(System.in);
		System.out.print("Count = ");
		int n = s.nextInt();
		int num1 = 0, num2 = 1, num3;
		System.out.print(num1+" "+num2);
		for(int i=1; i<=n-2; i++)
		{
			num3 = num1 + num2;
			System.out.print(" "+num3);
			num1 = num2;
			num2 = num3;
		}
	}
}