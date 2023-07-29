import java.util.*;
class power{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number x");
		int x=sc.nextInt();
		System.out.println("Enter the power n");
		int n=sc.nextInt();
		int mul=1;
		for(int i=1;i<=n;i++){
			mul=mul*x;
		}
		System.out.println("The answer of "+x+" raised to the power of "+n+" = " +mul);
	}
}