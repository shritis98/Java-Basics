import java.util.*;
	class button{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			int button=sc.nextInt();
			switch(button){
				case 1: System.out.print("hello");
				break;
				case 2: System.out.print("namste");
				break;
				case 3: System.out.print("hii");
				break;
				default: System.out.print("invalid");
			}
		}
	}