package inner_classes;

public class First_Inner {

	public static void main(String[] args) {
		
		
//		Demo d=new Demo() {
//
//			
//			public void run() {
//				System.out.println("hii inner class");
//				
//			}
//			
//		};
		Demo_a d=new Demo_a() {

			
			public void run() {
				System.out.println("abstract class");
				
			}
			
		};

	}

}
//interface Demo {
//	public void run();
//	
//}
abstract class Demo_a {
	public abstract void run();
}






/**
 * in inner class we create the unnamed class (anonymous class) wile creating the object
 * in this we cannot create any class  
 * but its not a good practice if there is multiple methods 
 * if there is a one or two methods are there we can create this class 
 * 
**/
