import java.util.Scanner;

public class MinAndMax {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int[] a = {1, 1, 2, 2, 7, 6, 4, 3, 5, 2, 90, 67, 3, 2, -5, 73, -221, 554, 141, 56, 1, 6, 4, 9, 22, 2};
		int max = a[0], min = a[0];
		for(int i = 0; i < a.length; i++) {
		    if(a[i] > max) {
		        max = a[i];
		    }
		    if(a[i] < min) {
		        min = a[i];
		    }
		}
		System.out.println("Mininmum number in the array is " + min +" and maximum number is " + max);
	}
}
