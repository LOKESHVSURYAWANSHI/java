package Exception_handlaing;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=40;
		try {
			if(marks>35){
				throw new Exception();
				
			}
		}catch (Exception e) {
			System.out.println(e);
			
			System.out.println("exception milala motha ahe to");
		}
		finally {
			System.out.println("done");
		}

	}

}
