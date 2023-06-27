import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int menu_choice;
		boolean accExists = false;
		boolean passwordExists = false;
		int acnoMatchedIndex = 0;

		//acno password array
		long [] acno = {99998888, 99997777, 11112222, 22223333} ;
		int [] password = {7812, 9812, 1234, 2345};
		
		//
		
		//acno input from user
		System.out.println("ENTER YOUR ACCOUNT NUMBER:");
		long usan= input.nextLong();
		//

		//search for user entered account number - if exists in our database
		for(int i=0; i < acno.length; i++){
			if(usan == acno[i]){
				accExists = true; //if exists set accExists variable to true
				acnoMatchedIndex = i;
				break;
			}
		}
		

		if(accExists){
			//get password from user
			System.out.println("ENTER YOUR PASSWORD:");
			int user_password = input.nextInt();
			//

			if(user_password == password[acnoMatchedIndex]){
				passwordExists = true;
				
			}
				
				if(passwordExists){
					do{
						System.out.println("1.DEPOSIT");
						System.out.println("2.WITHDRAW");
						System.out.println("3.CHECK BALANCE");
						System.out.println("4.EXIT");
						menu_choice = input.nextInt();
						switch(menu_choice) {
						case 1:
							System.out.println("DEPOSTING...");
							break;
						case 2:
							System.out.println("WITHDRAWING");
							break;
						case 3:
							System.out.println("CHECKING AVAILABLE BALANCE...");
							break;
						case 4:
							System.out.println("EXITING");
							break;
						default:
							System.out.println("Invalid input...");
					     }
				       }while(menu_choice != 4);

				}else{
				       System.out.println("Incorrect PASSWORD");
			      }
		}else{
			System.out.println("Invalid acno");
		}
			
	}
	
}

//99998888777774444
//7812
//amout