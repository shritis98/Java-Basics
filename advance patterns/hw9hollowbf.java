class hw9hollowbf{
	public static void main(String[] args){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){//for 1/4
				if(j==1||j==i){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			for(int j=2*(n-i);j>=1;j--){//for space
				System.out.print(" ");
			}
			for(int j=2*n;j>=1;j--){//for2/4
				if(j==2*n||j==(2*n)-i+1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=n;i>=1;i--){
			for(int j=1;j<=i;j++){//for 3/4
				if(j==1||j==i){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			for(int j=2*(n-i);j>=1;j--){//for space
				System.out.print(" ");
			}
			for(int j=2*n;j>=1;j--){//for4/4
				if(j==2*n||j==(2*n)-i+1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}