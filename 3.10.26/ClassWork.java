public class ClassWork {
	public static void main(String[] args){
		// 1 

		// int[] arr = {1,2,3,4,5};
		// int max = arr[0];
		// int min = arr[0];
		// int sum = 0;
		// for(int i=0; i<arr.length; ++i) {
		// 	if (arr[i] > max) {
		// 		max = arr[i];
		// 	}
		// 	if (arr[i]<min) {
		// 		max = arr[i];
		// 	}
		// 	sum += arr[i];
		// }

		// String RED = "\u001B[38;2;255;0;0m";
		// System.out.print(RED + "Максимальный элемент: " + max);
		// String RESET = "\u001B[0m";
		// System.out.println(RESET);

		// String BLUE = "\u001B[38;2;0;0;255m";
		// System.out.print(BLUE + "Минимальный элемент: " + min);
		// RESET = "\u001B[0m";
		// System.out.println(RESET);

		// String GREEN = "\u001B[38;2;0;255;0m";
		// System.out.print(GREEN + "Среднее арифметическое: " + max/arr.length);
		// RESET = "\u001B[0m";
		// System.out.println(RESET);


		// 2

		// int[] v1 = {3,5,4};
		// int[] v2 = {1,5,7};

		// int[] sum = new int[v1.length];
		// int sc = 0;

		// for (int i = 0; i < v1.length; i++) {
		// 	sum[i] = v1[i] + v2[i];
		// 	sc += v1[i]*v2[i];
		// }

		// System.out.print("Скалярное произведение векторов: " + sc + "\nСумма векторов: ");

		// for (int i = 0; i < sum.length; i++){
		// 	System.out.print(sum[i] + " ");
		// }


		//3

		// int[] a = {1,2,3,4,5};
		// int[] b = {3,6,7,5,8};
		// int[] c = new int[b.length + a.length];

		// for(int i = 0; i < a.length; i++) {
		// 	c[i]=a[i];
		// }

		// for(int i = 0; i < b.length; i++) {
		// 	c[i+a.length] = b[i];
		// }

		// for(int i = 0; i < c.length; i++) {
		// 	System.out.print(c[i] + " ");
		// }


		// 4

		int[][] a = new int[][]{
			{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}
		};
		int [][] b = new int[a[0].length][a.length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				b[j][i] = a[i][j];
			}
		}

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

































	}
}