//6. Find out odd and even numbers in the given array
import java.util.Scanner;
public class Evenodd{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Size of an array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter array elements: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("Even numbers: ");
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0){
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		System.out.print("Odd numbers: ");
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}