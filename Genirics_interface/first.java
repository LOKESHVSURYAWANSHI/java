package Genirics_interface;

public class first {

	public static void main(String[] args) {
		

	}

}

interface one{
	void run(String s);
}
class two implements one{

	@Override
	public void run(String s) {
		System.out.println(s.toUpperCase());
		
	}
	
}