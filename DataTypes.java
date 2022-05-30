
public class DataTypes {
	public static void main(String[] args)
	{
		boolean flag; // default is false
		boolean flag1=true;
		
		if(flag1)
		{
			System.out.println("Ashish");
		}
		
		char ch='A'; // 2 bytes of memory 
		System.out.println(ch);
		
		byte a=1;     // 1 byte of memory, int 4 bytes, long 8bytes
		System.out.println(a);
		
		float f =3.432f;// we have to write f for float, size 4 bytes, 7 to 8 decimal places 
		double d = 2.231233; // size 8 bytes,15-16 decimal places
		System.out.println(f);
		
		//typecasting
		
		double dou=9.87;
		
		long lon=(long)dou;// Narrowing the scope 
		
		
		System.out.println(lon);
		
		// relation and logical operators
		int x=10,y=20,z=30;
		System.out.println(x<y && y<z);
		System.out.println(!(x<y));
		
	}

}
