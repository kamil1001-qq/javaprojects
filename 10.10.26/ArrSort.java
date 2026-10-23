public class ArrSort {
	public static void main(String[] args) {
		int[] arr = {-5,4,8,1,5,3,-7,-10,-5};
		int[] arr1 = sort(arr);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}

	static int max_index(int[] a, int n) {
		int max_elem = a[0];
		int max_ind = 0;
		for (int i = 1; i < n; i++) { // макс элемент из элементов с первого до n-го
			if (a[i] > max_elem) {
				max_ind = i;
				max_elem = a[i];
			}
		}
		return max_ind;
	}

	static int[] sort(int[] arr) {
		int n = arr.length;
		while (n > 1) {
			int last_index = n-1;
			int max = arr[max_index(arr, n)];
			arr[max_index(arr, n)] = arr[last_index];
			arr[last_index] = max;
			n-=1;
		}
		return arr;
	}
}

// найти макс. элемент массива и отсортировать массив