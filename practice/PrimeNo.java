package practice;

public class PrimeNo {
	
	public static void main(String[] args) {
		int count=0;
		int sum = 0;
		for(int i=3;i<25;i++) {
			boolean flag=false;
			for(int num=2;num<i;num++) {
				if(i%num==0) {
					flag=true;
				}
			}
			if(flag==true) {
				
			}else {
				count++;
				sum+=i;
				System.out.println("prime no"+i);
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
			System.out.println("not prime no"+sum);
		}else {
			System.out.println("prime no"+sum);
		}
	}

}
