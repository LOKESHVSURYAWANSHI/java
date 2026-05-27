package array;

public class MinMax {

	public static void main(String[] args) {
		int  arr[]= {-1,-2,-3,-4,-5,-6,-7,4};
		int max=-10;
		int min=5;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);

	}

}
