import java.util.*;
	class functionmul{
		public static int multiply(int a,int b){
			int mul=a*b;//not necessary to define new variable a*b
			return mul;//return a*b
		}
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			int mul=multiply(a,b);//not necessary
			System.out.print(mul);//print multiply(a,b)
		}
	}