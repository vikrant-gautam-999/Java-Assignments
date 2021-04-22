//4. Find out the second highest number in the given array
import java.util.Scanner;
public class SecondHighest{
	public static void main(String[]args){
		Scanner sc  = new Scanner(System.in);
		System.out.print("Number of elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the elements: ");
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		int largest = Integer.MIN_VALUE;
		int sec_largest = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>largest)
			{
				sec_largest = largest;
				largest =arr[i];
			}
			else if(arr[i]>sec_largest && arr[i] != largest)
			{
				sec_largest = arr[i];
			}
		}
		if(sec_largest == Integer.MIN_VALUE)
		{
			System.out.println("No second largest element in the list");
		}
		else
		{
			System.out.println("Second largest element is: "+sec_largest);
		}
	}
}