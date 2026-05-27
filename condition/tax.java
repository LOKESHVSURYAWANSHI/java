package condition;

public class tax {

	public static void main(String[] args) {
double salary= 4000000;
		
		if(salary >= 0.0 && salary <=500000) {
			
			double tax =salary/0;
			salary =salary-tax;
			System.out.println("tax of this year- "+tax);
			System.out.println("salary of this year- "+salary);			
		}
		else if(salary >= 500001 && salary<=1000000) {
			
			double tax =salary/10;
			salary =salary-tax;
			System.out.println("tax of this year- "+tax);
			System.out.println("salary of this year- "+salary);
		}
        else if(salary >= 1000001 && salary<=2000000 ) {
			
			
			double tax =salary/20;
			salary =salary-tax;
			System.out.println("tax of this year- "+tax);
			System.out.println("salary of this year- "+salary);
		}
        else if(salary >= 2000001 && salary<=3000000 ) {
			
			
			double tax =salary/30;
			salary =salary-tax;
			System.out.println("tax of this year- "+tax);
			System.out.println("salary of this year- "+salary);
		}
        else if(salary >= 3000001 ) {
			
			
			double tax =salary/50;
			salary =salary-tax;
			System.out.println("tax of this year- "+tax);
			System.out.println("salary of this year- "+salary);
		}
        else {
        	System.out.println("garib");
        }

	}

}
