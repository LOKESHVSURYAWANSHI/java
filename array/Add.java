package array;

import java.util.Arrays;

public class Add {

	public static void main(String[] args) {
		
		int a[]=new int[10];
		for(int i=0;i<10;i++) {
			a[i] =i+1;
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println(Arrays.toString(a));
	}

}
