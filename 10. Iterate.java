//10.Program to iterate hashmap, ArrayList using loop and for each.
import java.util.*;
public class Iterate{
	public static void main(String[] args){
		Map<Integer, String> hash_map = new HashMap<Integer, String>();
		hash_map.put(1, "HTML and CSS");
		hash_map.put(2, "Javascript");
		hash_map.put(3, "Java");
		System.out.println("Iterating hashmap using loop: ");
		for(Map.Entry<Integer, String> set : hash_map.entrySet())
		{
			System.out.println(set.getKey() + " = "+ set.getValue());
		}
		System.out.println();
		System.out.println("Iterating hashmap using foreach: ");
		hash_map.forEach((key,value) -> System.out.println(key + " = "+ value));
		
		List<Integer> arr = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		System.out.println();
		System.out.println("Iterating ArrayList using loop: ");
		for(int i=0; i<arr.size(); i++)
		{
			System.out.print(arr.get(i) + " ");
		}
		System.out.println();
		System.out.println("Iterating ArrayList using foreach: ");
		for(Integer i : arr)
		{
			System.out.print(i + " ");
		}
	}
}