class MergeSort{
	public static void main(String[] args){
		int[] arr = {1,3,5,6,7,51,66,77,1,2,4,5,9,11,12,13,45};
		int length = arr.length;
		int[] tmp = new int[length];
		recursion(arr,tmp,0,length-1);
		for(int i:arr){
			System.out.print(i+",");
		}
	}
	//内部调用，貌似必须声明为static function,otherwise it will display " non-static method recursion(int[],int[],int,int) cannot be referenced from a static context"
	public static void merge(int[] arr,int[]tmp,int left,int center,int right){
		int index1 = left,index2 = center+1,index3 = left;
		while(index1 <= center && index2<=right){
			if(arr[index1]<arr[index2]){
				arr[index3++] = arr[index1++];
			} else {
				arr[index3++] = arr[index2++];
			}
		}
		while(index1<=center){
			arr[index3++] = arr[index1++];
		}
		while(index2<=right){
			arr[index3++] = arr[index2++];
		}
	}
	public static void recursion(int[] arr,int[] tmp,int left,int right){
		if(arr[left]<arr[right]){
			int center = (left+right)/2;
			recursion(arr,tmp,left,center);
			recursion(arr,tmp,center+1,right);
			merge(arr,tmp,left,center,right);
		}
	}
}