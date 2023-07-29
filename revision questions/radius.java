import java.util.*;
	class radius{
		public static double circumference(double r){
			double circum=2*r*Math.PI;
			return circum;
		}
		public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double r=sc.nextDouble();
		double circum=circumference(r);
		System.out.print("The circumference of the circle is "+circum);
		}
	}