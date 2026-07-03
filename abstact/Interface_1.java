package abstact;

public class Interface_1 {

	public static void main(String[] args) {
		
		suzuki s=  new suzuki();
		s.start();
		s.stop();
	}

}

interface car{
	void start();
	void stop();
	
}
class suzuki implements car{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("ratatatatatata");
		
	}
	
	
	

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stoppppppp");
	}
	
}