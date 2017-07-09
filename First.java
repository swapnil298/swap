import java.util.*;
import java.lang.*;

public class First {
    public static void main(String[] args){
    
       Scanner scan = new Scanner(System.in);
       int input = scan.nextInt();
       
       if(input == 0){
       System.out.println("No. is zero");
       }else if (input < 0){
           System.out.println("No. is negetive");
       }else if (input > 0){
           System.out.println("No. is positive");
       }
    }
}