import java.util.*;
	class greater{
		public static void greaterNumber(int a,int b){
			if(a>b){
				System.out.print(a+" is greater");
			}else if(a<b){
				System.out.print(b+" is greater");
			}else{
				System.out.print("Both the numbers entered are equal");
			}
			return;
		}
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the numbers to be compared");
			int a=sc.nextInt();
			int b=sc.nextInt();
			greaterNumber(a,b);
		}
	}