// 3.10.26

public class TestArray {
	public static void main(String[] args){
		// Произвольный цвет ESC[38;2;R;G;Bm
		String RED = "\u001B[38;2;255;0;0m";
		System.out.println(RED);

		int[] a = new int[4];
		// равнозначно
		int b[] = new int[4];

		for(int i = 0; i<a.length; ++i){
			System.out.print(a[i]+" ");
		}

		int[] c = new int[] {1,2,3,4,5}; 
		// равнозначно
		int[] d = {1,2,3,4,5};

		// Сброс к исходному состоянию консоли
		String RESET = "\u001B[0m";
		System.out.println(RESET);

		for(int i = 0; i<c.length; ++i){
			System.out.print(c[i]+" ");
		}

		// многомерные массивы

		String QQ = "\u001B[38;2;40;255;0m";
		System.out.println(QQ);

		int[][] ar = new int[][] {
			{1,2,3}, {4,5,6}, {7,8}
		};

		for(int i = 0; i < ar.length; i++) {
			for (int j =0; j < ar[i].length; j++){
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println(RESET);
	}
}