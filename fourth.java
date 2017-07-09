
import java.util.*;
import java.lang.*;
import java.io.*;

class Fourth
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		char input = scan.next().charAt(0);
		
		System.out.println("It is a alphabet :" + Character.isLetter(input));
	}
}