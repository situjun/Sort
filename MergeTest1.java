public class MergeTest1{
	public static void MergeSort(int[] arr){
		int[] tmp = new int[arr.length];
		MergeSort(arr,tmp,0,arr.length-1);
	}
	public static void MergeSort(int[] arr,int[] tmp,int left,int right){
		if(left<right){
			int center = (left+right)/2;
			MergeSort(arr,tmp,left,center);
			MergeSort(arr,tmp,center+1,right);
			merge(arr,tmp,left,center+1,right);
		}
	}
	public static void merge(int[] arr,int[] tmp,int left,int right,int rightEnd ){
		int leftEnd = right-1;
		int length = rightEnd-left+1;
		//tmpIndex is new Index in array tmp,it's subsequent.left is from the left start of index in array arr,and right is right start of the array arr.So left & right is not adjucent.So tmp[left++] = arr[left++]; is WRONG!!!!!
		int tmpIndex=left;
		while(left<=leftEnd&&right<=rightEnd){
			if(arr[left]<arr[right])
				tmp[tmpIndex++] = arr[left++];
			else 
				tmp[tmpIndex++] = arr[right++];
		}
		while(left<=leftEnd){
			tmp[tmpIndex++]=arr[left++];
		}
		while(right<=rightEnd){
			tmp[tmpIndex++]=arr[right++];
		}
		for(int i=0;i<=length-1;i++,rightEnd--){
			arr[rightEnd] = tmp[rightEnd];
		}
	}
	public static void main(String[] args){
		int[] arr = {99,66,45,234,14,6,523,43276,61,12,54,3,2,1,11};
		MergeSort(arr);
		for(int i:arr){
			System.out.print(","+i);
		}
	}
}