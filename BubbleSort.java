import java.util.Scanner;
public class BubbleSort{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF THE NUMBER:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int temp;
		System.out.println("ENTER THE NUMBERS:");
		for(int i=0;i<size;i++){
			
			arr[i]=sc.nextInt();
		}
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr.length-1-i;j++){
					if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;	
					}
				}
			
			}
		System.out.println("THE SORTED ARRAY ARE:");
		for(int i=0;i<arr.length;i++){
			
			System.out.print(arr[i] + " ");
		}
	}
}