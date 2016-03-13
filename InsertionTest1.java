import java.util.*;
public class InsertionTest1{
	static public int[] InsertionSort(int[] arr){
		int gap =1,j=0;
		for(int i=gap;i<=arr.length-1;i++){
			int tmp=arr[i];
			for(j=i;j>=gap&&tmp<arr[j];j--){
				arr[j]=arr[j-gap];
			}
			arr[j]=tmp;
		}
		return arr;
	}
	public static void main(String[] agrs){
		int[] arr = {9,8,7,6,5,4,3,2,1};
		System.out.println(Arrays.toString(InsertionSort(arr)));
	}
}