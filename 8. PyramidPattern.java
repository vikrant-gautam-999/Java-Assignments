
//8.     *
//       * *
//      * * *
//     * * * *
//    * * * * *
//Print this using for loop.
import java.util.Scanner;
public class PyramidPattern{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		for(int i=1; i<=num; i++)
		{
			for(int j=num; j>=1; j--)
            {
				if(j>i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(" *");
				}
			}
			System.out.println();
        }    
	}
}