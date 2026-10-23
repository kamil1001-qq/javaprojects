public class Exponenta{
	public static void main(String[] args){
		double a=1;
		double eps = 0.000001;
		double s=1;
		int n = 1;
		double x = 3;
		while(true){
			a=a*x/n++;
			s=s+a;
			if ((a>(eps*(-1)) && (a<eps))){
				break;
			}
		}
		System.out.println(s);
	}
}