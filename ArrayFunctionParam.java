package day8_array;

public class ArrayFunctionParam {

	public static void main(String[] args) {
		int[] points = {10,20,30,40,50};
		int avg =average(points);
		
		System.out.println(avg);
		for( int i =0; i<points.length; i++) {
			System.out.println(points[i]);
		}

	}
	public static int average(int arr[]) {
		
		int sum =0;
		for( int i =0; i<arr.length; i++) {
			sum=sum+arr[i];
		}
		arr[0] =100;
		return sum/arr.length;
	}
}
