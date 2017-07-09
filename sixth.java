
import java.util.*;
import java.lang.*;
import java.io.*;

class Sixth
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		System.out.println("Enter the year");
		
		if(input%4 == 0){
			System.out.println("It is a leap year");
		}else{
			System.out.println("It is not a leap year");
		}
	}
}