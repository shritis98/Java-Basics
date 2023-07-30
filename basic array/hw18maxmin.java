import java.util.*;
	class hw18maxmin{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			int size=sc.nextInt();
			int[] number=new int[size];
			int smlst=Integer.MAX_VALUE;
			int lrgst=Integer.MIN_VALUE;
			for(int i=0;i<size;i++){
				number[i]=sc.nextInt();
			}
			for(int i=0;i<size;i++){
				if(number[i]<smlst){
					smlst=number[i];
				}
				if(number[i]>lrgst){
					lrgst=number[i];
				}
			}
			System.out.println("smallest is "+smlst);
			System.out.println("largest is "+lrgst);
		}
	}