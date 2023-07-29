import java.util.*;
	class fibonacci{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int a=0;
			int b=1;
			System.out.print(a+" ");
			for(int i=2;i<=n;i++){
				if(n>=2){
					System.out.print(b+" ");
					int temp=b;
					b=a+b;
					a=temp;
				}
			}	
		}
	}