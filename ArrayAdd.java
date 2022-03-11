import java.util.Scanner;

class ArrayAdd{
	static void MainLogic(int[] a, int k){
		for(int i = 0; i < a.length - 1; i++){
			for(int j = i + 1; j < a.length; j++){
				if(a[i] + a[j] == k) {
					System.out.println(a[i] + " " + a[j]);
				}
			}
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] a = {1, 3, 6, 2, 4, 8};
		int k = sc.nextInt();
		MainLogic(a, k);
	} 
}
