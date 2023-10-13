import java.util.*;
	class hw22{
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			int size=sc.nextInt();
			int l=0;
			//StringBuilder sb=new StringBuilder();
			for(int i=0;i<=size;i++){
				StringBuilder sb=new StringBuilder(sc.nextLine());
				//System.out.println(sb.length());
				l=l+sb.length();
			}
			System.out.println(l);
		}
	}