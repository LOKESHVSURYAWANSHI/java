package abstact;

public class Interface_2 {

	public static void main(String[] args) {
		boy b=new boy();
		b.demo();
		b.demo_1();

	}

}

//interface hi{
//	 void demo();
//}
//interface by{
//    int demo_1();
//}
//
//class boy implements hi,by{
//
//	@Override
//	public void demo() {
//		System.out.println("hi boy ");
//		
//	}
//
//	@Override
//	public int demo_1() {
//		System.out.println("by boy");
//		return 0;
//		
//	}
//	
interface hi{
	 void demo();
}
interface by extends hi{
   int demo_1();
}

class boy implements by{

	@Override
	public void demo() {
		System.out.println("hi boy");
		
	}

	@Override
	public int demo_1() {
		System.out.println("by boy");
		return 0;
	}

	
	
}
