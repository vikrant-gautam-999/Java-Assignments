//field class for SortUsingComparator
public class Subject2
{
	int id;
	String name;
	
	public Subject2(int id, String name){
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
}
