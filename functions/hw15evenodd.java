import java.util.*;
	class hw15evenodd{
		public static void checkEvenOdd(int num){
			if(num%2==0){
				System.out.println(num+" is even");
			}else{
				System.out.print(num+" is odd");
			}
			return;
		}
		public static void main(String[] args){
			System.out.println("enter any number");
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			checkEvenOdd (num);
		}
	}