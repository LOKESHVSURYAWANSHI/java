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
		t.n();
		t.p();
		
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
	
	static void n(){
		System.out.println("pop");
	}
	protected void p() {
		System.out.println("n.......");
	}
}
class Two extends One{
	
	
	
	public void po() {
		System.out.println("child");
	}
	
	 
	
}
