import java.util.*;
	class hw16table{
	public static void table(int n,int m){
		for(int i=1;i<=m;i++){
			int mul=n*i;
			System.out.println(n+" * "+i+" = "+mul);
		}
		return;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number n whose table is to be printed");
		int n=sc.nextInt();
		System.out.println("Enter till what you want the table to go");
		int m=sc.nextInt();
		table (n,m);
	}
	}