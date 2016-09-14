class Merge{
	public static void main(String[] args){
		int[] arr1 = {1,3,5,6,7,51,66,77};
		int[] arr2 = {1,2,4,5,9,11,12,13,45};
		int index1=0,index2=0,index3=0;
		int length1 = arr1.length;
		int length2 = arr2.length;
		int[] tmp = new int[length1+length2];
		while(index1<=length1-1 && index2<=length2-1){
			if(arr1[index1]>arr2[index2]){
				tmp[index3++] = arr2[index2++];
			} else {
				tmp[index3++] = arr1[index1++];
			}
		}
		while(index1<=length1-1){
			tmp[index3++] = arr1[index1++];
		}
		while(index2<=length2-1){
			tmp[index3++] = arr2[index2++];
		}
		for(int i:tmp){
			System.out.print(i+",");
		}
	}
}