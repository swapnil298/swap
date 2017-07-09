
import java.util.*;
import java.lang.*;
import java.io.*;

class Fifth
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if(num1<num2){
			if(num2<num3){
				System.out.println("Largest num is 3rd :" + num3);
			}else{
				System.out.println("Largest num is 2nd :" + num2);
			}
		}else{
				System.out.println("Largest num is 1st :" + num1);
			}
	}
}