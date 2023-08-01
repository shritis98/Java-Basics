class trycompare{
	public static void main(String args[]){
		String a="tony";
		String b="tony2";
		if(a.compareTo(b)==0){
			System.out.println("both are equal");
		}else if(a.compareTo(b)>0){
			System.out.println("a is greater");
		}else{
			System.out.println("b is greater");
		}
	}
}