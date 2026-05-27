package condition;


public class salary {

	public static void main(String[] args) {
		double salary= 4000000;
		
		if(salary >= 0.0 && salary <=500000) {
			System.out.println("Lower class");
			double tax =salary/10;
			salary =salary-tax;
			System.out.println("tax of this year- "+tax);
			System.out.println("salary of this year- "+salary);			
		}
		else if(salary >= 500001 && salary<=1000000) {
			
			System.out.println("medium class");
			double tax =salary/20;
			salary =salary-tax;
			System.out.println("tax of this year- "+tax);
			System.out.println("salary of this year- "+salary);
		}
        else if(salary >= 1000001 ) {
			
			System.out.println("best");
			double tax =salary/30;
			salary =salary-tax;
			System.out.println("tax of this year- "+tax);
			System.out.println("salary of this year- "+salary);
		}
        else {
        	System.out.println("garib");
        }
	}

}
