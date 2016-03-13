public class BubbleTest2{
	public static void sort(int[] arr){
		for(int i=0;i<=arr.length-1;i++){
			for(int j=1;j<=arr.length-1-i;j++){
				if(arr[j]<arr[j-1]) {
					int tmp = arr[j-1];
					arr[j-1]= arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	public static void main(String[] args){
		int[] arr = {99,66,45,234,14,6,523,43276,61,12,54,3,2,1,11};
		sort(arr);
		for(int i:arr){
			System.out.print(","+i);
		}
	}
}