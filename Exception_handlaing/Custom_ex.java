package Exception_handlaing;

public class Custom_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int money=40;
		if(money<50) {
			throw new Rtime("hiiii");
		}
		System.out.println("byee");

	}

}

class Rtime extends RuntimeException{
	
	String msg;

	public Rtime(String msg) {
		super(msg);
	}
}
