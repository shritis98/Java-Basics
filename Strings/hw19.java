import java.util.*;
	class hw19{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			int size=sc.nextInt();
			String[] word=new String[size];
			int length=0;
			for(int i=0;i<size;i++){
				word[i]=sc.next();
				length=length+word[i].length();
			}
			System.out.print(length);
		}
	}