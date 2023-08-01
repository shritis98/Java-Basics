import java.util.*;
	class hw20{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			String word=sc.next();
			String result="";
			for(int i=0;i<word.length();i++){
				if(word.charAt(i)=='e'){
					result=result+'i';
				}else{
					result=result+word.charAt(i);
				}
			}
			System.out.print(result);
		}
	}