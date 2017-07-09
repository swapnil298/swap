
import java.util.*;
import java.lang.*;
import java.io.*;

class Third
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		char input = scan.next().charAt(0);
		
		char v1 = 'a';
		char v2 = 'e';
		char v3 = 'i';
		char v4 = 'o';
		char v5 = 'u';
		
		switch(input){
			case 'a':
				System.out.println("It is a vowel");
				break;
			case 'e':
				System.out.println("It is a vowel");
				break;
			case 'i':
				System.out.println("It is a vowel");
				break;
			case 'o':
				System.out.println("It is a vowel");
				break;
			case 'u':
				System.out.println("It is a vowel");
				break;
			default:
				System.out.println("It is not a vowel");
		}
	}
}