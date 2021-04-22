//Sort ArrayList of objects using Comparable
import java.util.*;

public class SortUsingComparable
{
	public static void main(String[] args){
		List<Subject> course = new ArrayList<Subject>();
		Subject user1 = new Subject(161, "Node.js");
		Subject user2 = new Subject(108, "Angular.js");
		Subject user3 = new Subject(119, "Spring");
		Subject user4 = new Subject(156, "Java");
		Subject user5 = new Subject(56, "Notepad++");
		
		course.add(user1);
		course.add(user2);
		course.add(user3);
		course.add(user4);
		course.add(user5);
		
		System.out.println("Unsorted ArrayList");
		for(Subject user : course)
		{
			System.out.println(user);
		}
		
		Collections.sort(course);
		
		System.out.println();
		System.out.println("Sorted ArrayList");
		for(Subject user : course)
		{
			System.out.println(user);
		}
	}
}
