import java.util.*;
	class count{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			int pos=0;
			int neg=0;
			int zer=0;
			int y=sc.nextInt();
			while(y==1){
				System.out.println("Enter the number");
				int n=sc.nextInt();
				if(n>0){
					pos++;
					}else if(n<0){
					neg++;
					}else{
					zer++;
					}
				System.out.println("press 1 to continue or press 0 to see results");
				y=sc.nextInt();
				}
			System.out.println("The results are");
			System.out.println("total positive= " + pos);
			System.out.println("total negative= " + neg);
			System.out.println("total zero= " + zer);
		}
	}