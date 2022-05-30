
public class LoopDemo {

	public static void main(String[] args) {
		
    // Print odd numbers from 1 to 20
	/*	System.out.println("1");
		System.out.println("3");
		System.out.println("5");
		System.out.println("7");
		System.out.println("9");
		System.out.println("11");
		System.out.println("13");
		System.out.println("15");
		System.out.println("17");
		System.out.println("19"); */
		
	// loops -> for, while,do while
	
		int index=1;
		
		for(index=1;index<=20;index++)
		{
		    if(index%2==1)
		    	System.out.println(index);
		      
	     }
		
		index=0;
		
		while(index<=20)
		{
			if(index%2==0)
				System.out.println(index);
			index++;
		}

}
}