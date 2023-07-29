import java.util.*;
	class recurfactorial{
		public static int factorial(int n){
			if(n==0){
				return 1;
			}else{
				return n*factorial(n-1);
			}
		}
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			if(n<0){
				System.out.println("invalid");
			}else{
			int result=factorial(n);
			System.out.println(result);
			}
		}
	}	