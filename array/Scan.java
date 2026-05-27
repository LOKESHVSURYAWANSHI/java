package array;

import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the element:  ");
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println("Even"+arr[i]);
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.println("odd"+arr[i]);
			}
		}
		
	}

}
