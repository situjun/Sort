public class ShellTest0{
	static public int[] ShellSort(int[] arr){
		int gap = 0;
		int j = 0;
		//for(gap=arr.length/2;gap>0;gap=gap==2?1:(int)gap/2.2){    (int)gap/2.2 is Wrong!!! gap/2.2 is a whole block.
		for(gap=arr.length/2;gap>0;gap=gap==2?1:(int)(gap/2.2)){
			for(int i=gap;i<=arr.length-1;i++){
				int tmp = arr[i];
				// not for(j=i;j>=gap&&tmp<arr[j];j--){   tmp<arr[j];j-- is wrong!!!
				for(j=i;j>=gap&&tmp<arr[j-gap];j-=gap){
					arr[j]=arr[j-gap];
				}
				arr[j]=tmp;
			}
			
		}
		return arr;
	}
		public static void main(String[] agrs){
		int[] arr = {9,8,7,6,5,4,3,2,1};
		for(int i:ShellSort(arr)){
			System.out.print(i+",");
		}
	}
}
