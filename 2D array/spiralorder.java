import java.util.*;
	class spiralorder{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();//row
			int m=sc.nextInt();//column
			int[][] matrix=new int[n][m];
			for(int i=0;i<n;i++){
				for (int j=0;j<m;j++){
					matrix[i][j]=sc.nextInt();
				}
			}
			int rowstrt=0;
			int rowend=n-1;
			int colstrt=0;
			int colend=m-1;
			System.out.println("the spiral order matrix is");
			while(rowstrt<=rowend && colstrt<=colend){
				//1
				for(int col=colstrt;col<=colend;col++){
					System.out.print(matrix[rowstrt][col]+ " ");
				}
				rowstrt++;
				//2
				for(int row=rowstrt;row<=rowend;row++){
					System.out.print(matrix[row][colend]+ " ");
				}
				colend--;
				//3
				for(int col=colend;col>=colstrt;col--){
					System.out.print(matrix[rowend][col]+ " ");
				}
				rowend--;
				//4
				for(int row=rowend;row>=rowstrt;row--){
					System.out.print(matrix[row][colstrt]+ " ");
				}
				colstrt++;
				
				System.out.println();
			}
		}
	}