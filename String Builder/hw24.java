import java.util.*;
	class hw24{
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			StringBuilder sb=new StringBuilder(sc.nextLine());
			for(int i=0;i<sb.length();i++){
				if(sb.charAt(i)=='@'){
					sb.delete(i,sb.length());
					break;
				}
			}
			System.out.println(sb);
		}
	}