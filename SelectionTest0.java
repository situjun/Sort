public class SelectionTest0{
	public static int[] sort(int[] arr){
		for(int i=0;i<=arr.length-1;i++){
			int j=i;
			for(int k=i;k<=arr.length-1;k++){
				if(arr[k]<arr[j]) j =k;
			}
			int tmp=arr[i];
			arr[i]=arr[j];
			arr[j]=tmp;
		}
		return arr;
	}
	public static void main(String[] args){
		int[] arr = {9,8,7,6,5,4,3,2,1};
		for(int i:sort(arr)){
			System.out.print(i+",");
		}
	}
}