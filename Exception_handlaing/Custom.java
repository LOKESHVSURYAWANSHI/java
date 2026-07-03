package Exception_handlaing;

public class Custom {

	public static void main(String[] args) {
		
		int salary= 8400;
		
		try {
			if(salary<=50000) {
				throw new SalaryExceptions("salary is less then 50000");
			}
		}
		catch (SalaryExceptions e) {
			e.printStackTrace();
			
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("done!");
		}
	}

}
class SalaryExceptions extends Exception{
	public SalaryExceptions(String s) {
		super(s);
	}
}