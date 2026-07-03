package abstact;

public class First {

	public static void main(String[] args) {
		Car c= new Tesla();
		c.start();
		c.stop();

	}

}
abstract class Car {
	abstract public void start();
	public void stop() {
		System.out.println("Apply the breaks .... ");
	}
}

class Tesla extends Car{

	@Override
	public void start() {
		System.out.println("Voice command ...... ");
		
	}
	
	public void stop() {
		System.out.println("voice command break .... ");
	}
	
}
