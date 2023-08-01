import java.util.*;
	class hw21{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			String mail=sc.next();
			String result="";
			for(int i=0;i<mail.length();i++){
				if(mail.charAt(i)=='@'){
					result=result+mail.substring(0,i);
					break;
				}
			}
			System.out.print(result);
		}
	}