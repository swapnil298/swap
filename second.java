import java.util.*;
import java.lang.*;

public class Second {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       int input = scan.nextInt();
       
       if(input%2 == 0){
           System.out.println("No. is even");
       }else{
           System.out.println("No is odd");
       }
    }
}