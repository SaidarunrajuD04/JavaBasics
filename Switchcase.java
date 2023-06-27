import java.util.Scanner;
public class Switchcase{
	public static void main(String[] args){
		String dept;
		Scanner input = new Scanner(System.in);
		System.out.println("ENTER YOUR YEAR");
		int year = input.nextInt();
		input.nextLine();
		System.out.println("ENTER YOUR DEPT:");
		dept = input.nextLine();
		switch(year){
			case 1: System.out.println("English,maths,physics");
			break;

			case 2:
				switch(dept){
					case "cse":
						System.out.println("2nd year cse dept subjects");
						break;
					case "ece":
						System.out.println("2nd year ece dept subjects");
						break;
					case "mech":
						System.out.println("2nd year mech dept subjects");
						break;
				}
			break;
			case 3:
				switch(dept){
					case "cse":
						System.out.println("2nd year cse dept subjects");
						break;
					case "ece":
						System.out.println("2nd year ece dept subjects");
						break;
					case "mech":
						System.out.println("2nd year mech dept subjects");
						break;
		
				}
			break;
			case 4:
				switch(dept){
					case "cse":
						System.out.println("2nd year cse dept subjects");
						break;
					case "ece":
						System.out.println("2nd year ece dept subjects");
						break;
					case "mech":
						System.out.println("2nd year mech dept subjects");
						break;
				}
			break;
			
		}

		
		
	}	

	
}