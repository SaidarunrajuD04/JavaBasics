import java.util.Scanner;
public class SelectionSort{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER THE SIZE OF THE ARRAY");//12,23,6,8,11
	int size = sc.nextInt();
	int[] arr = new int[size];
	System.out.println("THE ARRAY ARE:");
	int min,temp=0;
	for(int i=0;i<size;i++){
		arr[i]=sc.nextInt();
	}
		for(int i=0;i<arr.length-1;i++){
		min=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[min]){
					min=j;
				}
			}
		temp=arr[i];
		arr[i]=arr[min];
		arr[min]=temp;
		
		}
		System.out.println("THE SORTED ARRAY ARE:");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] +" ");
		}
	
	}
}		