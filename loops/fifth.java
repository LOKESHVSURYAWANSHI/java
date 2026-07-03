package loops;

public class fifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int sum = 0;
		demo:
		for(int i=2;i<100;i++) {
			if(i==2) {
				System.out.println("2 is a prime number");
				sum=sum+2;
				continue;
			}
			boolean flag=false;
			for(int num=2;num<i;num++) {
				if(i%num==0) {
					flag=true;
					
				}
			}
			if(flag==true) {
				System.out.println("not prime no: "+i);
				
			}else {
				++count;
				sum+=i;
				System.out.println("prime no"+i);
			}
			if(count==25) {
				break demo;
				
			}
			
		}
		System.out.println(count);
		System.out.println(sum);
		boolean flag1=false;
		for(int j=2;j<sum;j++) {
			if(sum%j==0) {
				flag1=true;
			}
		}
		if(flag1==true) {
			System.out.println("not prime no "+sum);
		}else {
			System.out.println("prime no "+sum);
		}
	}
	

}
