//package array;
//
//import java.util.Scanner;
//
//public class Two_d {
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the size of 2D array");
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		int arr[][]=new int [a][b];
//		
//		for(int i=0;i<a;i++) {
//			for(int j=0;j<b;j++) {
//				System.out.println("Enter the "+i+"row elemts: "+j);
//				Scanner sc1=new Scanner(System.in);
//				sc1.nextInt();
//				System.out.println(arr[i][j]);
//			}
//		}
//		
//		
//
//	}
//
//}

package array;

import java.util.Scanner;

public class Two_d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows and columns:");
		int a = sc.nextInt();
		int b = sc.nextInt();

		int arr[][] = new int[a][b];

		// Input
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				System.out.print("Enter element at [" + i + "][" + j + "]: ");
				arr[i][j] = sc.nextInt();
			}
		}

		// Output
		System.out.println("2D Array:");
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}