import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) {
		
		Scanner inputObj= new Scanner(System.in); // use Scanner class to enter anything from console
		int inpObj=0;
		
		/*System.out.println("Enter a integer");
		inpObj=inputObj.nextInt();
		System.out.println("The integer is "+ inpObj); */
		
		// Reading First Name
		
		/*System.out.println("Enter Your Name");
		String name =inputObj.next();
		System.out.println("Your Name is "+ name);*/
		
		// REading full string
		

		System.out.println("Enter Your Full Name");
		String name1 =inputObj.nextLine();
		System.out.println("Your Name is "+ name1);
		
		
		

	}

}
