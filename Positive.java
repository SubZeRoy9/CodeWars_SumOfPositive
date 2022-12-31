/* You get an array of numbers, return the sum of all of the positives ones.*/

public class Positive {

	public static void main(String[] args) {
		int[] a = {1, 4, -3, 7};
		System.out.println(sum(a));
		

	}
	public static int sum(int[] arr){
		int cur = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				cur = cur + arr[i];
			}
		}
	    return cur;
	  }

}
