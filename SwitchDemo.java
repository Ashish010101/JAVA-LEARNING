
import java.util.Scanner; 
public class SwitchDemo {

	public static void main(String[] args) {
		
		/* 1. Deposit Amount
		 * 2. Withdraw Amount
		 * 3. Check Amount 
		 * " Please Enter correct option"
		 */
		System.out.println("Enter your Choice");
		Scanner object= new Scanner(System.in);
		int input= object.nextInt();
		
		switch(input)
		{
		case 1:
			System.out.println("Deposit");
			break;
		case 2:
			System.out.println("Withdraw");
			break;
		case 3:
			System.out.println("Balance Check");
			break;
		default:
			System.out.println("Enter Choice between 1 to 3");
		}

	}

}
