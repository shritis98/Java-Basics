import java.util.*;
	class oddsum{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int n=sc.nextInt();
			int sum=0;
			for(int i=1;i<=n;i++){
				if(i%2!=0){
					sum=sum+i;
				}
			}
			System.out.println("The sum of all odd numbers till "+n+" is = "+sum);
		}
	}