package encapsulation;



public class First_p {

public static void main(String[] args) {
		
		Student s1=new Student();
		s1.setId(1);
		s1.setName("Lokesh");
		
		System.out.println(s1.getId());
		System.out.println(s1.getName());
	}
}
    class Student{
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
