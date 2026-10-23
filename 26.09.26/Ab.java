public class Ab{
	public static void main(String[] args){
		// int n = 97;
		// char c1 = 'a';
		// char c2 = 'b';
		// System.out.println("c1!=c2: " + (c1 != c2));
		// System.out.println("c1 > c2: " + (c1 > c2));
		// System.out.println("c1 < c2: "+(c1 < c2));
		// System.out.println("c1 == c2 - 1: "+(c1 == c2 - 1));
		// System.out.println("c2 > n: "+(c2 > n));
		// System.out.println("c1 == 'a': "+(1 == 'a'));
		// System.out.println("c1 == n: "+(c1 == n));     
		// System.out.println("c2 - c1 == 1: "+(c2 - c1 == 1));

		// int m = 64;
		// int r;
		// System.out.println("r = m << 1: "+(r = m << 1));
		// System.out.println("r = m << 2: "+(r = m << 2));
		// System.out.println("r = m << 3: "+(r = m << 3));
		// System.out.println("r = m >> 1: "+(r = m >> 1));

		// int x = 1;
		// int y = 3;
		// int z;
		// char c1 = 'a';
		// char c2 = 'b';
		// boolean b = false;
		// b = (z = c2 - c1++) == 1 ^ true;
		// System.out.println(b)
		// b = (x++ - --y) * (x-- + --y) == 0 || !(z == 2);
		// System.out.println(b)
		// z = ++x % y - z * 2 & 0b00001011;
		// System.out.println(z)

        // char c1 = 'И', c2 = 'Т', c3 = 'И', c4 = 'С'; // слово
        // long k = 0x2DA295B3; // секретный ключ
        // long m = 0; // число-сообщение, составленное из исходного слова
        // // алгоритм упаковки слова в число:
        // m = m | ((long)c1 << 48);
        // m = m | ((long)c2 << 32);
        // m = m | ((long)c3 << 16);
        // m = m | ((long)c4);
        // long s = m^k;
        // // шифруем ...
        // System.out.println("Зашифрованное сообщение " + s);
        // // дешифруем ...
        // m=s^k;
        // c1=(char)((m & 0xFFFF000000000000l) >> 48);
        // c2=(char)((m & 0x0000FFFF00000000L) >> 32);
        // c3=(char)((m & 0x00000000FFFF0000l) >> 16);
        // c4=(char)((m & 0x000000000000FFFFl));
        // System.out.println("Расшифрованное сообщение " + c1 + c2 + c3 + c4);

        // int n = 54;
        // for (int i = 2; i <= n; i++) {
        //     boolean flag = true;
        //     for (int j = 2; j < i; j++) {
        //         if (i % j == 0) {
        //             flag = false;
        //             break;
        //         }
        //     }
        //     if (flag) { System.out.println(i); }
        // }

        // double x = 2.0;
        // double a = 0.0;
        // double step = 0.1;
        // while(a*a<x){a=a+step;}
        // a=a-step;
        // System.out.println(a);

        int radius=10;
        for (int x = -radius; x<=radius; x++){
        	for (int y = -radius; y<=radius; y++){
        		double l = (x*1.7*x*1.7+y*y);
        		if (l<=(radius*radius)){
        			System.out.print("*");

        		} else {
        			System.out.print(" ");
        		}
        	}
        	System.out.println();
        }
    }
}

