public class Classwork{
	public static void main(String[] args){
		double a=1;
		double eps = 0.00001;
		double s=0;
		int count = 1;
		double x = 3;
		while(true){
			a=a*x/count++;
			s=s+a;
			if ((a>(eps*(-1)) && (a<eps))){
				break;
			}
		}
		System.out.println(s);
	}
}