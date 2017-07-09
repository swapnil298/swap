
import java.util.*;
import java.lang.*;
import java.io.*;

class tenth
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println("Enter the number :");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		
		int i =0;
		
		while(input>0){
			input = input/10;
			i++;
		}
		System.out.println("Number of digits :" +i);
	}
}