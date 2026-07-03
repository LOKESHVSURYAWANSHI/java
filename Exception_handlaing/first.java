package Exception_handlaing;

public class first {

	public static void main(String[] args) {
		tiger t=new tiger("Lokesh");
		System.out.println(t.getName());
		
	}

}

class animal{
	String name;

	public animal(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name ;
	}
}
class tiger extends animal{

	public tiger(String name) {
		super(name);
		
	}

	
	
}
