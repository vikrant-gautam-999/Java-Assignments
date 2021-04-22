//7. Print factorial of given number using recursion
import java.util.Scanner;
public class Factorial{
	static int fact = 1;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Number: ");
		int num = sc.nextInt();
		Factorial fac = new Factorial();
		fac.callFact(num);
		System.out.print("Factorial of "+ num + " is "+ fact);
	}
	void callFact(int n){
		if(n>=1){
			fact = fact*n;
			callFact(n-1);
		}
	}
}