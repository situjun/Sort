class Divide{
	public static void main(String[] args){
		int count = 10;
		recursion(count);
	}
	//variable scope is different from Main function
	public static void recursion(int count){
		if(count > 0){
			//recursion(--count);  result:0,0,1,2,3,4,5,6,7,8,9,
			//recursion(count--);  result:Exception in thread "main" java.lang.StackOverflowError  无限调用，因为传递的一直是10
			recursion(count-1);
		}
		System.out.print(count+",");
	}
}