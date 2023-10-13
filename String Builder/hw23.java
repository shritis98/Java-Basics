import java.util.*;
	class hw23{
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			StringBuilder sb=new StringBuilder(sc.nextLine());
			for(int i=0;i<sb.length();i++){
				char check=sb.charAt(i);
				if(check=='e'){
					sb.setCharAt(i,'i');
				}
			}
			System.out.println(sb);
		}
	}