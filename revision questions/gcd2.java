import java.util.*;
class gcd2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int gcd=0;
		while(b != 0)
		{
		int temp=b;
		b=a%b;
		a=temp;
		}
		gcd=a;
		System.out.print(gcd);
	}
}