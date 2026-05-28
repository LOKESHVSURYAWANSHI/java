package Access_modifire;

public class Protected__ {

	public static void main(String[] args) {
		crop c=new crop();
		c.name();
		System.out.println(c.name);
		

	}

}
class pant{
	protected void name() {
		System.out.println("jence");
	}
	protected String name="POP";
}
class crop extends pant{
	
}