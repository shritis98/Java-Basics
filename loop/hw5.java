import java.util.*;
	class hw5{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			int i;
			do{
				int marks=sc.nextInt();
				if(100 >= marks && marks >= 90){
					System.out.println("This is good");
				}else if(89 >= marks && marks >= 60){
					System.out.println("also good");
				}else if(59 >=marks && marks > 0){
					System.out.println("good as well");
				}else{
					System.out.println("check marks");
				}
				System.out.println("wanna continue?");
				i=sc.nextInt();
				}
			while(i==1);
		}
	}