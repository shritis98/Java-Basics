import java.util.*;
	class average{
		public static int average(int a,int b,int c){
			return (a+b+c)/3;
		}
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("enter 3 numbers");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int result=average(a,b,c);
			System.out.println("The average is "+result);
		}
	}