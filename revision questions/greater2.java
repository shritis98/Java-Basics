import java.util.*;
	class greater2{
		public static int greaterNumber(int a,int b){
			if(a>b){
				int ans=a;
				return ans;
			}else{
				int ans=b;
				return ans;
			}
		}
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the numbers to be compared");
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a==b){
				System.out.print("Both the numbers entered are equal");
			}else{
			int ans=greaterNumber(a,b);
			System.out.println(ans+" is greater");
			}
		}
	}