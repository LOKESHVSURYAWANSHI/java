package abstact;

public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}

interface n {
	default void hi() {
		System.out.println("hi");
	}
	
}
interface b{
	void hi();
	void by();
	
}

class c implements n, b{

	@Override
	public void by() {
		System.out.println("by");
		
	}

	@Override
	public void hi() {
		System.out.println("pooooo");
		
	}
	
}
