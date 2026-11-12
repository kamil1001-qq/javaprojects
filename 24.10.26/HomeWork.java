public class HomeWork {
	public static void main(String[] args) {
		// 1
		// int[] arr1 = {1,3,5,7,32,6,7};
		// System.out.print("Сумма массива: " + sumArr(arr1));

		// 2
		// float[] arr = {1,6,7,3,3,10,4};
		// newArr(arr);

		// 3
		// int[] arr = {1,6,7,2,6,5,3,2,4,2};
		// delCopies(arr);

		// 4
		// int[] arr1 = {1,4,7,5,2,3};
		// int[] arr2 = {2,3,5,4,7,7,3,2,5,7,9,22,6};
		// int[] newArr = joinArrays(arr1,arr2);
		// for (int i = 0; i < newArr.length; i++) {
		// 	System.out.print(newArr[i] + " ");
		// }

		//6
		// System.out.print(ln(0.5));

		// 7

		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i]=t(i);
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	} 

	// 1
	public static int sumArr(int[] arr) {
		int s = 0;
		for (int i = 0; i < arr.length; i++) {
			s += arr[i];
		}
		return s;
	}

	// 2
	public static void newArr(float[] arr) {
		float[] arr1 = new float[arr.length];
		float max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) max = arr[i];
		}

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr[i] / max;
			System.out.print(arr1[i] + " ");
		}
	}
	
	// 3
	public static void delCopies(int[] arr) {
		int countCopies = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length - countCopies; j++) {
				if (arr[j] == arr[i]) {
					for (int k = j; k < arr.length - 1; k++) {
						arr[k] = arr[k + 1];
					}
					arr[arr.length - 1] = 0;
					countCopies++;
				}
			}
		}

		int[] arr1 = new int[arr.length - countCopies];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr[i];
			System.out.print(arr1[i] + " ");
		}
	}


	// 4
	public static int[] joinArrays(int[] arr1, int[] arr2) {
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i]==arr2[j]) count++;
			}
		}

		int[] newArr = new int[arr1.length + arr2.length - count];
		for (int i = 0; i < arr1.length; i++) {
			newArr[i] = arr1[i];
		}

		int count1 = 0;
		for (int i = 0; i < arr2.length; i++) {
			boolean flag = true;
			for (int j = 0; j < arr1.length; j++) {
				if (newArr[j] == arr2[i]) flag = false;
			}
			if (flag) {
				newArr[arr1.length+count1++] = arr2[i];
			}
		}
		return newArr;
	}

	//6
	public static double ln(double x) {
		double epsilon = 1e-8;
		double n = x;
		double s = x;
		int count = 2;

		while (n <- epsilon || n > epsilon) {
			n = -n * x * (count - 1) / count++;
			s += n;		}

		return s;

	}

	// 7 
	public static int t(int n) {
		if (n == 0) return 1;
		return n*t(n-1);
	}

}