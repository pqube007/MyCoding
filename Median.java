import java.util.Scanner;

public class Median {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int[] a = {1, 1, 2, 2, 7, 6, 4, 3, 5, 2, 90, 67, 3, 2, -5, 73, -221, 554, 141, 56, 1, 6, 4, 9, 22, 2};
        //int[] a = {1, 2, 3, 4, 5, 6};
		float m = 0;
		// length of a
        // System.out.println(a.length);
        // System.out.println(a[a.length / 2]);
		for(int i = 0; i < a.length; i++) {
		    if(a.length % 2 == 0) {
		        m = ((a[a.length / 2 - 1] + a[a.length / 2]) / 2);
		    }
		    else {
		        m = a[a.length / 2];
		    }
		}
		System.out.println(m);
	}
}
