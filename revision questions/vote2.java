import java.util.*;
	class vote2{
		public static boolean eligibility(int age){
			if(age>18){
				return true;
			}return false;
		}
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			int age=sc.nextInt();
			System.out.print(eligibility(age));
		}
	}