public class FindIndex {
	public static void main(String[] args) {
		int[] arr = {1,3,2,5,6,3,7,9,5,3,3,2,4};
		int num = 11;
		System.out.println(finder(arr, num));
	}
	static int finder (int[] arr, int num) {
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return c;
			}
			c+=1;
		}
		return -1;
	}
}