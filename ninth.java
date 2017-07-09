
import java.util.*;
import java.lang.*;
import java.io.*;

class ninth
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		System.out.println("Enter the number :");
		
		int sum = 0;
		
		for(int i = 1; i<=input; i++){
			sum = sum +i;
		}
		System.out.println("Sum of "+input+" is " +sum);
	}
}