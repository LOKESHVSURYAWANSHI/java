package practice;

public class practice1 {

	public static void main(String[] args) {

		char[] a= {'a','b','c','d'};
		System.out.println(a);
		String b=new String(a);
		System.out.println("b is a type of ="+b+"_________"+b.getClass());
		for(int i=0;i<b.length();i++) {
			System.out.print(""+b.charAt(i)+'^');
			
			
//			['a','b','c','d','e']= a^b^c^d^e
		}
		
		

	}

}
