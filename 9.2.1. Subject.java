//field and method class for SortUsingAComparable using Comparable 
public class Subject implements Comparable<Subject>
{
	int id;
	String name;
	
	public Subject(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String toString(){
		return id + " : " + name;
	}
	
	//Override
	public int compareTo(Subject user){
		return id - user.getId();
	}
}
