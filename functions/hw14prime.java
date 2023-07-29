import java.util.*;
	class hw14prime{
		public static void primeNumber(int num){
			int add=0;
			for(int i=1;i<=num;i++){
				if(num%i==0){
					add++;
				}
			}
			if(add==2){
					System.out.println("number is prime");
			}else if(num<=1){
				System.out.println("number neither composite nor prime");
			}else{
				System.out.println("number is composite");
			}
		}
		public static void main(String[] args){
			System.out.println("Enter the number to be checked");
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			primeNumber(num);
		}
	}