import java.util.*;
	class factorial{
		public static void printFactorial(int n){
			if(n<0){
				System.out.print("invalid");
				return;
			}
			int fac=1;
			for(int i=n;i>=1;i--){
				fac=fac*i;
			}
			System.out.println(fac);
			return;
		}
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			printFactorial(n);
		}
	}