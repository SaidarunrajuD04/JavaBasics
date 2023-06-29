import java.util.Scanner;
public class FindMinMaxInArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF AN ARRAY");
		int size = sc.nextInt();
		int[] number = new int[size];
		for(int i=0;i<size;i++){
			number[i]=sc.nextInt();	
		}
		int min = number[0];
		int max = number[0];
		for(int i = 0;i<number.length;i++){
		min=Math.min(min,number[i]);
		max = Math.max(max,number[i]);
		}System.out.println(min);
		System.out.println(max);

	}
}