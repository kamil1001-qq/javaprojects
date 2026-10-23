import java.util.Scanner;

public class ByteVars{
	public static void main(String[] args){
			byte a=0x33;
			byte inv =1;
			Scanner scanner = new Scanner(System.in);
			for(byte i =0; i<7; ++i){	
				System.out.println("Введите переменную "+(i+1)+" [0/1]:");
				byte v = (byte)scanner.nextInt();
				a=(byte)(~(inv<<i)&a| (v<<i)); // ~ побитовая инверсия
			}
			System.out.println(a);

			
			byte mask = 1<<(4-1);
			byte a4 =(byte)((a&mask) >>(4-1));

			mask=1<<(2-1);
			byte a2=(byte)((a&mask)>>(2-1));
			System.out.println(a4+a2);

			mask=1<<(5-1);
			byte a5=(byte)((a&mask)>>(5-1));
			if (a5==1) a5=0;
			else a5=1;
			a=(byte)(~(inv<<(5-1))&a| (a5<<(5-1)));
			System.out.println(a);

			for (byte i =1; i<8; ++i){
				mask = (byte)(1<<(i-1));
				System.out.println("a"+i+" :" + (byte)((a&mask) >>(i-1)));
			}
	}
}