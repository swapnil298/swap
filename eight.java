
import java.util.*;
import java.lang.*;
import java.io.*;

class eight
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		System.out.println("Enter the number :");
		
		int i = 1;
		int sum = 0;
		
		while(i<=input){
			sum = sum +i;
			i++;
		}
		System.out.println("Sum of "+input+" is " +sum);
	}
}