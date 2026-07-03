package Exception_handlaing;

public class First_1 {
	

	public static void main(String[] args) {
		 try 
		 {
			 System.out.println("hiii");
			 System.out.println(10/0);
		 }catch (ArithmeticException e) {
			System.out.println(e);
			e.printStackTrace();
		}finally {
			System.out.println("the end");
		}	
	}

}



