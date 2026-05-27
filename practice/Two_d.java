package practice;

import java.util.Scanner;

public class Two_d {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows and columns:");
		int a = sc.nextInt();
		int b = sc.nextInt();

		int arr[][] = new int[a][b];
		int sum=0;

		
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				System.out.print("Enter element at [" + i + "][" + j + "]: ");
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("2D Array:");
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				System.out.print(arr[i][j] + " ");
				 
				if(i%2==0 || j%2==0) {
					System.out.print("*");
					sum=sum+arr[i][j];
					
				}
			}
			System.out.println();
		}
		System.out.println(sum);

	

	}

}
