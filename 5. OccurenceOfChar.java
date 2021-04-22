//5. Find out the occurrence of characters in a string and also print character with the highest occurrence
import java.util.Scanner;
public class OccurenceOfChar{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.nextLine();
		char[] name = str.toCharArray();
		int[] freq = new int[str.length()];
		int len = name.length;
		int i=0, j=0, count=0;
		for(i=0; i<len; i++){
			count = 0;
		    for(j=0; j<len; j++)
		    {
			    if(j<i && name[i]==name[j])
			    {
				    break;
			    }
			    if(name[i] == name[j])
			    {
				    count++;
			    }
			    if(j==len-1)
			    {
				    System.out.println(name[i]+ " occur "+ count+ " time(s)");
			    }
			}
		}
		char maxChar = str.charAt(0);
		int max;
		for(i=0; i<name.length; i++)
		{
			freq[i] = 1;
			for(j=i+1; j<name.length; j++)
			{
				if(name[i]==name[j] && name[i]!=' ' && name[i]!='0')
				{
					freq[i]++;
					name[j] = '0';
				}
			}
		}
		max = freq[0];
		for(i=0; i<freq.length; i++)
		{
			if(max<freq[i])
			{
				max = freq[i];
				maxChar =name[i];
			}
		}
		System.out.print("Highest occuring character is "+ maxChar);
	}
	
}