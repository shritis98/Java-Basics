import java.util.*;
	class vote{
		public static void eligibilityToVote(int age){
		if (age>18){
			System.out.print("You are eligible to vote");
		}else{
			System.out.print("You are not eligible to vote");
		}
		}
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your age");
			int age=sc.nextInt();
			eligibilityToVote(age);
		}
	}