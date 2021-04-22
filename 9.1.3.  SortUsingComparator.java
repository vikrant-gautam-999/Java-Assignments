//9.2 Sort ArrayList of objects using Comparator
import java.util.*;

public class SortUsingComparator
{
	public static void main(String[] args){
		List<Subject2> course = new ArrayList<Subject2>();
		Subject2 user1 = new Subject2(161, "Node.js");
		Subject2 user2 = new Subject2(108, "Angular.js");
		Subject2 user3 = new Subject2(119, "Spring");
		Subject2 user4 = new Subject2(156, "Java");
		Subject2 user5 = new Subject2(56, "Notepad++");
		
		course.add(user1);
		course.add(user2);
		course.add(user3);
		course.add(user4);
		course.add(user5);
		
		System.out.println("Unsorted ArrayList");
		for(Subject2 user : course)
		{
			System.out.println(user);
		}
		
		Collections.sort(course, new IdComparator());
		
		System.out.println();
		System.out.println("Sorted ArrayList");
		for(Subject2 user : course)
		{
			System.out.println(user);
		}
	}
}
