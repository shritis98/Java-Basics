import java.util.*;
	class hw1{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			int operation=sc.nextInt();
			switch(operation){
				case 1: System.out.print(a+b);
				break;
				case 2: System.out.print(a-b);
				break;
				case 3: System.out.print(a*b);
				break;
				case 4: if(b==0){
							System.out.print("invalid div");
							}else{
							System.out.print(a/b);
							}
				break;
				case 5:  if(b==0){
							System.out.print("invalid mod");
							}else{
							System.out.print(a%b);
							}
				break;
				default: System.out.print("invalid option");
			}
		}
	}