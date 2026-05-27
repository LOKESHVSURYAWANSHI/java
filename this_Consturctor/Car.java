package this_Consturctor;

public class Car {

	public static void main(String[] args) {
		Vehical veh=new Vehical();
	}

}
//DBCA
class Vehical{
	public Vehical() {
		this(10,10);
	
		System.out.println("A");
	}
	public Vehical(int i) {
		this(10,10,10);
	
		System.out.println("B");
	}
	public Vehical(int i,int j) {
		this(10);
		System.out.println("C");
	}
	public Vehical(int i, int j, int k) {

		System.out.println("D");
	}
}
