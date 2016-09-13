class MergeSortedArray{
	public static void main(String[] args){
		int[] arr1 = {1,3,5,6,7,51,66,77};
		int[] arr2 = {1,2,4,5,9,11,12,13,45};
		int length1 = arr1.length;
		int length2 = arr2.length;
		int[] tmpArr = new int[length1+length2];
		int start1 = 0,start2 = 0,index = 0;
		while(start1 <= length1-1 && start2 <=length2-1){
			if(arr1[start1] <= arr2[start2]){
				//i++ 返回原来的值，++i 返回加1后的值。
				tmpArr[index++] = arr1[start1++]; 
			} else {
				tmpArr[index++] = arr2[start2++]; 
			}
		}
		while(start1<=length1-1){
			tmpArr[index++] = arr1[start1++];
		}
		while(start2<=length2-1){
			tmpArr[index++] = arr2[start2++];
		}
		for(int i:tmpArr){
			System.out.print(i+",");
		}
	}
}