package inheritance;


public class First {

	public static void main(String[] args) {
		One one=new One();
		one.run();	
		Two t=new Two();
		t.run();
		t.po();
		t.setName("Lokesh");
		System.out.println(t.getName());
		
	}
}
class One{
	private String name;
	
	public String getName() {
		return this.name;
		
		
		
		
		
		
		
		
		
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println("hiii");
		System.out.println("class one");
	}
}
class Two extends One{
	
	
	
	public void po() {
		System.out.println("child");
	}
	
	 
	
}
