public class InsertionSort{
	public static void main(String[] args){
		int[] arr = {12,7,3,4,8,2,1,6};
		for(int i=1;i<arr.length;i++){
			int temp,j;
			temp=arr[i];
			j=i;
			while(j>0 && arr[j-1]>temp){
				arr[j]=arr[j-1];
				j=j-1;
			}
			arr[j]=temp;
	   	}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i] + " ");
		}
		
	}
}