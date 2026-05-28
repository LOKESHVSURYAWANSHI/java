package Access_modifire;


public class DEfault {

	public static void main(String[] args) {
		building b=new building();
		b.constructing();
		

	}

}

class building{
    String name="Lokesh";
	
	void constructing() {
		System.out.println("building is constructing ");
	}
}
class flat extends building{
	
}