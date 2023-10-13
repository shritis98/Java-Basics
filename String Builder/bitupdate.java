import java.util.*;
public class bitupdate{
	public static void main(String args[]){
		int n = 5;
		int pos = 1;
		int bitmask = 1<<pos;
		Scanner sc=new Scanner(System.in);
		int updateWith=sc.nextInt();
		if(updateWith == 1){
			int newNum = bitmask | n;
			System.out.println(newNum);
		}else if(updateWith == 0){
			int maskNot = ~bitMask;
			int newNum = notMask & n;
			System.out.println(newNum);
		}
		
	}
}