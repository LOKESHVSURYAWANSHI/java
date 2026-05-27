package inheritance;

public class Super {

	public static void main(String[] args) {
		C c=new C();
		
	}

}
class A{
	public A(){
		System.out.println("Parent");
	}
	public void parent() {
		System.out.println("Parent method");
	}
}
class B extends A{
	public B() {
		super();
		System.out.println("Child");
	}
	public void child() {
		super.parent();
		System.out.println("Child Method");
	}
}
class C extends B{
	public C(){
		super();
		System.out.println("Porga");
	}
}