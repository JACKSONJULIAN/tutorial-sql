package Tread;

public class FullName 
{
public static void main(String s[]) {
	try {
		int length=s[0].length()+s[1].length();
		if(length<10)
			return;
		System.out.println("name length must be < 20");
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("2 command line arguments required");
	}
	finally {
		System.out.println(" Thank you");
	}
}
}
