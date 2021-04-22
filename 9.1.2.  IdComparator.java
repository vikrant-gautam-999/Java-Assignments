//class defining method for SortUsingArray using Comparator
import java.util.Comparator;

public class IdComparator implements Comparator<Subject2>
{
	public int compare(Subject2 user1, Subject2 user2)
	{
		return user1.getId() - user2.getId();
	}
}
