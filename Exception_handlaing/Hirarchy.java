package Exception_handlaing;

public class Hirarchy {

	public static void main(String[] args) {
		
		Grandparent g=new Grandparent("hii");
		
		System.out.println(g.getMessage());
		

	}

}

class troowbale {
	private String message;

	public troowbale(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
	public troowbale() {
		
	}

	
	
	
}

class Grandparent extends troowbale{

	public Grandparent(String message) {
		super(message);
		
	}
	
	public Grandparent() {
		
	}
	
	
	
}


