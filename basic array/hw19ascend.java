import java.util.*;
	class hw19ascend{
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			int size=sc.nextInt();
			int number[]=new int[size];
			
			for(int i=0;i<size;i++){
				number[i]=sc.nextInt();
			}
			
			boolean isascending=true;
			
			for(int i=0;i<size-1;i++){
				if(number[i]>number[i+1]){
					isascending=false;
				}
			}
			
			if(isascending){
				System.out.println("sorted in ascending order");
			}else{
				System.out.println("not sorted in ascending order");
			}
		}
	}